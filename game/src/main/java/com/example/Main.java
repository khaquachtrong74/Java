package com.example;

import javax.swing.JFrame;
public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        // set Exit
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // prohibit reset size
        window.setResizable(false);// tranh viec chinh kich co
        // name
        window.setTitle("Learning make game");
        // Panel game
        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);
        window.pack();

        window.setLocationRelativeTo(null);
        window.setVisible(true);
    
        // start gamethread
        gamePanel.startGameThread();

    }
}