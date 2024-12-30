/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practice.midtern.Q4;
import java.time.LocalDate;

/**
 *
 * @author Administrator
 */
public class DanhGiaGiangVien extends DanhGia{
    private GiangVien giangVien;
    private double diemDanhGia;

    public DanhGiaGiangVien(GiangVien giangVien, double diemDanhGia, String noiDung, SinhVien sinhVienThucHien, LocalDate ngayThucHien, int hocKy, String namHoc) {
        super(noiDung, sinhVienThucHien, ngayThucHien, hocKy, namHoc);
        this.giangVien = giangVien;
        this.diemDanhGia = diemDanhGia;
    }

    

    @Override
    public void hienThiDanhSachDG() {
        super.hienThiDanhSachDG(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("Giang vien: " + this.giangVien.getHoTen()
                + " - MSGV: " + this.giangVien.getMaSoGiangVien()
                + "\nDiem: " + this.diemDanhGia + "/4");
    }
    
    

    public GiangVien getGiangVien() {
        return giangVien;
    }

    public void setGiangVien(GiangVien giangVien) {
        this.giangVien = giangVien;
    }

    public double getDiemDanhGia() {
        return diemDanhGia;
    }

    public void setDiemDanhGia(double diemDanhGia) {
        this.diemDanhGia = diemDanhGia;
    }
 
}
