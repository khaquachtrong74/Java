package com.excersice3.ReQuest5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class QuanLyNhanVien{
    private List<NhanVien> ds = new ArrayList<>();

    public QuanLyNhanVien() {
    }
    
    public QuanLyNhanVien(List<NhanVien> ds) {
        this.ds = ds;
    }

    public void themNhanVien(NhanVien... a){
        this.ds.addAll(Arrays.asList(a));
    }
    public void hienThiDanhSach(){
        this.ds.forEach(nv -> System.out.println(nv));
    }
    public List<NhanVien> timKiem(NhanVien other){
        return this.ds.stream().filter(nv -> nv.equals(other)).collect(Collectors.toList());
    }    
    /*Sap xep theo Ho Ten */
    public List<NhanVien> sapXep(){
        return this.ds.stream().sorted(Comparator.comparing(NhanVien::getHoTen).thenComparing(NhanVien::getQueQuan)
        ).collect(Collectors.toList());
        /*
         * this.ds.sort((nv, nv1) -> nv.getHoTen().compareTo(nv1.getHoTen()));
         * 
         */
    }
    public NhanVien timKiemNhanVien(String chungMinhNhanDan){
        return this.ds.stream().filter(nv -> nv.getChungMinhND().equals(chungMinhNhanDan)).findFirst().get();
    }
    public void tinhCong(){
        System.out.println("Nhap so ngay cong : ");
        int ngayCong = Integer.parseInt(CauHinh.SC.nextLine());
        System.out.println("Nhap so chung minh nhan dan cua nhan vien: ");
        String cmnd = CauHinh.SC.nextLine();
        NhanVien other = timKiemNhanVien(cmnd);
        if(other != null){
            
            System.out.println("Sau khi cap nhap Luong");
            System.out.println(other);
            System.out.println(other.tinhLuong(ngayCong));
        }
        else{
            System.out.println("Khong tim thay nhan vien do");
        }
    }   

}
