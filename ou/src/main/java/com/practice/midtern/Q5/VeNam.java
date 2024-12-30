package com.practice.midtern.Q5;

import java.time.LocalDate;

public class VeNam extends Ve{

    public VeNam(LocalDate ngayMuaVe) {
        super(ngayMuaVe);
    }


    @Override
    public void setNgayHetHan() {
        // throw new UnsupportedOperationException("Not supported yet.");
        this.ngayHetHan = LocalDate.of(this.ngayMuaVe.getYear()+1,1,1);
    }

    @Override
    public int getGiaVe() {
        // throw new UnsupportedOperationException("Not supported yet.");
        return (this.ngayMuaVe.getMonthValue() < 6 ? 1200000 : 650000);
    }

}
