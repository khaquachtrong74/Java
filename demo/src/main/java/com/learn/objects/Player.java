package com.learn.objects;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Player extends Mob {
    private int hp = 3;
    public Player() {
    }

    public Player(int posX, int posY, int mobWidth, int mobHeight, int mobSpeed, String name) {
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
        this.setPosX(this.getPosX() + dx);
        this.setPosY(this.getPosY() + dy);
    }

    // @Override
    // public Ellipse2D getBounds() {
    //     // throw new UnsupportedOperationException("Not supported yet.");
    //     return new Ellipse2D.Double(getPosX(), getPosY(), getMobWidth(), getMobHeight());
    // }
    @Override
    public Rectangle getBounds(){
        return new Rectangle(getPosX(), getPosY(), getMobWidth(), getMobHeight());
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }
    
    // public void operations(int maxWidthLeft, int maxWidthRight){
    //     boolean flag = true;
        
    //     if(this.getPosX() + this.getMobWidth() <= maxWidthLeft ){
    //         flag = true;
    //     }
    //     if(this.getPosX() + this.getMobWidth() >= maxWidthRight){
    //         flag = false;
    //     }
    //     if(flag){
    //         this.setPosX(this.getPosX()+this.mobSpeed);
    //         this.setPosY(this.getPosY()-this.mobSpeed);
    //     }
    //     else{
    //         this.setPosX(this.getPosX()-this.mobSpeed);
    //         this.setPosY(this.getPosY()+this.mobSpeed); 
    //     }
    // }
}
