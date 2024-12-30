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
public class DanhGia {
    private static int dem = 0;
    private String maDanhGia, noiDung;
    private SinhVien sinhVienThucHien;
    private LocalDate ngayThucHien;
    private String namHoc;
    private int hocKy;

    public DanhGia(String noiDung, SinhVien sinhVienThucHien, LocalDate ngayThucHien, int hocKy, String namHoc) {
        this.maDanhGia = String.format("DG-%04d", ++dem);
        this.noiDung = noiDung;
        this.sinhVienThucHien = sinhVienThucHien;
        this.ngayThucHien = ngayThucHien;
        this.hocKy = hocKy;
        this.namHoc = namHoc;
    }

    public void hienThiDanhSachDG() {
    System.out.println("Ma danh gia: " + this.maDanhGia
                       + "\nNoi dung: " + this.noiDung
                       + "\nSinh vien thuc hien: " + this.sinhVienThucHien.getHoTen()
                       + " - MSSS: " + this.sinhVienThucHien.getMaSoSinhVien()
                       + "\nNgay thuc hien: " + this.ngayThucHien.format(CauHinh.formatter)
                       + "\nHoc ky: " + this.hocKy
                       + " - Nam hoc: " + this.namHoc);
}
    

    public String getMaDanhGia() {
        return maDanhGia;
    }

    public void setMaDanhGia(String maDanhGia) {
        this.maDanhGia = maDanhGia;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public SinhVien getSinhVienThucHien() {
        return sinhVienThucHien;
    }

    public void setSinhVienThucHien(SinhVien sinhVienThucHien) {
        this.sinhVienThucHien = sinhVienThucHien;
    }

    public LocalDate getNgayThucHien() {
        return ngayThucHien;
    }

    public void setNgayThucHien(LocalDate ngayThucHien) {
        this.ngayThucHien = ngayThucHien;
    }

    public String getNamHoc() {
        return namHoc;
    }

    public void setNamHoc(String namHoc) {
        this.namHoc = namHoc;
    }

    public int getHocKy() {
        return hocKy;
    }

    public void setHocKy(int hocKy) {
        this.hocKy = hocKy;
    }

    
    
}
