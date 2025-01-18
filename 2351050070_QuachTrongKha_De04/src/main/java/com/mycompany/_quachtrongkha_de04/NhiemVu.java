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
public class NhiemVu {
    private String tenNhiemVu;
    private int doUuTien;
    private LocalDate thoiGianTaoNhiemVu;
    private String diaChiGiaoHang;

    public NhiemVu(String tenNhiemVu, int doUuTien, LocalDate thoiGianTaoNhiemVu, String diaChiGiaoHang) {
        this.tenNhiemVu = tenNhiemVu;
        this.doUuTien = doUuTien;
        this.thoiGianTaoNhiemVu = thoiGianTaoNhiemVu;
        this.diaChiGiaoHang = diaChiGiaoHang;
    }

    @Override
    public String toString() {
//        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        return String.format("%s\t%s\nDo uu tien: %s\nThoi gian tao: %s\n",
                this.tenNhiemVu, this.diaChiGiaoHang, this.doUuTien, 
                this.thoiGianTaoNhiemVu.format(CauHinh.FORMATTER));
    }
    
    public void hienThi(){
        System.out.printf("%s\t%s ", this.tenNhiemVu, this.diaChiGiaoHang);
        System.out.printf("Do uu tien: %s\n", this.doUuTien);
        System.out.printf("Thoi gian tao nhiem vu: %s\n", this.thoiGianTaoNhiemVu);
        System.out.printf("Dia chi: %s\n", this.diaChiGiaoHang);
    }
    /**
     * @return the tenNhiemVu
     */
    public String getTenNhiemVu() {
        return tenNhiemVu;
    }

    /**
     * @param tenNhiemVu the tenNhiemVu to set
     */
    public void setTenNhiemVu(String tenNhiemVu) {
        this.tenNhiemVu = tenNhiemVu;
    }

    /**
     * @return the doUuTien
     */
    public int getDoUuTien() {
        return doUuTien;
    }

    /**
     * @param doUuTien the doUuTien to set
     */
    public void setDoUuTien(int doUuTien) {
        this.doUuTien = doUuTien;
    }

    /**
     * @return the thoiGianTaoNhiemVu
     */
    public LocalDate getThoiGianTaoNhiemVu() {
        return thoiGianTaoNhiemVu;
    }

    /**
     * @param thoiGianTaoNhiemVu the thoiGianTaoNhiemVu to set
     */
    public void setThoiGianTaoNhiemVu(LocalDate thoiGianTaoNhiemVu) {
        this.thoiGianTaoNhiemVu = thoiGianTaoNhiemVu;
    }

    /**
     * @return the diaChiGiaoHang
     */
    public String getDiaChiGiaoHang() {
        return diaChiGiaoHang;
    }

    /**
     * @param diaChiGiaoHang the diaChiGiaoHang to set
     */
    public void setDiaChiGiaoHang(String diaChiGiaoHang) {
        this.diaChiGiaoHang = diaChiGiaoHang;
    }
    
}
