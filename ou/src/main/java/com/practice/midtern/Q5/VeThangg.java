package com.practice.midtern.Q5;

import java.time.LocalDate;

public class VeThangg extends Ve{

    public VeThangg(LocalDate ngayMuaVe) {
        super(ngayMuaVe);
    }
    

    @Override
    public int getGiaVe() {
        // throw new UnsupportedOperationException("Not supported yet.");
        return (this.ngayMuaVe.getDayOfMonth() < 15 ? 75000 : 35000);
    }

    @Override
    public void setNgayHetHan() {
        // throw new UnsupportedOperationException("Not supported yet.");
        int ngayCuoiTrongThang = this.ngayMuaVe.lengthOfMonth();
        this.ngayHetHan = LocalDate.of(this.ngayMuaVe.getYear(), this.ngayMuaVe.getMonth(), ngayCuoiTrongThang);
    }

}
