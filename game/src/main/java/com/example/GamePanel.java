/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.example;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

// use thread
class GamePanel extends JPanel implements Runnable {
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

    public GamePanel() {
        // set size of panel
        this.setPreferredSize(new java.awt.Dimension(screenWidth, screenHeight));
        this.setDoubleBuffered(true);

        // handel key press by user
        this.addKeyListener(keyH);
        // Event focus
        this.setFocusable(true);
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
        if (keyH.upPressed) {
            playerY -= playerSpeed;
        } else if (keyH.downPressed) {
            playerY += playerSpeed;
        } else if (keyH.leftPreassed) {
            playerX -= playerSpeed;
        } else if(keyH.rightPressed) {
            playerX += playerSpeed;
        }

    }

    // JPannel : use to draw
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // change graphics -> graphics2D
        Graphics2D g2 = (Graphics2D) g;
        // set colors
        g2.setColor(Color.red);
        // draw rectangle _ player
        g2.fillRect(playerX, playerY, tileSize, tileSize);
        g2.dispose();
    }

}
