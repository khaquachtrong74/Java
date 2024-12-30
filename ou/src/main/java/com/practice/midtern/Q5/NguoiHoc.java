package com.practice.midtern.Q5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class NguoiHoc {
    private static int dem;
    private String maSinhVien = String.format("STUD-%05d",dem++);
    private String hoTen;
    private LocalDate ngaySinh;
    private String tenTruong;
    // private List<Ve> ds = new ArrayList<>();
    private QuanLyVe ds;
    public NguoiHoc(String hoTen, String ngaySinh, String tenTruong) {
        this.hoTen = hoTen;
        this.ngaySinh = LocalDate.parse(ngaySinh, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.tenTruong = tenTruong;
    }

    public QuanLyVe getDsVe(){
        return this.ds;
    }    
    @Override
    public String toString() {
        // return super.toString();
        return String.format("Ma sinh vien:%s\nHo ten:%s\n,Ngay sinh: %s\nTen truong: %s\n, Ve da mua: %s\n",
        this.maSinhVien, this.hoTen, this.ngaySinh.format(CauHinh.FORMATTER), this.tenTruong, String.join(",", ds.toString()));
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

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

    public String getTenTruong() {
        return tenTruong;
    }

    public void setTenTruong(String tenTruong) {
        this.tenTruong = tenTruong;
    }
    public int getNamSinh(){
        return this.ngaySinh.getYear();
    }
}
