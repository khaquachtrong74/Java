/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany._quachtrongkha_de04;

import java.time.LocalDate;

/**
 *
 * @author admin
 */
public class App {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        QuanLyRobot ds = new QuanLyRobot();
        Robot a = new Robot("22/10/2024", new Idle());
        Robot a1 = new Robot("23/11/2024", new Delivering(new NhiemVu(
                "Giao keo", 2, LocalDate.of(2024,12,20), "Duong so 5, nga 5")));
        Robot a2 = new Robot("10/12/2012", new Maintenance("12/12/2022"));
        Robot a3 = new Robot("24/06/2024", new Maintenance("24/06/2025"));
        Robot a4 = new Robot("19/10/2077", new Delivering(new NhiemVu(
        "Giao muoi", 5, LocalDate.now(),"Duong so 3 nga 3")));       
        System.out.println("a)==================");
        ds.themRobot(a,a1, a2, a3, a4);
        System.out.println("b)===================");
        ds.hienThiTrongBaNamGan();
        System.out.println("c)=====================");
        ds.hienThiRobotDelivering();
        System.out.println("d)=====================");
        // chi co the nhap DEL-00000 de giao nhiem vu cho IDLE
        ds.giaoNhiemVu(new NhiemVu("Giao keo", 5, LocalDate.of(2024,10,14),
        "Duong so 5, Nga tu con voi"));
        
        // neu muon giao nhiem vu cho DEL-00000 thi phai doi cho trang thai
        // cua no ve IDLE thi moi co the giao tiep
        
        a.setTrangThai(new Idle());
        
        ds.giaoNhiemVu(new NhiemVu("Giao xuong ca", 5, LocalDate.of(2024,10,13),
        "Duong so 4, Nga 3 chuong trau"));
        
        a.hienThiTatCaNhiemVu();
        a2.hienThiTatCaNhiemVu(); // robot bao tri: khong giao hang
        System.out.println("e)=====================");
        a.sapXepNhiemVu();
        a.hienThiTatCaNhiemVu();
    }
}
