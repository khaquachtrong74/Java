/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tan.bth2;

import java.time.Clock;

/**
 *
 * @author admin
 */
public class Diem {
    private double hoanhDo;
    private double tungDo;
    
    public Diem(double hoanhDo,double tungDo){
        this.hoanhDo = hoanhDo; 
        this.tungDo = tungDo;
    }
    public void Hienthi(){
        System.out.printf("(%.1f,%.1f)\n",this.hoanhDo,this.tungDo);
    }
    public double Khoangcach(Diem d){
        return Math.pow(this.hoanhDo - d.hoanhDo,2)- Math.pow(this.tungDo-d.tungDo, 2);
    }
    /**
     * @return the hoanhDo
     */
    public double getHoanhDo() {
        return hoanhDo;
    }

    /**
     * @param hoanhDo the hoanhDo to set
     */
    public void setHoanhDo(double hoanhDo) {
        this.hoanhDo = hoanhDo;
    }

    /**
     * @return the tungDo
     */
    public double getTungDo() {
        return tungDo;
    }

    /**
     * @param tungDo the tungDo to set
     */
    public void setTungDo(double tungDo) {
        this.tungDo = tungDo;
    }
    
}
