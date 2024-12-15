package com.learn;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {

        JFrame jFrame = new JFrame();
        MainMenu mainMenu = new MainMenu(jFrame);

        jFrame.setResizable(false);
        jFrame.setSize(800,600);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.add(mainMenu);
        jFrame.setLocationRelativeTo(null); // đặt vị trí trung tâm
        jFrame.setVisible(true); // Hiện thị khung hìnhs
        
    }
}