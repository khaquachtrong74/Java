package com.practice.midtern.Q1;

import java.time.LocalDate;
import java.time.Period;

import com.excersice3.ReQuest4.CauHinh;
public class KhachHang {
    private static int dem;
    private String maSo = String.format("KH-%04d",dem++);
    private String hoTen;
    private LocalDate ngaySinh;
    private double soDu;

    public KhachHang(String hoTen, String ngaySinh, double soDu) {
        this.hoTen = hoTen;
        this.ngaySinh = LocalDate.parse(ngaySinh,CauHinh.FORMATTER);
        this.soDu = soDu;
    }
    // function
    public int tinhSoTuoi(){
        Period time = Period.between(ngaySinh,LocalDate.now());
        return time.getYears();
    }
    // compare
    public int compare(KhachHang a){
        return (a.soDu > this.soDu ? 1 : (a.soDu < this.soDu ? -1 : 0));
    }

    @Override
    public String toString() {
        // return super.toString();
        return String.format("Ho ten: %s\nMa so: %s\nNgay sinh: %s\nSo tien du: %.2f"
        ,this.hoTen,this.maSo,this.ngaySinh.format(CauHinh.FORMATTER),this.soDu);
    }

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
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

    public double getSoDu() {
        return soDu;
    }

    public void setSoDu(double soDu) {
        this.soDu = soDu;
    }
    
}
