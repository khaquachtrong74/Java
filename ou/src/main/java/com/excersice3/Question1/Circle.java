package com.excersice3.Question1;

public class Circle extends Ellipse {
    public Circle(double bk) {
        super(bk, bk);

    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hinh Circle\n");
        stringBuilder.append("Dien tich: ");
        stringBuilder.append(tinhDienTich());
        stringBuilder.append("\n");
        stringBuilder.append("Chu vi: ");
        stringBuilder.append(tinhChuVi());
        return stringBuilder.toString();
    }
}
