package com.excersice4.Quest3;

import java.time.LocalDate;

public class main {
    public static void line(){
        System.out.println("=========================");
    }
    public static void main(String[] args) {
        QLNguoiDan ds1 = new QLNguoiDan();
        QLVacXin ds2 = new QLVacXin();

        // create elem

        NguoiDan a1 = new NguoiDanNuocTrong("06010124", "Nam", "Quach Trong Kha", LocalDate.of(2005, 5,10), "123123612");
        NguoiDan a2 = new NguoiDanNuocNgoai("16823523", "nu", "De toas", LocalDate.of(1999,12,13), "0530485124", "Ho Chieu A", "Na uy");
        NguoiDan a3 = new NguoiDanNuocTrong("06076624", "nu", "Tran Thi B", LocalDate.of(1914, 7,13), "65312423");
        NguoiDan a4 = new NguoiDanNuocNgoai("65265353", "Nam", "Nguyen Van C", LocalDate.of(2001,12,13), "4124124", "Ho Chieu B", "Thuy si");
    

        VacXin b1 = new VacXin("Khang lua", "Dia nguc", 135);
        VacXin b2 = new VacXin("Chong luoi", "Thien dang", 123);
        VacXin b3 = new VacXin("Sot ret", "Viet Nam", 58);
    
        // them
        line();
        ds1.them(a1,a2,a3,a4);
        ds2.them(b1,b2,b3);
        // System.out.println("Hien thi cac danh sach");
        // ds1.hienThi();
        // line();
        // ds2.hienThi();
        line();
        QLTiemChung test = new QLTiemChung(ds2, ds1);
        // test.dienThongTin();
        // System.out.println(test.ql);
        // test.hienThi(true);
        test.hienThi();
    }
}
