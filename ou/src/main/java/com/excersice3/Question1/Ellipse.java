package com.excersice3.Question1;

public class Ellipse {
    private double bkTrucLon;
    private double bkTrucNho;

    public Ellipse(double bkTrucLon, double bkTrucNho) {
        this.bkTrucLon = bkTrucLon;
        this.bkTrucNho = bkTrucNho;
    }

    public double getBkTrucLon() {
        return bkTrucLon;
    }

    public void setBkTrucLon(double bkTrucLon) {
        this.bkTrucLon = bkTrucLon;
    }

    public double getBkTrucNho() {
        return bkTrucNho;
    }

    public void setBkTrucNho(double bkTrucNho) {
        this.bkTrucNho = bkTrucNho;
    }

    public double tinhDienTich() {
        return Math.PI * bkTrucLon * bkTrucNho;
    }

    public double tinhChuVi() {
        return Math.PI
                * (3 * (bkTrucLon + bkTrucNho) - Math.sqrt((3 * bkTrucLon + bkTrucNho) * (bkTrucLon + 3 * bkTrucNho)));
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hinh Ellipse\n");
        stringBuilder.append("Dien tich: ");
        stringBuilder.append(tinhDienTich());
        stringBuilder.append("\n");
        stringBuilder.append("Chu vi: ");
        stringBuilder.append(tinhChuVi());
        return stringBuilder.toString();
    }

}
