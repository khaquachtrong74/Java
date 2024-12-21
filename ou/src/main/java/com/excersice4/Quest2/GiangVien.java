package com.excersice4.Quest2;

import java.time.LocalDate;

import com.excersice3.ReQuest4.CauHinh;

public abstract class GiangVien {
    private String hoTen;
    private LocalDate ngaySinh;
    private String hocHam;
    private String hocVi;
    protected double soGioLam;
    private LocalDate ngayBatDauCongTac;
    protected double luong;

    public GiangVien(String hoTen, String hocHam, String hocVi, LocalDate ngayBatDauCongTac, LocalDate ngaySinh, double soGioLam) {
        this.hoTen = hoTen;
        this.hocHam = hocHam;
        this.hocVi = hocVi;
        this.ngayBatDauCongTac = ngayBatDauCongTac;
        this.ngaySinh = ngaySinh;
        this.soGioLam = soGioLam;
    }

    public abstract double tinhLuong();

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getHocHam() {
        return hocHam;
    }

    public void setHocHam(String hocHam) {
        this.hocHam = hocHam;
    }

    public String getHocVi() {
        return hocVi;
    }

    public void setHocVi(String hocVi) {
        this.hocVi = hocVi;
    }

    public double getSoGioLam() {
        return soGioLam;
    }

    public void setSoGioLam(double soGioLam) {
        this.soGioLam = soGioLam;
    }

    public LocalDate getNgayBatDauCongTac() {
        return ngayBatDauCongTac;
    }

    public void setNgayBatDauCongTac(LocalDate ngayBatDauCongTac) {
        this.ngayBatDauCongTac = ngayBatDauCongTac;
    }

    @Override
    public String toString() {
        // return super.toString();
        return String.format("Ho ten: %s\n Hoc Ham : %s\n Hoc Vi : %s\nSo Gio Lam : %.1f\n Ngay cong tac : %s \n Luong : %.1f",
        hoTen, hocHam, this.hocVi, this.soGioLam, this.ngayBatDauCongTac.format(CauHinh.FORMATTER), this.luong);
    }
    
}
