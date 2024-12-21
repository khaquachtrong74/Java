/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import java.time.LocalDate;

/**
 *
 * @author oslamelon
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        GiangVien gv1 = new GiangVienCoHuu("Quach Trong Kha", 
                "Tien si", LocalDate.of(2005, 11, 26), "Giang Vien",
                LocalDate.now(), 4000000, 1.2);
        GiangVien gv2 = new GiangVienThinhGiang("Chau Duc Toan", 
                "Tien si", LocalDate.of(2005, 7, 6), "Giang Vien", 
                LocalDate.now(), "Sidney");
        GiangVien gv3 = new GiangVienThinhGiang("Nguyen Hoang Kha", 
                "Thac si", LocalDate.of(2005, 1, 2), "Giang Vien", 
                LocalDate.now(), "Thanh pho Ho Chi Minh");
        
        QLGV ql = new QLGV();
        ql.themGiangVien(gv1, gv2, gv3);
        ql.tinhLuong();
    }
}
