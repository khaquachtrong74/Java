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
public class DanhGiaCoSo extends DanhGia{
    private String tenCoSo;

    public DanhGiaCoSo(String tenCoSo, String noiDung, SinhVien sinhVienThucHien, LocalDate ngayThucHien, int hocKy, String namHoc) {
        super(noiDung, sinhVienThucHien, ngayThucHien, hocKy, namHoc);
        this.tenCoSo = tenCoSo;
    }

    
    @Override
    public void hienThiDanhSachDG() {
        super.hienThiDanhSachDG(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("Ten co so: " + this.tenCoSo);
    }

    
    

    public String getTenCoSo() {
        return tenCoSo;
    }

    public void setTenCoSo(String tenCoSo) {
        this.tenCoSo = tenCoSo;
    }
    

}
