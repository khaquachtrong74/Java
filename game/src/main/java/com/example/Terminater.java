package com.example;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class Terminater extends Obj{

    public Terminater() {
        super(0, 0, 0, 0, null, null);
    }
    
    public Terminater(int posX, int posY, int diameter, Color color, String name) {
        super(posX, posY, diameter, diameter, color, name);
    }

    public int getDiameter(){
        return super.getWidth();
    }    
    @Override
    public void draw(Graphics2D g) {
        // throw new UnsupportedOperationException("Not supported yet.");
        g.setColor(this.getColor());
        g.fillOval(this.getPosX(), this.getPosY(), this.getTileSize(), this.getTileSize());

        g.setColor(Color.DARK_GRAY);
        g.setFont(new Font("Arial", Font.PLAIN, 12));
        g.drawString(getName(), getPosX() + getDiameter()/2 - g.getFontMetrics().stringWidth(getName()),
        getPosY() + getDiameter() + 15);
    }

    @Override
    public Ellipse2D getBounds() {
        // throw new UnsupportedOperationException("Not supported yet.");
        return new Ellipse2D.Double(this.getPosX(), this.getPosY(), this.getTileSize(), this.getTileSize());
    }
    
}
