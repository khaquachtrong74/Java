/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.time.LocalDate;

/**
 *
 * @author oslamelon
 */
public class GiangVienCoHuu extends GiangVien {
    private double luongCoBan;
    private double heSo;

    public GiangVienCoHuu(String hoTen, String hocHam, 
            LocalDate ngaySinh, String hocVi, LocalDate ngayCongTac, 
            double luongCoBan, double heSo) {
        super(hoTen, hocHam, ngaySinh, hocVi, ngayCongTac);
        this.luongCoBan = luongCoBan;
        this.heSo = heSo;
    }
    
    @Override
    public void tinhLuong() {
        super.luong = 90000*this.getSoGioLam() +  this.luongCoBan*this.heSo;
    }
    
    @Override
    public String toString() {
        return super.toString() + String.format("Luong co ban: %.2f\nHe so: %.2f\n", 
                this.luongCoBan, this.heSo);
    }
}
