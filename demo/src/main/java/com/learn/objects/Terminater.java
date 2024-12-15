package com.learn.objects;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

@SuppressWarnings("rawtypes")
public class Terminater extends Mob{

    public Terminater() {
    }

    public Terminater(int posX, int posY, int mobWidth, int mobHeight, int mobSpeed, String name) {
        super(posX, posY, mobWidth, mobHeight, mobSpeed, name);
    }

    @Override
    public void draw(Graphics2D g) {
        // throw new UnsupportedOperationException("Not supported yet.");
        g.setColor(Color.ORANGE);
        g.fillRect(getPosX(), getPosY(), getMobWidth(), getMobHeight());
        g.setColor(Color.RED);
        g.drawString(getName(),getPosX(), getPosY()+getMobHeight()*2);
    }

    @Override
    public void move(int dx, int dy) {
        // throw new UnsupportedOperationException("Not supported yet.");
        this.setPosX(dx*2+this.getPosX());
        this.setPosY(dy*2+this.getPosY());
    }

    @Override
    public Rectangle getBounds() {
        // throw new UnsupportedOperationException("Not supported yet.");
        return new Rectangle(getPosX(),getPosY(),getMobWidth(),getMobHeight());
    }

}
