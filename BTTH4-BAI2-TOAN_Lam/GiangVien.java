/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author oslamelon
 */
abstract public class GiangVien {
    private String hoTen;
    private String hocHam;
    private LocalDate ngaySinh;
    private String hocVi;
    private LocalDate ngayCongTac;
    private double soGioLam;
    protected double luong;

    public GiangVien(String hoTen, String hocHam, LocalDate ngaySinh, String hocVi, LocalDate ngayCongTac) {
        this.hoTen = hoTen;
        this.hocHam = hocHam;
        this.ngaySinh = ngaySinh;
        this.hocVi = hocVi;
        this.ngayCongTac = ngayCongTac;
    }
    
    abstract public void tinhLuong();
    
    public void setSoGioLam() {
        Scanner sc = Configuration.SC;
        System.out.println("Hay nhap so gio lam cua ban: ");
        this.soGioLam = Integer.parseInt(sc.nextLine());
    }
    
    /**
     * @return the hoTen
     */
    public String getHoTen() {
        return hoTen;
    }

    /**
     * @param hoTen the hoTen to set
     */
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    /**
     * @return the hocHam
     */
    public String getHocHam() {
        return hocHam;
    }

    /**
     * @param hocHam the hocHam to set
     */
    public void setHocHam(String hocHam) {
        this.hocHam = hocHam;
    }

    /**
     * @return the ngaySinh
     */
    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    /**
     * @param ngaySinh the ngaySinh to set
     */
    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    /**
     * @return the hocVi
     */
    public String getHocVi() {
        return hocVi;
    }

    /**
     * @param hocVi the hocVi to set
     */
    public void setHocVi(String hocVi) {
        this.hocVi = hocVi;
    }

    /**
     * @return the ngayCongTac
     */
    public String getNgayCongTac() {
        return ngayCongTac.format(Configuration.FORMATTER);
    }

    /**
     * @param ngayCongTac the ngayCongTac to set
     */
    public void setNgayCongTac(LocalDate ngayCongTac) {
        this.ngayCongTac = ngayCongTac;
    }
    
    @Override
    public String toString() {
        return String.format("""
                             Ho ten: %s
                             Ngay sinh: %s
                             Hoc ham: %s
                             Hoc vi: %s
                             Ngay cong tac: %s
                             Luong: %.1f
                             """, this.hoTen, 
                this.ngaySinh.format(Configuration.FORMATTER), this.hocHam,
                this.hocVi, this.ngayCongTac.format(Configuration.FORMATTER),
                this.luong);
    }

    /**
     * @return the soGioLam
     */
    public double getSoGioLam() {
        return soGioLam;
    }
    
}
