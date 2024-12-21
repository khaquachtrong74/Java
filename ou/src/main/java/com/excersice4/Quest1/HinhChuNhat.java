package com.excersice4.Quest1;

public class HinhChuNhat extends Hinh{
    private double chieuDai;
    private double chieuRong;
    // public HinhChuNhat(double dai, double rong){
    //     this.chieuDai = dai;
    //     this.chieuRong = rong;
    //     // this.setTen("Chu nhat");
    // }

    public HinhChuNhat(String ten, double chieuDai, double chieuRong) {
        super(ten);
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    @Override
    public double tinhDienTich() {
        // throw new UnsupportedOperationException("Not supported yet.");
        return chieuDai*chieuRong;
    }

    @Override
    public double tinhChuVi() {
        // throw new UnsupportedOperationException("Not supported yet.");
        return (chieuDai+chieuRong)*2;
    }
    
}
