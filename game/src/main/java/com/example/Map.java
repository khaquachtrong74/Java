package com.example;

import java.awt.Color;
import java.awt.Graphics2D;

public class Map {
    private int[][] tiles; // marng luu tru map
    private int tileWidth; // kich thuong moi o
    private int tileHeight;
    private int mapWidth; // among number of cell row
    private int mapHeight;

    public Map(int tileWidth, int tileHeight, int mapWidth, int mapHeight) {
        // this.tiles = tiles;
        this.tileWidth = tileWidth;
        this.tileHeight = tileHeight;
        this.mapWidth = mapWidth;
        this.mapHeight = mapHeight;
        this.tiles = new int[mapWidth][mapHeight];
    }

    public void generateMap() {
        for (int i = 0; i < mapWidth; i++) {
            for (int j = 0; j < mapHeight; j++) {
                tiles[i][j] = (i+j)%2;
            }
        }
    }

    public void viewMap() {
        for (int[] tile : tiles) {
            for (int k = 0; k < tile.length; k++) {
                System.out.print(tile[k] + " ");
            }
            System.out.println();
        }
    }

    public void draw(Graphics2D g, int offSetX, int offSetY) {
        for (int x = 0; x < mapWidth; x++) {
            for (int y = 0; y < mapHeight; y++) {
                int screenX = x * tileWidth - offSetX;
                int screenY = y * tileHeight - offSetY;

                if (screenX + tileWidth > 0 && screenY + tileHeight > 0
                        && screenX < GamePanel.getScreenWidth()
                        && screenY < GamePanel.getScreenHeight()) {
                    if (tiles[x][y] == 0) {
                        g.setColor(Color.magenta);// dat
                    } else {
                        g.setColor(Color.blue);
                    }
                    g.fillRect(screenX, screenY, tileWidth, tileHeight);
                }
            }
        }
    }

    public int getMapWidth() {
        return mapWidth;
    }

    public int getMapHeight() {
        return mapHeight;
    }
    public static void main(String[] args) {
        Map test = new Map(100, 100,32, 32);
        test.generateMap();
        test.viewMap();
    }
}
