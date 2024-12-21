package com.excersice4.Quest2;

import java.time.LocalDate;

public class GiangVienCoHuu extends GiangVien {
    private final double luongCoBan = 120000;
    private final double heSoLuong = 1.56;
    public GiangVienCoHuu(String hoTen, String hocHam, String hocVi, LocalDate ngayBatDauCongTac, LocalDate ngaySinh, double soGioLam) {
        super(hoTen, hocHam, hocVi, ngayBatDauCongTac, ngaySinh, soGioLam);
    }

    @Override
    public double tinhLuong() {
        // throw new UnsupportedOperationException("Not supported yet.");
        this.luong =  this.soGioLam*90000 + luongCoBan*heSoLuong;
        return this.luong;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }
}
