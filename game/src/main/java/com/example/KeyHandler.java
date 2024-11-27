package com.example;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener{
    public boolean upPressed, downPressed, leftPreassed, rightPressed;
    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();  
        if(code == KeyEvent.VK_W){
            System.out.println("Press : W ");
            upPressed=true;
        } if(code == KeyEvent.VK_S){
            System.out.println("Press : S ");
            downPressed=true;
        } if(code == KeyEvent.VK_A){
            System.out.println("Press : A ");
            leftPreassed=true;
        } if(code == KeyEvent.VK_D){
            System.out.println("Press : D ");
            rightPressed=true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();
        if(code == KeyEvent.VK_W){
            upPressed=false;
        } if(code == KeyEvent.VK_S){
            downPressed=false;
        } if(code == KeyEvent.VK_A){
            leftPreassed=false;
        } if(code == KeyEvent.VK_D){
            rightPressed=false;
        }
    }
    
}
