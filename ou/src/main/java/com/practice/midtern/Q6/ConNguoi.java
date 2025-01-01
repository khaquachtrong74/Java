package com.practice.midtern.Q6;

import java.time.LocalDate;

public class ConNguoi {

    protected String maSo;
    private String hoTen;
    private String gioiTinh;
    private LocalDate ngaySinh;

    public ConNguoi(String gioiTinh, String hoTen, String ngaySinh) {
        this.gioiTinh = gioiTinh;
        this.hoTen = hoTen;
        this.ngaySinh = LocalDate.parse(ngaySinh, CauHinh.FORMATTER);
    }
    
    public String getMaSo(){
        return this.maSo;
    }
}
