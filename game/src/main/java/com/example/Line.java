package com.example;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Shape;


public class Line extends Obj{
    public Line(int posX, int posY, int width, int height, Color color, String name) {
        super(posX, posY, width, height, color, name);
    }
    
    @Override
    public void draw(Graphics2D g) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'draw'");
        g.setColor(Color.orange);
        g.fillRect(this.getPosX(), this.getPosY(), this.getWidth(), this.getHeight());

    }

    @Override
    public Shape getBounds() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getBounds'");
    }

}
