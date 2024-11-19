/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tan.bth2;

/**
 *
 * @author admin
 */
public class HinhChuNhut {
    private Diem diemTrai;
    private Diem diemPhai;

    public HinhChuNhut(Diem diemTrai, Diem diemPhai) throws Exception {
        if(diemTrai.getHoanhDo() <= diemPhai.getHoanhDo() && diemTrai.getTungDo() >= diemPhai.getTungDo()){
            this.diemTrai = diemTrai;
            this.diemPhai = diemPhai;
    }else
            throw new Exception("Invalid data");
    }
    public double chieuDai(){
        return (this.diemTrai.getHoanhDo()-this.diemPhai.getHoanhDo());
    }
    public double chieuRong(){
        return (this.diemPhai.getTungDo()-this.diemTrai.getTungDo());
    }
    public double dienTich(){
        return this.chieuDai()*this.chieuRong();
    }
    public double chuVi(){
        return (this.chieuDai()+this.chieuRong())*2;
    }
    /**
     * @return the diemTrai
     */
    public Diem getDiemTrai() {
        return diemTrai;
    }

    /**
     * @param diemTrai the diemTrai to set
     */
    public void setDiemTrai(Diem diemTrai) {
        this.diemTrai = diemTrai;
    }

    /**
     * @return the diemPhai
     */
    public Diem getDiemPhai() {
        return diemPhai;
    }

    /**
     * @param diemPhai the diemPhai to set
     */
    public void setDiemPhai(Diem diemPhai) {
        this.diemPhai = diemPhai;
    }
    
}
