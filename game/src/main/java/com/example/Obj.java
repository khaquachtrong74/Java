package com.example;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Shape;

// use generic
public abstract class Obj<T extends Shape> {
    private int posX;
    private int posY;
    private int width;
    private int height;
    private Color color;
    private String name;
    private final int originalTileSize = 16; // 16x16 default size of player and npc.
    private final int scale = 3;
    private final int tileSize = originalTileSize * scale; // 48x48

    public Obj(int posX, int posY, int width, int height, Color color, String name) {
        this.posX = posX;
        this.posY = posY;
        this.width = width;
        this.height = height;
        this.color = color;
        this.name = name;
    }

    public void move(int dx, int dy) {
        this.posX += dx;
        this.posY += dy;
    }

    protected int getPosX() {
        return posX;
    }

    protected int getPosY() {
        return posY;
    }

    protected Color getColor() {
        return color;
    }

    protected int getTileSize() {
        return tileSize;
    }
    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    /**
     * Belong to Obj
     * @return 
    */
    public int getWidth() {
        return width;
    }
    /**
     * belong to Obj
     * @return
    */
    public int getHeight() {
        return height;
    }

    public int getOriginalTileSize() {
        return originalTileSize;
    }

    public int getScale() {
        return scale;
    }

    public abstract void draw(Graphics2D g);

    public abstract T getBounds();

    public String getName() {
        return name;
    }
}
