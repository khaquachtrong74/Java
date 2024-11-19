package com.excersice2.Question2;

import com.excersice2.Question1.Diem;

public class DoanThang {
    private Diem dau;
    private Diem duoi;

    public DoanThang() {
    }

    public DoanThang(Diem dau, Diem duoi) {
        this.dau = dau;
        this.duoi = duoi;
    }

    public Diem getDau() {
        return dau;
    }

    public void setDau(Diem dau) {
        this.dau = dau;
    }

    public Diem getDuoi() {
        return duoi;
    }

    public void setDuoi(Diem duoi) {
        this.duoi = duoi;
    }

    @Override
    public String toString() {
        return String.format("[(%.1f,%.1f),(%.1f,%.1f)]", this.dau.getHoanhDo(), this.dau.getTungDo(),
                this.duoi.getHoanhDo(), this.duoi.getTungDo());
    }
    public double tinhDoDai(){
        return this.dau.tinhKhoangCach(this.duoi);
    }
    public Diem timTrungDiem(){
        double x1 = (this.dau.getHoanhDo()+this.duoi.getHoanhDo())/2;
        double x2 = (this.dau.getTungDo()+this.duoi.getTungDo())/2;
        return new Diem(x1,x2);
    }
    public boolean isSongSong(DoanThang B){
        double a = (this.dau.getHoanhDo()-this.duoi.getHoanhDo())*(B.dau.getTungDo()-B.duoi.getTungDo());
        double b = (B.dau.getHoanhDo()-B.duoi.getHoanhDo())*(this.dau.getTungDo()-this.duoi.getTungDo());
        return Math.abs(a - b) < 1e-9;
    } 

}
