package com.practice.midtern.Q2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QLKhachHang {
    List<KhachHang> ds = new ArrayList<>();

    public QLKhachHang() {
    }

    public QLKhachHang(List<KhachHang> ds) {
        this.ds = ds;
    }
    public void themKhachHang(KhachHang... kh){
        this.ds.addAll(Arrays.asList(kh));
    }
    public void xoaKhachHang(KhachHang kh){
        this.ds.remove(kh);
    }
    public void hienThi(){
        this.ds.forEach(kh -> kh.hienThi());
    }
    // tim kiem khach hang de cho nguoi do dat phong
    public KhachHang timKiem(String hoTen, String maKh){
        return this.ds.stream().filter(kh -> kh.getHoTen().equals(hoTen) && kh.getMaKh().equals(maKh))
        .findFirst().get();
    }
}
