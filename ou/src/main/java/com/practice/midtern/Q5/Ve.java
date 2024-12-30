package com.practice.midtern.Q5;

import java.time.LocalDate;

public abstract  class Ve {
    private static int dem;
    private String maVe = String.format("Ve-%05d", dem++);
    protected LocalDate ngayMuaVe;
    protected LocalDate ngayHetHan;

    public Ve(LocalDate ngayMuaVe) {
        this.ngayMuaVe = ngayMuaVe;
    }

    public abstract void setNgayHetHan();
    public abstract int getGiaVe();

    public String getMaVe() {
        return maVe;
    }

    public LocalDate getNgayMuaVe() {
        return ngayMuaVe;
    }

    public LocalDate getNgayHetHan() {
        return ngayHetHan;
    }

    @Override
    public String toString() {
        // return super.toString();
        return String.format("Ma ve : %s\nNgay mua ve: %s\nNgay get han\n"
        ,this.maVe, this.ngayMuaVe.format(CauHinh.FORMATTER), this.ngayHetHan.format(CauHinh.FORMATTER));
    }


    
}

