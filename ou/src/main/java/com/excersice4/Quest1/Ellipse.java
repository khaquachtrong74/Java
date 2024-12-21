package com.excersice4.Quest1;

public class Ellipse extends Hinh{
    private double trucLon;
    private double trucNho;
    public Ellipse(String ten , double trucLon, double trucNho) {
        super(ten);
        this.trucLon = trucLon;
        this.trucNho = trucNho;
    }
    
    @Override
    public double tinhDienTich() {
        // throw new UnsupportedOperationException("Not supported yet.");
        return (trucLon*trucNho*Math.PI);
    }

    @Override
    public double tinhChuVi() {
        // throw new UnsupportedOperationException("Not supported yet.");
        return (trucLon+trucNho*Math.PI);
    }

}
