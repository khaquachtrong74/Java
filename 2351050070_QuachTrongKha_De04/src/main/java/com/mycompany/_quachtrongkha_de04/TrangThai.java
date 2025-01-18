/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._quachtrongkha_de04;

/**
 *
 * @author admin
 */
public class TrangThai {
    private String color;
    private boolean isNhanNhiemVu;

    public TrangThai(String color, boolean isNhanNhiemVu) {
        this.color = color;
        this.isNhanNhiemVu = isNhanNhiemVu;
    }
    /*
        Idel - xanh duong nhat
            bool true
        Delivering
            Co dia chi
            Thoi gian du kien hoan thanh
            bool false
        Maintenance
            Thoi gina du kien hoan thanh
            bool false
    */

    
    @Override
    public String toString() {
//        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        return String.format("Mau: %s\nNhan nhiem vu : %s", this.getColor(), this.isIsNhanNhiemVu());
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the isNhanNhiemVu
     */
    public boolean isIsNhanNhiemVu() {
        return isNhanNhiemVu;
    }

    /**
     * @param isNhanNhiemVu the isNhanNhiemVu to set
     */
    public void setIsNhanNhiemVu(boolean isNhanNhiemVu) {
        this.isNhanNhiemVu = isNhanNhiemVu;
    }
    
}
