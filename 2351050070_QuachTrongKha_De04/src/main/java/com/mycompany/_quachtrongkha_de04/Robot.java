/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._quachtrongkha_de04;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author admin
 */
public class Robot {
    private static int dem;
    private String maSo = String.format("DEL-%05d",dem++);
    private String hoTen;
    private LocalDate ngaySanXuat;
    private TrangThai trangThai;
    private List<NhiemVu> nhiemVu = new ArrayList<>();
    public Robot(String ngaySanXuat, TrangThai trangThai) {
        System.out.println("Hay nhap ten cho robot nay");
        this.hoTen = CauHinh.SC.nextLine();
        this.ngaySanXuat = LocalDate.parse(ngaySanXuat, CauHinh.FORMATTER);
        this.trangThai = trangThai;
    }
    
    /*
        Trang thai gom
    Idle (nhan roi) mau xanh duong nhat
        - San sang nhan nhiem vu
    Delivering : Mau cam 
            -   Dang thuc hien nhiem vu thong qua dia chi va thoi gian
    Maintenance - Mau do
            -   Thong tin du kien hoan thanh
                -   Khong the nhan nhiem vu do dang kiem tra
                    hoac sua chua
    */
//    private String trangThai;
//   private TrangThai trangThai ;

    /**
     * @return the dem
     */
    public static int getDem() {
        return dem;
    }

    /**
     * @return the maSo
     */
    public String getMaSo() {
        return maSo;
    }

    /**
     * @param maSo the maSo to set
     */
    public void setMaSo(String maSo) {
        this.maSo = maSo;
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
     * @return the ngaySanXuat
     */
    public LocalDate getNgaySanXuat() {
        return ngaySanXuat;
    }

    /**
     * @param ngaySanXuat the ngaySanXuat to set
     */
    public void setNgaySanXuat(LocalDate ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }
    public void setTrangThai(TrangThai trangThai){
        this.trangThai = trangThai;
    }
    public TrangThai getTrangThai(){
        return this.trangThai;
    }
    @Override
    public String toString() {
//        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        return String.format("Ho ten: %s\nMa so: %s\nNgay san xuat: %s\n",
                this.hoTen,this.maSo, this.ngaySanXuat.format(CauHinh.FORMATTER))
                + this.trangThai;
    }
    
            
    public void hienThi(){
//        String ht = String.formats
        System.out.println(this);
    }

    public void themNhiemVu(NhiemVu... nv)
    {
        this.nhiemVu.addAll(Arrays.asList(nv));
    }
    public void hienThiTatCaNhiemVu(){
        
            System.out.println("Nhiem vu Robot " + hoTen + " co ma so: " + maSo);
            this.nhiemVu.forEach(nv -> nv.hienThi());
   
    }
    // sap xep theo do uu tien va tang dan theo thoi gian
    public void sapXepNhiemVu(){
        this.nhiemVu.sort(Comparator.comparing(NhiemVu::getDoUuTien).reversed()
        .thenComparing(NhiemVu::getThoiGianTaoNhiemVu));
    }
}
