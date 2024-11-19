/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tan.bth2;

/**
 *
 * @author admin
 */
public class HinhTron {
    private Diem Tam;
    private double banKinh;
    
    public HinhTron(Diem Tam, double banKinh) {
        this.Tam = Tam;
        this.banKinh = banKinh;
    }
    
    public double chuvi(){
        return 2*this.banKinh*Math.PI;
    }
    
    public double dienTich(){
        return Math.pow(this.banKinh,2)*Math.PI;
    }
    public double vttd(Diem d){
        double kc = d.Khoangcach(this.Tam);
        return kc-this.banKinh;
    }
    public double vttd(HinhTron d){
        double kc = d.Tam.Khoangcach(this.Tam);
        return kc-this.banKinh;
    }
    /**
     * @return the Tam
     */
    public Diem getTam() {
        return Tam;
    }

    /**
     * @param Tam the Tam to set
     */
    public void setTam(Diem Tam) {
        this.Tam = Tam;
    }

    /**
     * @return the banKinh
     */
    public double getBanKinh() {
        return banKinh;
    }

    /**
     * @param banKinh the banKinh to set
     */
    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }
    
    
}
