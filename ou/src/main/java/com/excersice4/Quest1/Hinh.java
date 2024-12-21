package com.excersice4.Quest1;

public abstract class Hinh {
    private String ten;
    public Hinh(String ten){
        this.ten = ten;
    }
    public abstract double tinhDienTich();
    public abstract double tinhChuVi();
    @Override
    public String toString() {
        return String.format("Hinh %s\nDien Tich : %.1f\n Chu Vi : %.1f", ten, tinhDienTich(), tinhChuVi());
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTen() {
        return ten;
    }
    @Override
    public boolean equals(Object obj) {
        Hinh other = (Hinh) obj;
        return this.getTen().equals(other.getTen()) && Double.compare(this.tinhDienTich(), other.tinhDienTich()) == 0;
    }

    @Override
    public int hashCode() {
        return (this.ten == null ? 0 : this.ten.hashCode());
    }
    
}
