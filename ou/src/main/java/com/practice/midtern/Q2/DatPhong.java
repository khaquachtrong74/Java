package com.practice.midtern.Q2;

import java.time.LocalDate;
import java.time.Period;
public class DatPhong {
    private static int dem;
    private KhachHang khachHang;
    private String maDatPhong = String.format("BOOK-%05d", dem++);
    private LocalDate ngayCheckIn;
    private LocalDate ngayCheckOut;
    private boolean isDuDieuKien =true;
    // đặt / huỷ / check-in /check-out
    private String trangThai;
    public DatPhong(KhachHang khachHang, String ngayCheckIn, String ngayCheckOut, String trangThai) {
        this.khachHang = khachHang;
        this.ngayCheckIn = LocalDate.parse(ngayCheckIn, com.excersice3.ReQuest4.CauHinh.FORMATTER);
        this.ngayCheckOut = LocalDate.parse(ngayCheckOut, com.excersice3.ReQuest4.CauHinh.FORMATTER);
        Period time = Period.between(this.ngayCheckIn, this.ngayCheckOut);
        if(time.getDays() < 1){
            isDuDieuKien= false;
        }
        this.khachHang.setMaDatPhong(maDatPhong);
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        // return super.toString();
        return String.format("Ma dat phong : %s\nNgay check-in : %s\nNgay check-out : %s\nTrang thai : %s\n"
        ,this.maDatPhong, this.ngayCheckIn.format(com.excersice3.ReQuest4.CauHinh.FORMATTER)
        , this.ngayCheckOut.format(com.excersice3.ReQuest4.CauHinh.FORMATTER), this.trangThai);
    }
    public void hienThi(){
        this.khachHang.hienThi();
        System.out.println(this);
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }
    public String getMaDatPhong() {
        return maDatPhong;
    }
    public LocalDate getNgayCheckIn() {
        return ngayCheckIn;
    }
    public LocalDate getNgayCheckOut() {
        return ngayCheckOut;
    }
    public String getTrangThai() {
        return trangThai;
    }
    public boolean getIsDuDieuKien(){
        return this.isDuDieuKien;
    }    
}
