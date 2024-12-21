package com.excersice3.ReQuest4;

import java.util.List;

public class demo {
    public static void main(String[] args) throws ClassNotFoundException {
        TaiKhoan t1 = new TaiKhoanCoKyHan(100, "KHa", KyHan.MOT_NAM);
        TaiKhoan t2 = new TaiKhoanKhongKyHan(123123, "KHSA");
        TaiKhoan t3 = new TaiKhoanKhongKyHan(2131, "testsx");
        TaiKhoan t4 = new TaiKhoanKhongKyHan(123,"zxcz");
        QuanLyTaiKhoan a = new QuanLyTaiKhoan();
        a.themTaiKhoan(t1, t2, t3, t4);
        a.hienThi();
        // t1.hienThi();
        System.out.println("=========================");
        List<TaiKhoan> tmp = a.timKiem("com.excersice3.ReQuest4.TaiKhoanKhongKyHan");
        tmp.forEach(t -> t.hienThi());
    }
}
