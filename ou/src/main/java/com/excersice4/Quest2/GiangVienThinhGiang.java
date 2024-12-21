package com.excersice4.Quest2;

import java.time.LocalDate;

public class GiangVienThinhGiang extends GiangVien{
    private String noiCongTac;

    public GiangVienThinhGiang(String hoTen, String hocHam, String hocVi, LocalDate ngayBatDauCongTac, LocalDate ngaySinh, double soGioLam, String noiCongTac) {
        super(hoTen, hocHam, hocVi, ngayBatDauCongTac, ngaySinh, soGioLam);
        this.noiCongTac = noiCongTac;
    }
    @Override
    public double tinhLuong() {
        // throw new UnsupportedOperationException("Not supported yet.");
        this.luong = this.soGioLam*90000;
        return this.luong;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\nnoi cong tac : %s ", noiCongTac);
    }
    
}
