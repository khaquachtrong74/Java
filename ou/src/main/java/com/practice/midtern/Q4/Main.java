/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practice.midtern.Q4;
import java.time.LocalDate;

/**
 *
 * @author Administrator
 */
public class Main {
    public static void main(String[] args) {
        GiangVien gv1 = new GiangVien("1111111", "Minh Khue", "nam", LocalDate.now());
        SinhVien sv1 = new SinhVien("1234567", "Do", "nam", LocalDate.now());
        SinhVien sv3 = new SinhVien("14212214", "Quach", "nam", LocalDate.of(2005,10,19));
        SinhVien sv2 = new SinhVien("2345678", "Thu", "nu", LocalDate.now());
        DanhGia dg1 = new DanhGiaGiangVien(gv1, 3.5, "Qua la tuyet voi!!!", sv1, LocalDate.now(), 1, "2023-2024");
        DanhGia dg2 = new DanhGiaGiangVien(gv1, 1.5, "Thay cho de thi kho qua!!!", sv2, LocalDate.now(), 1, "2023-2024");
        DanhGia dg3 = new DanhGiaCoSo("NB", "Qua la to!!!", sv2, LocalDate.now(), 1, "2023-2024");
        QuanLyDanhGia ql = new QuanLyDanhGia();
        ql.setDsSV(sv1, sv2, sv3 );
        
        ql.themDanhGia("1234567", dg1);
        ql.themDanhGia("2345678", dg2);
        ql.themDanhGia("1234567", dg3);
        ql.hienThiDanhGia(1, "2023-2024");
        ql.xemDanhGiaCoSoNB("NB", 1, "2023-2024");
        ql.tinhDiemTrungBinh("Minh Khue", 1, "2023-2024");
        // ql.sapXep();
        System.out.println("Sap xep");
        ql.sapXep();
        ql.hienThi();
    }

}
