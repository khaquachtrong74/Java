package com.practice.midtern.Q6;

public class GiangVien extends ConNguoi{
    private static int dem;
    public GiangVien(String gioiTinh, String hoTen, String ngaySinh) {
        super(gioiTinh, hoTen, ngaySinh);
        this.maSo = String.format("MaGiangVien-%05d", dem++);
    }

}
