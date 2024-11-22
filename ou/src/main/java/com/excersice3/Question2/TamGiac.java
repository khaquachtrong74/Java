package com.excersice3.Question2;

// import javax.management.RuntimeErrorException;

public class TamGiac {
    private double a, b, c;

    public TamGiac(double a, double b, double c) {
        if (a + b < c || b + c < a || c + a < b) {

        } else {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    public double tinhDienTich() {
        // dung cong thuc herong
        double p = (a + b + c) / 3;

        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public double tinhChuVi() {
        return (this.a + this.b + this.c) * 0.5;
    }
    protected String thongTinChung(){
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append("Canh1: ").append(a)
                  .append("\nCanh2: ").append(b)
                  .append("\nCanh3: ").append(c)
                  .append("\nDien Tich: ").append(tinhDienTich())
                  .append("\nChu Vi: ").append(tinhChuVi());
        return strBuilder.toString();
    }
    @Override
    public String toString() {
        return "Tam giac\n" + thongTinChung();
    }
}