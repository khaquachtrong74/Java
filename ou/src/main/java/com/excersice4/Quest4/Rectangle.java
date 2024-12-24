package com.excersice4.Quest4;

public class Rectangle implements Movable{
// x, y la point2d
// a : chieu dai | b : chieu rong
    private double x,y,a,b;

    public Rectangle(double x, double y, double a, double b) {
        this.x = x;
        this.y = y;
        this.a = a;
        this.b = b;
    }


    @Override
    public void moveUp() {
        // TODO Auto-generated method stub

        // throw new UnsupportedOperationException("Unimplemented method 'moveUp'");
        if(y >= 0 && y <= b){
            this.y++;
        }
    }

    @Override
    public void moveDown() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'moveDown'");
        if(y >= 0 && y <= b){
            this.y++;
        }
    }

    @Override
    public void moveLeft() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'moveLeft'");
        if(x >= 0 && x <= a){
            this.x--;
        }
    }

    @Override
    public void moveRight() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'moveRight'");
        if(x >= 0 && x <= a){
            this.x++;
        }
    }

}
