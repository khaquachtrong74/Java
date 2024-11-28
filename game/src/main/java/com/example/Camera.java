package com.example;

public class Camera {
    private int x;
    private int y;
    private int viewportWidth;
    private int viewportHeight;
    private int worldWidth;
    private int worldHeight;

    public Camera(int viewportWidth, int viewportHeight, int worldWidth, int worldHeight) {
        this.x = 0;
        this.y = 0;
        this.viewportWidth = viewportWidth;
        this.viewportHeight = viewportHeight;
        this.worldWidth = worldWidth;
        this.worldHeight = worldHeight;
    }
    public void update(int targetX, int targetY){
        // int borderX = 100;
        x = targetX - viewportWidth/2;
        y = targetY - viewportHeight/2;

        x = Math.max(0,Math.min(x, worldWidth - viewportWidth));
        y = Math.max(0,Math.min(y, worldHeight-viewportHeight));
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getViewportHeight() {
        return viewportHeight;
    }

    public int getViewportWidth() {
        return viewportWidth;
    }

    
}
