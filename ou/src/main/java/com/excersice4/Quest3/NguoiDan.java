package com.excersice4.Quest3;

import java.time.LocalDate;

public abstract class NguoiDan {
    private String canCuoc;
    private String hoTen;
    private String gender;
    private String soDienThoai;
    private LocalDate ngaySinh;

    public NguoiDan(String canCuoc, String gender, String hoTen, LocalDate ngaySinh, String soDienThoai) {
        this.canCuoc = canCuoc;
        this.gender = gender;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.soDienThoai = soDienThoai;
    }

    public String getCanCuoc() {
        return canCuoc;
    }

    public void setCanCuoc(String canCuoc) {
        this.canCuoc = canCuoc;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    // function

    @Override
    public String toString() {
        // return super.toString();
        String info = String.format("Can cuoc: %s\n Ho Ten: %s\nNgay sinh: %s\nGioi tinh: %s\nSo dien thoai : %s\n"
        ,this.canCuoc,this.hoTen,this.ngaySinh.format(com.excersice3.ReQuest4.CauHinh.FORMATTER),this.gender,this.soDienThoai);
        return info;
    }
    
    public void hienThi(){
        System.out.println(this);
    }
    @Override
    public boolean equals(Object obj) {
        // // TODO Auto-generated method stub
        // return super.equals(obj);
        NguoiDan C = (NguoiDan) obj;
        return C.getHoTen().equals(this.hoTen) && C.getCanCuoc().equals(this.getCanCuoc());
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
    

}
