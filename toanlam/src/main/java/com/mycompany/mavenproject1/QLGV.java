/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author oslamelon
 */
public class QLGV {
    private List<GiangVien> qlgv = new ArrayList<>();
    
    public void themGiangVien(GiangVien... gv) {
        this.qlgv.addAll(List.of(gv));
    }
    
    public void xoaGiangVien(GiangVien gv) {
        this.qlgv.remove(gv);
    }
    
    public List<GiangVien> timKiemTheoTen(String ten) {
        return this.qlgv.stream().filter(gv -> gv.getHoTen().toLowerCase(
        ).contains(ten.toLowerCase())).toList();
    }
    
    public List<GiangVien> timKiemTheoHocHam(String hocHam) {
        return this.qlgv.stream().filter(gv -> gv.getHocHam().toLowerCase(
        ).contains(hocHam.toLowerCase())).toList();
    }
    
    public List<GiangVien> timKiemTheoHocVi(String hocVi) {
        return this.qlgv.stream().filter(gv -> gv.getHocVi().toLowerCase(
        ).contains(hocVi.toLowerCase())).toList();
    }
    
    public void tinhLuong() {
        this.qlgv.forEach(gv -> {
            gv.setSoGioLam();
            gv.tinhLuong();
        });
        this.qlgv.sort((gv1, gv2) -> {
            return -Double.compare(gv1.luong, gv2.luong);
        });
        this.qlgv.forEach(gv -> System.out.println(gv));
    }
}
