package com.excersice4.Quest4;

public class Point2D implements Movable{

    @Override
    public void moveUp() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'moveUp'");
        this.y++;
    }

    @Override
    public void moveDown() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'moveDown'");
        this.y--;
    }

    @Override
    public void moveLeft() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'moveLeft'");
        this.x--;
    }

    @Override
    public void moveRight() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'moveRight'");
        this.x++;
    }
    private double x, y;
    public Point2D(double x, double y){
        this.x = x;
        this.y = y;
    }


}
