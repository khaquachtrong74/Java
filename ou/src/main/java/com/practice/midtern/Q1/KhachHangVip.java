package com.practice.midtern.Q1;

import java.time.LocalDate;

import com.excersice3.ReQuest4.CauHinh;

public class KhachHangVip extends KhachHang{
    private LocalDate ngayHetHan;

    public KhachHangVip(String hoTen, String ngaySinh, double soDu, String ngayHetHan) {
        super(hoTen, ngaySinh, soDu);
        this.ngayHetHan = LocalDate.parse(ngayHetHan,CauHinh.FORMATTER);
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\nNgay Het Han: %s",
        this.ngayHetHan.format(CauHinh.FORMATTER));
    }
    

}
