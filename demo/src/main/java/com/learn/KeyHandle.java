package com.learn;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandle implements KeyListener {
    public boolean upPress, downPress, leftPress, rightPress, restartGame;

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'keyTyped'");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'keyPressed'");
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_UP || code == KeyEvent.VK_W) {
            upPress = true;
        }
        if (code == KeyEvent.VK_DOWN || code == KeyEvent.VK_S) {
            downPress = true;
        }
        if (code == KeyEvent.VK_RIGHT || code == KeyEvent.VK_D) {
            rightPress = true;
        }
        if (code == KeyEvent.VK_LEFT || code == KeyEvent.VK_A) {
            leftPress = true;
        }
        if (code == KeyEvent.VK_R) {
            restartGame = true;
        }
        System.out.println("Press" + code);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method
        // 'keyReleased'");
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_UP || code == KeyEvent.VK_W) {
            upPress = false;
        }
        if (code == KeyEvent.VK_DOWN || code == KeyEvent.VK_S) {
            downPress = false;
        }
        if (code == KeyEvent.VK_RIGHT || code == KeyEvent.VK_D) {
            rightPress = false;
        }
        if (code == KeyEvent.VK_LEFT || code == KeyEvent.VK_A) {
            leftPress = false;
        }
        if (code == KeyEvent.VK_R) {
            restartGame = false;
        }
    }

}
