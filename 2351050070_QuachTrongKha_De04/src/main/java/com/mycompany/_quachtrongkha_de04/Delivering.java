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
public class Delivering extends TrangThai{
//    Delivering
//            Co dia chi
//            Thoi gian du kien hoan thanh
//            bool false
//    private String diaChi;
//    private String nhiemVu;
//    private LocalDate thoiGianDuKien;
    private NhiemVu nhiemVu;
    public Delivering(NhiemVu nhiemVu) {
        super("Mau cam", true);
        this.nhiemVu = nhiemVu;
    
    }

 

    @Override
    public String toString() {
        return super.toString() + "\nTrang thai: Delivering\n"
        + this.nhiemVu;
                
    }
    
  
}
