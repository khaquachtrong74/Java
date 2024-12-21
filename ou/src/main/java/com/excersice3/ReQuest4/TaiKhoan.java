package com.excersice3.ReQuest4;

public abstract class TaiKhoan {
    private static int dem;

    public static int getDem() {
        return dem;
    }

    public static void setDem(int dem) {
        TaiKhoan.dem = dem;
    }
    protected String soTaiKhoan = String.format("%05d", dem++);
    protected double soTien;
    private final String tenTaiKhoan;

    public TaiKhoan(double soTien, String tenTaiKhoan) {
        this.soTien = soTien;
        this.tenTaiKhoan = tenTaiKhoan;
    }

    
    public void hienThi() {
        // return super.toString();
        System.out.println(String.format("Ten: %s\nSo Tien hien co: %.4f\nSo tai khoan : %s ",
        this.tenTaiKhoan, this.soTien, this.soTaiKhoan));
    }

    public abstract boolean isDaoHan();
    
    public void napTien(double soTien){
        if (isDaoHan())
            this.soTien += soTien;
    }    
    
    public void rutTien(double soTien){
        if(this.soTien - soTien >= 0 && isDaoHan()){
            this.soTien -= soTien;
        }
    }

    public String getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public void setSoTaiKhoan(String soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }

    public double getSoTien() {
        return soTien;
    }

    public void setSoTien(double soTien) {
        this.soTien = soTien;
    }
    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        TaiKhoan a = (TaiKhoan) obj;
        // return super.equals(obj);
        return this.getSoTaiKhoan().equals(a.getSoTaiKhoan());
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
    
}
