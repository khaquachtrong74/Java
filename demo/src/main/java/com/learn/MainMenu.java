package com.learn;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainMenu extends JPanel{

    public MainMenu(JFrame frame) {
        this.setLayout(new BorderLayout());
        
        // Tiêu đề
        JLabel title = new JLabel("Thử nghiệm", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 36));
        title.setForeground(Color.BLUE);
        this.add(title, BorderLayout.NORTH);
    
        //Các nút chức năng
        JPanel buttonPanel = new JPanel(new GridLayout(3,1,10,10));
        JButton playButton = new JButton("Play");
        JButton exitButton = new JButton("Exit");

        buttonPanel.add(playButton);
        buttonPanel.add(exitButton);
        this.add(buttonPanel, BorderLayout.CENTER);

        // Xử lý sự kiện
        playButton.addActionListener(e ->{
            frame.getContentPane().removeAll();
            GamePanel gamePanel = new GamePanel();
            frame.add(gamePanel);
            gamePanel.requestFocusInWindow();
            frame.revalidate();
            frame.repaint();
            
            // start game;
            gamePanel.startGameThread();
        });
        exitButton.addActionListener(e ->{
            System.exit(0);
        });
    }

    
}
