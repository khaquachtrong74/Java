package com.example;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Player extends Obj{
    public Player() {
        super(0, 0, 0, 0, null, null);
    }
    // default player at x:100; y:100
    public Player(int posX, int posY, int width, int height, Color color, String name) {
        super(posX, posY, width, height, color, name);
        
    }

    


    @Override
    public void draw(Graphics2D g) {
        //throw new UnsupportedOperationException("Not supported yet.");
        g.setColor(this.getColor());
        g.fillRect(this.getPosX(), this.getPosY(),this.getTileSize(), this.getTileSize());

        // get Name
        g.setColor(Color.BLUE);
        g.setFont(new Font("Arial", Font.PLAIN, 12));
        // String name, int x, int y
        g.drawString(getName(), getPosX() + getWidth() / 2 - g.getFontMetrics().stringWidth(getName())/2,
        getPosY() + getHeight()+15);
    }
    

    @Override
    public Rectangle getBounds() {
        // throw new UnsupportedOperationException("Not supported yet.");
        return new Rectangle(this.getPosX(), this.getPosY(),this.getTileSize(), this.getTileSize());
    }
    
}
