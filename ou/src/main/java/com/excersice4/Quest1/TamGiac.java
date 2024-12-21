package com.excersice4.Quest1;

public class TamGiac extends Hinh{
    private double a, b, c;
    public TamGiac(String ten, double a, double b, double c) {
        super(ten);
        this.a = a;
        this.b = b;
        this.c = c;
        // this.<error> = <error>;
    }


    @Override
    public double tinhDienTich() {
        // throw new UnsupportedOperationException("Not supported yet.");
        double p = (a + b + c) /2;
        return p*(p-a)*(p-b)*(p-c);
    }

    @Override
    public double tinhChuVi() {
        // throw new UnsupportedOperationException("Not supported yet.");
        return (a + b + c )/ 3;
    }
    

}
