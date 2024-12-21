package com.excersice3.ReQuest5;

public abstract class NhanVien {
    private static int dem;

    public static int getDem() {
        return dem;
    }

    public static void setDem(int dem) {
        NhanVien.dem = dem;
    }
    private String maSo=String.format("MA-NHAN-VIEN: %05d", dem++);
    private String hoTen;
    private String chungMinhND;
    private String queQuan;
    
    public NhanVien(String hoTen, String chungMinhND, String queQuan) {
        this.hoTen = hoTen;
        this.chungMinhND = chungMinhND;
        this.queQuan = queQuan;
    }

    public NhanVien() {
    }

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getChungMinhND() {
        return chungMinhND;
    }

    public void setChungMinhND(String chungMinhND) {
        this.chungMinhND = chungMinhND;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }
    public abstract double tinhLuong(int soNgayCong);
    @Override
    public String toString() {
        return String.format("Ma so: %s\nHo ten: %s \n Que quan: %s\n", maSo, hoTen, queQuan);
    }
    /*
     * Nhap HO ten 
     * Hoac que quan de tim kiem
     */

    @Override
    public boolean equals(Object obj) {
        NhanVien other = (NhanVien) obj;
        return this.getHoTen().equals(other.getHoTen());

        // return this.getHoTen().equals(obj.);
    }

    @Override
    public int hashCode() {
        // return super.hashCode();
        int hash = super.hashCode();
        int key = hash * this.getHoTen().hashCode();
        return key;
    }

}
