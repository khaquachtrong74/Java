package com.example;

public class Physics {
    public boolean check(Player player, Line line) {

        if (player.getPosY() + line.getHeight() < line.getPosY()){ 
                // || player.getPosX() > line.getPosX() + line.getWidth()) {
            player.move(0, +2);
        }

        return player.getPosY() <= GamePanel.getScreenHeight();
    }
}
