package com.learn.objects;

import java.awt.Graphics2D;
import java.awt.Shape;

public abstract  class Mob<T extends Shape> {
    private int posX;
    private int posY;
    protected int mobWidth;
    protected int mobHeight;
    protected int mobSpeed;
    protected String name;
    public Mob() {
    }


    public Mob(int posX, int posY, int mobWidth, int mobHeight, int mobSpeed, String name) {
        this.posX = posX;
        this.posY = posY;
        this.mobWidth = mobWidth;
        this.mobHeight = mobHeight;
        this.mobSpeed = mobSpeed;
        this.name = name;
    }
    
    public int getPosX() {
        return posX;
    }
    public int getPosY() {
        return posY;
    }
    public int getMobWidth() {
        return mobWidth;
    }
    public int getMobHeight() {
        return mobHeight;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }
    
    public int getMobSpeed() {
        return mobSpeed;
    }


    public String getName() {
        return name;
    }


    public abstract void draw(Graphics2D g);
    public abstract void move(int dx, int dy);
    public abstract T getBounds();
    public void setMobSpeed(int mobSpeed) {
        this.mobSpeed = mobSpeed;
    }
}
