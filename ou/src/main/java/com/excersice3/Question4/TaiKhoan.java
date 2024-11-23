package com.excersice3.Question4;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Scanner;

public class TaiKhoan {
    private static int dem= 1;

    public static int getDem() {
        return dem;
    }

    public static void setDem(int dem) {
        TaiKhoan.dem = dem;
    }

    private String soTaiKhoan = String.format("%6d", dem++);
    private String tenTaiKhoan;
    private String soDienThoai;
    private String email;
    private double soTienTaiKhoan;
    private LocalDate ngayTaoTaiKhoan;
    private String trangThaiTaiKhoan;

    public TaiKhoan(String tenTaiKhoan, String soDienThoai, String email, double soTienTaiKhoan,
            String trangThaiTaiKhoan) {
        this.soTaiKhoan = String.format("%06d", dem++);
        this.tenTaiKhoan = tenTaiKhoan;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.soTienTaiKhoan = soTienTaiKhoan;
        this.ngayTaoTaiKhoan = LocalDate.now();
        this.trangThaiTaiKhoan = trangThaiTaiKhoan;
    }
    // getters and setters

    public String getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public void setSoTaiKhoan(String soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }

    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }

    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSoTienTaiKhoan() {
        return soTienTaiKhoan;
    }

    public void setSoTienTaiKhoan(double soTienTaiKhoan) {
        this.soTienTaiKhoan = soTienTaiKhoan;
    }

    public LocalDate getNgayTaoTaiKhoan() {
        return ngayTaoTaiKhoan;
    }

    public void setNgayTaoTaiKhoan(LocalDate ngayTaoTaiKhoan) {
        this.ngayTaoTaiKhoan = ngayTaoTaiKhoan;
    }

    public String getTrangThaiTaiKhoan() {
        return trangThaiTaiKhoan;
    }

    public void setTrangThaiTaiKhoan(String trangThaiTaiKhoan) {
        this.trangThaiTaiKhoan = trangThaiTaiKhoan;
    }

    // functions
    public void napTien(){
        System.out.println("Nhap so tien muon nap");
        double soTien = Double.parseDouble(CauHinh.SC.nextLine());
        if(soTien > 0){
            this.soTienTaiKhoan += soTien;
            System.out.println("Da nap tien thanh cong");
        }
    }
    public void rutTien(){
        System.out.println("Nhap so tien muon rut");
        double soTien = Double.parseDouble(CauHinh.SC.nextLine());
        if(soTien > 0 && soTien <= this.soTienTaiKhoan){
            this.soTienTaiKhoan -= soTien;
            System.out.println("Da rut tien thanh cong roi nhe!");
        }
    }
    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        if(this == obj) return true;
        if(obj == null  || getClass() != obj.getClass()) return false;
        TaiKhoan other = (TaiKhoan) obj;
        return Double.compare(other.getSoTienTaiKhoan(), soTienTaiKhoan) == 0
        && Objects.equals(other.email, email)
        && Objects.equals(other.ngayTaoTaiKhoan, ngayTaoTaiKhoan)
        && Objects.equals(other.soDienThoai, soDienThoai)
        && Objects.equals(other.soTaiKhoan, soTaiKhoan)
        && Objects.equals(other.tenTaiKhoan, tenTaiKhoan)
        && Objects.equals(other.trangThaiTaiKhoan, trangThaiTaiKhoan);
    }
    

    @Override
    public int hashCode() {
        return Objects.hash(email, ngayTaoTaiKhoan, soDienThoai, soTaiKhoan, tenTaiKhoan, trangThaiTaiKhoan);
    }

    @Override
    public String toString() {
        return "So tai khoan: "+ this.soTaiKhoan +
        ", Ten Tai khoan: " + this.tenTaiKhoan +
        ", So tien: " + this.soTienTaiKhoan+
        ", Trang thai: "+ this.trangThaiTaiKhoan;
    }
    

}
