package com.learn;

import com.learn.objects.Mob;
import com.learn.objects.Player;
import com.learn.objects.Terminater;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

import com.learn.objects.Ball;

class GamePanel extends JPanel implements Runnable, ActionListener {
    final int screenWidth = 760; // pixel
    final int screenHeight = 600;
    boolean gameOver = false;
    // private boolean isCollidingWithTerminater = false;

    // Mob
    Mob ball;
    Mob player;
    Mob terminater2;
    Map map;
    // Keyhandle
    KeyHandle keyHandle = new KeyHandle();

    // Game thread
    Thread gameThread;
    final int FPS = 60;
    Timer timer;

    public GamePanel() throws HeadlessException {
        // Default of panel
        this.setDoubleBuffered(true);
        this.setPreferredSize(new java.awt.Dimension(screenWidth, screenHeight));

        // Default Mob

        this.player = new Player(screenWidth / 10, 0, 50, 200, 4, "PLayer");
        this.terminater2 = new Terminater(screenWidth - screenWidth / 10, screenHeight - 200, 50, 200, 10,
                "Terminater2");
        this.ball = new Ball(100,100, 50, 50, 5, "Ball");

        this.map = new Map(100, 100, 32, 32);
        this.map.generateMap();
        // settings for automation of terminater
        timer = new Timer(30, this);
        timer.start();// actionPerformed

        // keyhandle
        this.addKeyListener(keyHandle);
        this.setFocusable(true);// addEventListener at keyBoard
        this.requestFocusInWindow();
    }

    // gameThread
    public void startGameThread() {
        gameThread = new Thread(this);
        gameThread.start();
    }

    // from Runnable
    @Override
    public void run() {
        double drawInterval = 1000000000 / FPS;
        double nextDrawTime = System.nanoTime() + drawInterval;

        while (gameThread != null) {
            update(); // Cập nhật vị trí nhân vật
            repaint(); // Vẽ lại màn hình
            try {
                double remainingTime = nextDrawTime - System.nanoTime();
                remainingTime /= 1000000;
                if (remainingTime < 0) {
                    remainingTime = 0;
                }
                Thread.sleep((long) remainingTime);
                nextDrawTime += drawInterval;
            } catch (InterruptedException e) {
            }
        }
    }

    // @Override
    public void update() {
        // System.out.println("Test");
        if (gameOver)
            return;
        if (player.getPosY() < 0) {
            keyHandle.upPress = false;
        }
        if (player.getPosY() + player.getMobHeight() > screenHeight) {
            keyHandle.downPress = false;
        }
        
        if (keyHandle.upPress) {
            terminater2.move(0, -terminater2.getMobSpeed());
        }
        if (keyHandle.downPress) {
            terminater2.move(0, terminater2.getMobSpeed());
        }
        if (keyHandle.restartGame) {
            restartGame();
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        map.draw(g2, 0, 0, this);
        ball.draw(g2);
        player.draw(g2);
        terminater2.draw(g2);
        g2.setColor(Color.BLACK);
        g2.setFont(new Font("Arial", Font.PLAIN, 30));
        // if (player.getHp() == 0) {
        // gameOver = true;
        // }
        if (gameOver) {
            g2.drawString("Game Over!", screenWidth / 2 - 80, screenHeight / 2);
            if (gameThread != null) {
                gameThread = null;
            }
            timer.stop();
            return;
        }

        // g2.drawString(String.format("Your HP: %d", player.getHp()), 50, 50);
        g2.dispose();
    }

    private void restartGame() {
        // player.setHp(3); // Hoặc giá trị khởi đầu
        // player.setPosX(0);
        // player.setPosY(0);
        // terminater.setPosY(0);
        // terminater2.setPosY(screenHeight - 200);
        // gameOver = false;
        // timer.start(); // Khởi động lại Timer
        // startGameThread(); // Bắt đầu lại Thread
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        /*
         * Tự động hoá việc di chuyển của terminater
         */
        // System.out.println("Timer is runing");
        // throw new UnsupportedOperationException("Not supported yet.");
        if (gameOver)
            return;
        int vx = 5;
        int vy = 5;
        ball.setPosX(ball.getPosX() + vx);
        ball.setPosY(ball.getPosY()+vy);
        if(ball.getMobWidth()+ball.getPosY() >= screenHeight ||
        ball.getMobWidth() + ball.getPosY() <= 0){
            vy = -vy;
        }
        if(ball.getMobWidth()+ball.getPosX() <= player.getPosX()+player.getMobWidth()||
        ball.getMobWidth()+ball.getPosX() >= terminater2.getPosX()+terminater2.getMobWidth()){
            vx = -vx;
        }  
        // if(ball > screenWidth){
        //     score++;
        //     restartGame();
        // }
        // if(ball < 0){
        //     player.
        // }

        repaint();
    }

    public int getScreenWidth() {
        return screenWidth;
    }

    public int getScreenHeight() {
        return screenHeight;
    }
}
