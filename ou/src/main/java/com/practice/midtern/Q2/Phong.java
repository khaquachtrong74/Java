package com.practice.midtern.Q2;

public abstract class Phong {

    private static int dem;
    private String maPhong = String.format("ROOM-%05d", dem++);
    private double dienTich;
    private DatPhong datPhong;

    public static int getDem() {
        return dem;
    }
    public String getMaPhong() {
        return maPhong;
    }
    public double getDienTich() {
        return dienTich;
    }
    public Phong(double dienTich) {
        this.dienTich = dienTich;
    }
    public abstract double tinhGiaPhong();

    public void hienThi(){
        System.out.printf("Ma Phong : %s\n", this.maPhong);
        System.out.printf("Dien tich phong : %.1f\n", this.dienTich);
    }
    public DatPhong getDatPhong() {
        return datPhong;
    }
    public void setDatPhong(DatPhong datPhong) {
        this.datPhong = datPhong;
    }
}
