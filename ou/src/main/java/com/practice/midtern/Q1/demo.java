package com.practice.midtern.Q1;

import java.io.IOException;

public class demo {

    public static void main(String[] args) throws IOException {
        KhachHang a = new KhachHang("Kha", "19/10/2005", 12312);
        System.out.println(a);
        QLKhachHang b = new QLKhachHang("D:\\Programing_OPP\\DeBai\\Practice_Mid_Tern\\BaiThayDat\\DeBai\\KhachHang.txt");
        // b.hienThi();
        b.sapXep();
        b.hienThiKhachThuong();
    }
}
