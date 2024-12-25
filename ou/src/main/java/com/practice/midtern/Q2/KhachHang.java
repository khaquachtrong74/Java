package com.practice.midtern.Q2;

import java.time.LocalDate;
import java.time.Period;

import com.excersice3.ReQuest4.CauHinh;
public abstract class KhachHang {
    private static int dem;
    private String maKh = String.format("CUST-%05d",dem++);
    private String hoTen;
    private String email;
    private LocalDate ngaySinh;
    private String maDatPhong;

    public void setMaDatPhong(String maDatPhong) {
        this.maDatPhong = maDatPhong;
    }
    // danh sach co the dat phong
    // List<DatPhong> ds = new ArrayList<>();
    public KhachHang(String hoTen, String email, LocalDate ngaySinh) {
        this.hoTen = hoTen;
        this.email = email;
        this.ngaySinh = ngaySinh;
    }

    public String getMaKh() {
        return maKh;
    }

    public void setMaKh(String maKh) {
        this.maKh = maKh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    public int getTuoi(){
        Period time = Period.between(this.ngaySinh, LocalDate.now());
        return time.getYears();
    }

    @Override
    public String toString() {
        // return super.toString();
        return String.format("Ho ten : %s\n Ma khach hang : %s\nNgay Sinh : %s\n"
        ,this.hoTen,this.maKh,this.ngaySinh.format(CauHinh.FORMATTER));
    }
    public abstract void hienThi();
    

}
