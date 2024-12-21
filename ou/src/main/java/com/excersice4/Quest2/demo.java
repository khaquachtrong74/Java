package com.excersice4.Quest2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class demo {
    public static void line(){
        System.out.println("==================================");
    }
    public static void main(String[] args) {
        final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String ngayCongTac = LocalDate.now().format(FORMATTER);

        GiangVien a = new GiangVienCoHuu("ta", "Giao su", "Tien si", LocalDate.of(2000, 12, 7), LocalDate.of(1950, 10, 19), 642);
        GiangVien b = new GiangVienThinhGiang("Detpo", "Giao su", "Tien si", LocalDate.of(2000, 12, 7), LocalDate.of(1975, 12, 20), 936, "Nghe An");
        GiangVien c = new GiangVienCoHuu("calic", "giap si", "Ke Chay vat", LocalDate.of(2000, 12, 7), LocalDate.of(1950, 10, 19), 870);
        GiangVien d = new GiangVienThinhGiang("ta", "Giao su", "Tien si", LocalDate.of(2212, 11, 13), LocalDate.of(1970, 6, 6), 450, "Ha Noi");
        GiangVien e = new GiangVienThinhGiang("betamot", "Phap su hac am", "Phap su", LocalDate.of(500, 1, 1), LocalDate.of(464, 8, 26), 500, "Binh thuong");
        GiangVien f = new GiangVienCoHuu("arkl", "Ky si bac 5", "Kiem su", LocalDate.of(2100, 12, 7), LocalDate.of(1969, 10, 19), 1200);
        GiangVien g = new GiangVienCoHuu("ats", "Khong co", "Chay Viec", LocalDate.of(2000, 12, 7), LocalDate.of(1985, 10, 19), 800);
        // System.out.println(a);
        QLGiangVien dsgv = new QLGiangVien();
        line();
        dsgv.themGiangVien(a,b,c,d,e,f,g);
        dsgv.hienThi();
        line();
        /*Sap xep giam dan theo tien luon */
        dsgv.traLuong();
        dsgv.sapXep();
        dsgv.hienThi();
    //     System.out.println("Xoa theo ten, hoc ham va hoc vi");
    //     /*
    //      * Cau Hinh tu file com.excersice2.Quest5
    //      */
    //     String hoTen = CauHinh.SC.nextLine();
    //     String hocHam = CauHinh.SC.nextLine();
    //     String hocVi = CauHinh.SC.nextLine();
    //     dsgv.xoaGiangVien(hoTen, hocHam, hocVi);
    //     dsgv.hienThi();
    //     line();
    //     System.out.println("Xoa giang vien o cuoi danh sach");
    //     dsgv.xoaGiangVien();
    //     dsgv.hienThi();
    //     line();
    //     System.out.println("tra luong");
    //     dsgv.traLuong();
    //     dsgv.hienThi();
    //     line();
    //     System.out.printf("TOng luong trung binh la %.1f\n", dsgv.trungBinhLuong());
    }

}
