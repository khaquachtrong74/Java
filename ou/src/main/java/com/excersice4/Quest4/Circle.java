package com.excersice4.Quest4;

public class Circle implements Movable{
    private double x,y,r;

    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public Circle() {
    }

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


}
