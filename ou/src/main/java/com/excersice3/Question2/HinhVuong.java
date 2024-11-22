package com.excersice3.Question2;

public class HinhVuong extends HinhChuNhat {
    public HinhVuong(double canh) {
        super(canh, canh);
    }

    @Override
    public String toString() {
        return "Hinh Vuong\n" + thongTinChung();
    }
}
