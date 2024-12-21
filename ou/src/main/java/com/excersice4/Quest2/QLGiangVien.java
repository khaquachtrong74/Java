package com.excersice4.Quest2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class QLGiangVien {
    private List<GiangVien> ds = new ArrayList<>();
    public QLGiangVien(List<GiangVien> ds) {
        this.ds = ds;
    }
    public QLGiangVien(){

    }
    public void themGiangVien(GiangVien... a){
        this.ds.addAll(Arrays.asList(a));
    }
    /* Xoa cuoi */
    public void xoaGiangVien(){
        this.ds.remove(this.ds.size()-1);
    }
    /* Xoa dua theo tim kiem */
    public GiangVien timKiem(String hoTen, String hocHam, String hocVi){
        return this.ds.stream().filter(gv -> gv.getHoTen().equals(hoTen) && gv.getHocHam().equals(hocHam)
        && gv.getHocVi().equals(hocVi)).findFirst().get();
    }
    public void xoaGiangVien(String hoTen, String hocHam, String hocVi){
        GiangVien tmp = timKiem(hoTen, hocHam, hocVi);
        if(tmp != null)
            this.ds.remove(tmp);
   
    }
    public void hienThi(){
        this.ds.forEach(gv-> System.out.println(gv));
    }
    /* 
     * Tinh Luong cho tat ca giang vien trong danh sach
     */
    public void traLuong(){
        this.ds.forEach(gv -> gv.tinhLuong());
    }
    /*
     * Tinh tong trung binh Luong
     */
    public double trungBinhLuong(){
        return this.ds.stream().mapToDouble(gv -> gv.tinhLuong()).average().orElse(0.0);
    }
    /*
     * Sắp xếp theo lương giảm dần
     */
    public List<GiangVien> sapXep(){
        return this.ds.stream().sorted(Comparator.comparing(GiangVien::tinhLuong).reversed()).collect(Collectors.toList());
    }
}

