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
    final static int originalTileSize = 16; // 16x16 default size of player and npc.
    final static int scale = 3;
    final static int tileSize = originalTileSize * scale; // 48x48
    final static int maxScreenCol = 16;
    final static int maxScreenRow = 12;
    final static int screenWidth = tileSize * maxScreenCol; // 768 pixels
    final static int screenHeight = tileSize * maxScreenRow; // 576 pixels
    final static int worldWidth = 2000;
    final static int worldHeight = 2000;
    int point = 0;
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
    // add Map
    private Map map;
    private int offSetX = 0;
    private int offSetY = 0;
    // player and objects
    private Player player;
    private Terminater terminater;
    private Line line;
    private Line line2;
    private Camera camera;
    // private Camera camera = new Camera(0,0, 300, 300,Color.white,"camera",
    // screenWidth, screenHeight);
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

        // handle map
        this.map = new Map(100, 100, 32, 32);// width-height:100 with 32 cell
        this.map.generateMap();

        // line
        this.line = new Line(20, 300, 200, 50, Color.orange, "Line");
        this.line2 = new Line(400, 300, 200, 50, Color.orange, "Line2");

        this.camera = new Camera(screenWidth, screenHeight, worldWidth, worldHeight);
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

        // nanoseconds : caculate time to go new repaint or new update
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
            // camera.update(player.getPosX(), player.getPosY());

            repaint(); // call paintComponent
            // check to next draw time

            // Sleep to create a space for update and repaint
            try {
                double remainingTime = nextDrawTime - System.nanoTime();
                remainingTime /= 1000000;
                if (remainingTime < 0)
                    remainingTime = 0;
                Thread.sleep((long) remainingTime);
                nextDrawTime += drawInterval;
            } catch (InterruptedException ex) {
            }
        }
        point++;
    }

    public static int getScreenWidth() {
        return screenWidth;
    }

    public static int getScreenHeight() {
        return screenHeight;
    }

    // handel Key press by player
    public void update() {
        if (gameOver)
            return; // stop if game is over
        Physics review = new Physics();
        if (!review.check(player, line))
            gameOver = true;

        if (keyH.spacePressed) {
            player.move(0, (int) (-playerSpeed * 1.5));
        }
        // player.move(playerSpeed/2,0);

        if (keyH.upPressed) {
            player.move(0, -playerSpeed);

            // playerY -= playerSpeed;
        } else if (keyH.downPressed) {
            player.move(0, playerSpeed);

            // playerY += playerSpeed;
        } else if (keyH.leftPreassed) {
            player.move(-playerSpeed, 0);
            camera.update(player.getPosX(), player.getPosY());
            repaint();
            // playerX -= playerSpeed;
        } else if (keyH.rightPressed) {
            player.move(playerSpeed, 0);
            camera.update(player.getPosX(), player.getPosY());
            repaint();
            // playerX += playerSpeed;
        }
        repaint();
    }

    // JPannel : use to draw
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // change graphics -> graphics2D
        Graphics2D g2 = (Graphics2D) g;
        // draw map
        offSetX = camera.getX();
        offSetY = camera.getY();
        map.draw(g2, offSetX, offSetY);
        line.draw(g2);
        line2.draw(g2);

        // draw obj
        player.draw(g2);

        terminater.draw(g2);

        // check if 2 objects is touch
        if (terminater.getBounds().intersects(player.getBounds())) {
            System.out.println("Game Over!");
            gameOver = true;
        }
        g2.setColor(Color.PINK);
        g2.setFont(new Font("Arial", Font.ITALIC, 15));
        g2.drawString(String.format("Point: %d", point), 100, 100);
        if (gameOver) {
            g2.setColor(Color.black);
            g2.setFont(new Font("Arial", Font.BOLD, 20));
            g2.drawString("Game Over, Cut nhe!", 250, 250);
        }

        g2.dispose();
    }

    // Handle terminal move up and down
    @Override
    public void actionPerformed(ActionEvent e) {
        if (gameOver)
            return;
        terminater.move(0, terminaterSpeed);
        if (terminater.getPosY() <= 0 || terminater.getPosY() >= getHeight() - terminater.getWidth()) {
            terminaterSpeed = -terminaterSpeed; // Change direction
        }
        point++;
        repaint();
    }

}
