package com.practice.midtern.Q6;

public class SinhVien extends ConNguoi{
    private static int dem;
    public SinhVien(String gioiTinh, String hoTen, String ngaySinh) {
        super(gioiTinh, hoTen, ngaySinh);
        this.maSo = String.format("MSSV-%05d", dem++);
    }
    
}
