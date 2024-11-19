package com.excersice2.Question3;

import com.excersice2.Question1.Diem;

public class HinhChuNhat {
    private Diem trenTrai;
    private Diem duoiPhai;

    public HinhChuNhat(Diem trenTrai, Diem duoiPhai) throws Exception {
        if (trenTrai.getHoanhDo() <= duoiPhai.getHoanhDo() && trenTrai.getTungDo() >= duoiPhai.getTungDo()) {
            this.trenTrai = trenTrai;
            this.duoiPhai = duoiPhai;
        } else
            throw new Exception("Giá trị không hợp lệ.");

    }

    public HinhChuNhat() {
    }

    public Diem getTrenTrai() {
        return trenTrai;
    }

    public void setTrenTrai(Diem trenTrai) {
        this.trenTrai = trenTrai;
    }

    public Diem getDuoiPhai() {
        return duoiPhai;
    }

    public void setDuoiPhai(Diem duoiPhai) {
        this.duoiPhai = duoiPhai;
    }

    public double tinhDienTich() {
        double chieuRong = Math.abs(this.trenTrai.getTungDo() - this.duoiPhai.getTungDo());
        double chieuDai = Math.abs(this.trenTrai.getHoanhDo() - this.duoiPhai.getHoanhDo());
        return chieuRong * chieuDai;
    }

    public double tinhChuVi() {
        double chieuRong = Math.abs(this.trenTrai.getTungDo() - this.duoiPhai.getTungDo());
        double chieuDai = Math.abs(this.trenTrai.getHoanhDo() - this.duoiPhai.getHoanhDo());
        return (chieuRong + chieuDai) * 2;
    }

    @Override
    public String toString() {
        return "HinhChuNhat [trenTrai=" + trenTrai + ", duoiPhai=" + duoiPhai + ", Chu Vi=" + tinhChuVi()
                + ", Area=" + tinhDienTich() + "]";
    }
}
