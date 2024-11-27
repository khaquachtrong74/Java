/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.example;
 
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

// use thread
class GamePanel extends JPanel implements Runnable, ActionListener {
    // SCREEN SETTINGS
    final int originalTileSize = 16; // 16x16 default size of player and npc.
    final int scale = 3;
    final int tileSize = originalTileSize * scale; // 48x48
    final int maxScreenCol = 16;
    final int maxScreenRow = 12;
    final int screenWidth = tileSize * maxScreenCol; // 768 pixels
    final int screenHeight = tileSize * maxScreenRow; // 576 pixels

    KeyHandler keyH = new KeyHandler();
    Thread gameThread;// draw 60 times in seconds

    // FPS
    int FPS = 60;

    // set player's default position
    int playerX = 100;
    int playerY = 100;
    int playerSpeed = 4;


    // set terminater's default position
    int terminaterX = 300;
    int terminaterY = 150;
    int terminaterSpeed = 7;    



    // player and objects
    private Player player;
    private Terminater terminater;

    // set up for terminal move
    private Timer timer;

    // stage Game
    private boolean gameOver = false; 

    public GamePanel() {
        // set size of panel
        this.setPreferredSize(new java.awt.Dimension(screenWidth, screenHeight));
        this.setDoubleBuffered(true);

        // handel key press by user
        this.addKeyListener(keyH);
        // Event focus
        this.setFocusable(true);
        this.player = new Player(playerX, playerY, tileSize, tileSize, Color.red, "Player 1");
        this.terminater = new Terminater(300, 300, tileSize, Color.BLUE, "Terminater");

        timer = new Timer(30, this);
        timer.start(); // call actionPerformed
    }

    public void startGameThread() {
        // start game thread
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {
        // with method can make game loop
        // LocalDate now = new Locale();

        // nanoseconds  : caculate time to go new repaint or new update
        double drawInterval = 1000000000 / FPS;
        // 0.0166667 seconds then draw again
        // caculate time to go next draw time
        double nextDrawTime = System.nanoTime() + drawInterval;
        // core of game
        while (gameThread != null) {
            // System.out.println("The game loop in running");
            // UPDATE: update information

            // set FPS

            // use nano seconds to know time
            // long currentTime = System.nanoTime();
            // long currentTime2 = System.
            // DRAW: draw the screen with the update information
            update();

            repaint(); // call paintComponent
            // check to next draw time
            

            // Sleep to create a space for update and repaint
            try {
                double remainingTime = nextDrawTime - System.nanoTime();
                remainingTime /=1000000;
                if(remainingTime < 0)
                    remainingTime=0;
                Thread.sleep((long) remainingTime);
                nextDrawTime += drawInterval;
            } catch (InterruptedException ex) {
            }
        }
    }

    // handel Key press by player
    public void update() {
        if(gameOver ) return; // stop if game is over
        if (keyH.upPressed) {
            player.move(0, -playerSpeed);
            // playerY -= playerSpeed;
        } else if (keyH.downPressed) {
            player.move(0, playerSpeed);
            // playerY += playerSpeed;
        } else if (keyH.leftPreassed) {
            player.move(-playerSpeed,0);
            // playerX -= playerSpeed;
        } else if(keyH.rightPressed) {
            player.move(playerSpeed, 0);
            // playerX += playerSpeed;
        }
    }

    // JPannel : use to draw
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // change graphics -> graphics2D
        Graphics2D g2 = (Graphics2D) g;
        
        player.draw(g2);
        
        terminater.draw(g2);

        // check if 2 objects is touch
        if(terminater.getBounds().intersects(player.getBounds())){
            System.out.println("Game Over!");
            gameOver = true;
        }
        if(gameOver){
            g2.setColor(Color.black);
            g2.setFont(new Font("Arial", Font.BOLD, 20));
            g2.drawString("Game Over, Cut nhe!", 250, 250);
        }
        g2.dispose();
    }


    // Handle terminal move up and down
    @Override
    public void actionPerformed(ActionEvent e) {
        if(gameOver) return;
        terminater.move(0,terminaterSpeed);
        if(terminater.getPosY() <= 0 || terminater.getPosY() >= getHeight() - terminater.getWidth()){
            terminaterSpeed = - terminaterSpeed; // Change direction
        }
        repaint();
    }

}
