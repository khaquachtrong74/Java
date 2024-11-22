package com.excersice3.Question3;

import java.util.Objects;

public class SanPham {
    private static int dem;

    public static int getDem() {
        return dem;
    }
    private String maSanPham = String.format("MSP:%5d", dem++);
    
    private String tenSanPham;
    private String moTaSanPham;
    private String nhaSanXuat;
    private double giaBan;
    public SanPham(String tenSanPham, String moTaSanPham, String nhaSanXuat, double giaBan) {
        this.tenSanPham = tenSanPham;
        this.moTaSanPham = moTaSanPham;
        this.nhaSanXuat = nhaSanXuat;
        this.giaBan = giaBan;
    }
    public double soSanh(SanPham a){
        return Double.compare(this.giaBan, a.giaBan);
    }
    public String getMaSanPham() {
        return maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public String getMoTaSanPham() {
        return moTaSanPham;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public double getGiaBan() {
        return giaBan;
    }
    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        SanPham other = (SanPham) obj;
        return Double.compare(other.giaBan, giaBan) == 0
        && Objects.equals(maSanPham, other.maSanPham)
        && Objects.equals(tenSanPham, other.tenSanPham)
        && Objects.equals(moTaSanPham, other.moTaSanPham)
        && Objects.equals(nhaSanXuat, other.nhaSanXuat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maSanPham, tenSanPham, moTaSanPham, nhaSanXuat, giaBan);
    }
    public String chung(){
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append(maSanPham).append("\nTen San Pham: ").append(tenSanPham)
        .append("\nMo Ta San Pham: ").append(moTaSanPham).append("\nNha san Xuat: ").append(nhaSanXuat)
        .append("\n Gia San pham: ").append(giaBan);
        return strBuilder.toString();
    }
    @Override
    public String toString(){
        return "San Pham\n" + chung();
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public void setMoTaSanPham(String moTaSanPham) {
        this.moTaSanPham = moTaSanPham;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }
}
