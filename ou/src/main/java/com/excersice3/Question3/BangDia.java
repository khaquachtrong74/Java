package com.excersice3.Question3;

public class BangDia extends SanPham{
    private double doDaiPhat;
    public BangDia(String tenSanPham, String moTaSanPham, String nhaSanXuat, double giaBan, double doDai) {
        super(tenSanPham, moTaSanPham, nhaSanXuat, giaBan);
        this.doDaiPhat = doDai;
    }
    @Override
    public String toString(){
        return "Bang dia\n"+String.format("%.5f", doDaiPhat)  + chung();
    } 

}
