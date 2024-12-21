package com.excersice3.ReQuest5;

public class demo {
    public static void main(String[] args) {
        // System.out.println("Hello World!");
    
        NhanVien t = new NhanVienBPA("KASli", "23412342", "AnGA");
        NhanVien a = new NhanVienBPA("B", "23131241", "HaiDuong");
        NhanVien b = new NhanVienBPB("C", "11112311", "HoLo");
        NhanVien c = new NhanVienBinhThuong("BC", "76424512", "BacGiang");
        NhanVien d = new NhanVienBPC("B", "96786534", "DOngKai");
        QuanLyNhanVien danhSach = new QuanLyNhanVien();
        NhanVien e = new NhanVienBPA("EGS", "23412342", "BinhPHuong");
        NhanVien f = new NhanVienBPA("ADS", "23412342", "CaPhap");
        danhSach.themNhanVien(a,b,c,d,e, f, t);
        danhSach.hienThiDanhSach();
        System.out.println("=======================");
        for ( var x : danhSach.timKiem(f)){
            System.out.println(x);
        }
        System.out.println("========================");
        System.out.println("SAP XEP THEO TEN");
        
        QuanLyNhanVien dsa = new QuanLyNhanVien(danhSach.sapXep());
        dsa.hienThiDanhSach();
        System.out.println("===========================");
        System.out.println("TInh Tien Luong");
        dsa.tinhCong();
    }

}
