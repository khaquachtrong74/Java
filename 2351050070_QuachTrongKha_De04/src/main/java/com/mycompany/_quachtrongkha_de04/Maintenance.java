/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._quachtrongkha_de04;

import java.time.LocalDate;

/**
 *
 * @author admin
 */
public class Maintenance extends TrangThai{
    private LocalDate thoiGianDuKien;
    public Maintenance(String thoiGianDuKien) {
        super("Mau do", false);
        this.thoiGianDuKien = LocalDate.parse(thoiGianDuKien, CauHinh.FORMATTER);
    }

    /**
     * @return the thoiGianDuKien
     */
    public LocalDate getThoiGianDuKien() {
        return thoiGianDuKien;
    }

    /**
     * @param thoiGianDuKien the thoiGianDuKien to set
     */
    public void setThoiGianDuKien(LocalDate thoiGianDuKien) {
        this.thoiGianDuKien = thoiGianDuKien;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTrang thai: Maintenance\n"; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
