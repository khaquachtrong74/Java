package com.learn.objects;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

public class Ball extends Mob{

    public Ball() {
    }

    public Ball(int posX, int posY, int mobWidth, int mobHeight, int mobSpeed, String name) {
        super(posX, posY, mobWidth, mobHeight, mobSpeed, name);
    }

    


    @Override
    public void draw(Graphics2D g) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'draw'");
        g.setColor(Color.red);
        g.fillOval(this.getPosX(), this.getPosY(), mobWidth, mobHeight);
        g.setFont(new Font("Arial", Font.PLAIN, 20));
        g.setColor(Color.black);
        // g.drawString(this.getName(), this.getPosX(), this.getPosY());
        g.drawString(getName(), getPosX(),
                getPosY() + getMobHeight() * 2);
    }

    @Override
    public void move(int dx, int dy) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'move'");
        this.setPosX(this.getPosX()+dx);
        this.setPosY(this.getPosY()+dy);
    }

    @Override
    public Shape getBounds() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'getBounds'");
        return new Ellipse2D.Double(this.getPosX(), this.getPosY(), this.getMobWidth(), this.getMobHeight());
    }

}
