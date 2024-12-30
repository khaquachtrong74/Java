/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practice.midtern.Q4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class QuanLyDanhGia {
    private List<SinhVien> dsSV = new ArrayList<>();

    public void getDsSV() {
        this.dsSV.forEach(dsSV -> dsSV.hienThiDanhSachSv());
    }
    public void hienThiDanhGia(int hocKy, String namHoc){
        for(SinhVien sv:dsSV){
            for(DanhGia dg:sv.getDsDanhGia()){
                if(dg.getHocKy() == hocKy 
                        && dg.getNamHoc().equals(namHoc)){
                    System.out.println("===================================");
                    dg.hienThiDanhSachDG();
                    System.out.println("===================================");
                }
            }
        }
    }
    public void setDsSV(SinhVien... dsSV) {
        this.dsSV.addAll(Arrays.asList(dsSV));
    }
    public void themDanhGia(String MSSV, DanhGia danhGia){
        for(SinhVien sv:dsSV){
            if(sv.getMaSoSinhVien().equals(MSSV)){
                sv.setDsDanhGia(danhGia);
                return;
            }
        }
        System.out.println("Khong co sinh vien!!!");
    }
    public void xemDanhGiaCoSoNB(String tenCoSo, int hocKy, String namHoc){
        for(SinhVien sv:dsSV){
            for(DanhGia dg:sv.getDsDanhGia()){
                if(dg instanceof DanhGiaCoSo 
                        && dg.getHocKy() == hocKy 
                        && dg.getNamHoc().equals(namHoc)
                        && ((DanhGiaCoSo) dg).getTenCoSo().equals(tenCoSo)){
                    System.out.println("===================================");
                    dg.hienThiDanhSachDG();
                    System.out.println("===================================");
                }
            }
        }
    }
    public void tinhDiemTrungBinh(String tenGiangVien, int hocKy, String namHoc){
        double diem = 0;
        int dem = 0;
        for(SinhVien sv:dsSV){
            for(DanhGia dg:sv.getDsDanhGia()){
                if(dg instanceof DanhGiaGiangVien
                        && dg.getHocKy() == hocKy
                        && dg.getNamHoc().equals(namHoc)
                        && ((DanhGiaGiangVien)dg).getGiangVien().getHoTen().toLowerCase().equals(tenGiangVien.toLowerCase())){
                    diem = diem + ((DanhGiaGiangVien)dg).getDiemDanhGia();
                    dem++;
                }
            }
        }
        if(dem>0){
            System.out.println("Diem DGTB cua giang vien: "
                    + tenGiangVien + "la: " + (diem/dem));
        }
        else{
            System.out.println("Khong co giang vien: "
                    + tenGiangVien);
        }
    }
    public void hienThi(){
        this.dsSV.forEach(sv -> sv.hienThiDanhSachSv());
    }
    public void sapXep(){
        this.dsSV.sort(Comparator.comparing(SinhVien::getNamSinh).thenComparing(SinhVien::getHoTen));
    }
    
}
