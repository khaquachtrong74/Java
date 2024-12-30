package com.practice.midtern.Q5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class QuanLy {
    List<NguoiHoc> ds = new ArrayList<>();

    public QuanLy() {
    }
    public void them(NguoiHoc... nh){
        this.ds.addAll(Arrays.asList(nh));
    }
    public void xoa(NguoiHoc nh){
        this.ds.remove(nh);
    }
    public NguoiHoc timKiem(String maSoNguoiHoc){
        return this.ds.stream().filter(nh -> nh.getMaSinhVien().equals(maSoNguoiHoc)).findFirst().get();
    }
    public void muaVe(String maSoNguoiHoc, String loaiVe){
        NguoiHoc tmp = timKiem(maSoNguoiHoc);
        if(tmp == null){
            System.out.println("Nguoi hoc khong ton tai!");
            return;
        }
        switch (loaiVe) {
            case "Ve thang" -> tmp.getDsVe().them(new VeThangg(LocalDate.now()));
            case "Ve nam" -> tmp.getDsVe().them(new VeNam(LocalDate.now()));
            default -> System.out.println("Loai Ve nay khong co");
        }
    }
    
    public void hienThiNguoiHocTrongThang12()
    {
        List<NguoiHoc> tmp = this.ds.stream().filter(nh -> nh.getNgaySinh().getMonthValue()==12).toList();
        if(tmp == null){
            System.out.println("Khongb cos ai ca");
        }
        else{
            tmp.forEach(nh -> System.out.println(nh));
        }
    }
    public void hienThiVeDaMua(String maSoNguoiHoc){
        NguoiHoc tmp = timKiem(maSoNguoiHoc);
        if(tmp == null){
            System.out.println("Khong co nguoi hoc");
        }
        else{
            tmp.getDsVe().hienThi();
        }
    }
    public void hienThiNguoiMuaVeNam2024(){

        List<NguoiHoc> tmp = this.ds.stream().filter(nh -> nh.getDsVe().getVeMuaTrongNam2024() != null).toList();
        if(tmp == null){
            System.out.println("Khong co ai mua ve trong nam 2024");
        }
        else{
            tmp.forEach(nh -> System.out.println(nh));
        }
    }
    // sap xep giam dan theo nam sinh, cung nam thi tang dan theo ten
    public void sapXep(){
        if(this.ds == null){
            System.out.println("Khong co ai de sap xep");
        }
        else{
            this.ds.sort(Comparator.comparing(NguoiHoc::getNamSinh).reversed().thenComparing(NguoiHoc::getHoTen));
        }
    }
}
