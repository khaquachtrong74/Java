package com.excersice2.Question1;

public class Diem {
    private double hoanhDo;
    private double tungDo;

    public Diem(double hoanhDo, double tungDo) {
        this.hoanhDo = hoanhDo;
        this.tungDo = tungDo;
    }

    public Diem() {
    }

    public double getHoanhDo() {
        return hoanhDo;
    }

    public void setHoanhDo(double hoanhDo) {
        this.hoanhDo = hoanhDo;
    }

    public double getTungDo() {
        return tungDo;
    }

    public void setTungDo(double tungDo) {
        this.tungDo = tungDo;
    }
    @Override
    public String toString(){
        return String.format("(%.1f,%.1f)", this.hoanhDo, this.tungDo);
    }
    public double tinhKhoangCach(Diem A){
        return Math.sqrt(Math.pow(this.hoanhDo-A.hoanhDo,2)+Math.pow(this.tungDo-A.tungDo,2));
    }
}
