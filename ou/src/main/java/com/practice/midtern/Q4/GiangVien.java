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
public class GiangVien {
    private String maSoGiangVien, hoTen, gioiTinh;
    private LocalDate ngaySinh;

    public GiangVien(String maSoGiangVien, String hoTen, String gioiTinh, LocalDate ngaySinh) {
        this.maSoGiangVien = maSoGiangVien;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
    }

    public String getMaSoGiangVien() {
        return maSoGiangVien;
    }

    public void setMaSoGiangVien(String maSoGiangVien) {
        this.maSoGiangVien = maSoGiangVien;
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

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
  
}
