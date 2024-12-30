/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practice.midtern.Q4;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class SinhVien {
        private String maSoSinhVien, hoTen, gioiTinh;
    private LocalDate ngaySinh;
    private List<DanhGia> dsDanhGia;

    public SinhVien(String maSoSinhVien, String hoTen, String gioiTinh, LocalDate ngaySinh) {
        this.maSoSinhVien = maSoSinhVien;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.dsDanhGia = new ArrayList<>();
    }
    public void hienThiDanhSachSv(){
        System.out.println("Ma so sinh vien: " + this.maSoSinhVien
        + "\nHo ten: " + this.hoTen
        + "\nGioi tinh: " + this.gioiTinh
        + "\nNgay sinh: " + this.ngaySinh.format(CauHinh.formatter));
    }
    
    public String getMaSoSinhVien() {
        return maSoSinhVien;
    }

    public void setMaSoSinhVien(String maSoSinhVien) {
        this.maSoSinhVien = maSoSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }
    public int getNamSinh(){
        return this.ngaySinh.getYear();
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public List<DanhGia> getDsDanhGia() {
        return dsDanhGia;
    }
    
    public void setDsDanhGia(DanhGia... dsDanhGia) {
        this.dsDanhGia.addAll(Arrays.asList(dsDanhGia));
    }

    public int soLuongDanhGia(){
        return dsDanhGia.size();
    }
  
}
