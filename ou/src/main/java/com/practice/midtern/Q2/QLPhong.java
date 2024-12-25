package com.practice.midtern.Q2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class QLPhong {
    List<Phong>ds = new ArrayList<>();

    public QLPhong() {
    }

    public QLPhong(List<Phong> ds) {
        this.ds = ds;
    }
    public void themPhong(Phong... p){
        this.ds.addAll(Arrays.asList(p));
    }
    public void xoaPhong(Phong p){
        this.ds.remove(p);
    }
    public void xoaPhong(int pos){
        this.ds.remove(pos);
    }
    public void hienThi(){
        // hien thi tat ca phong hien co
        this.ds.forEach(phong -> phong.hienThi());
    }
    // tim kiem ma phong
    public Phong timKiem(String maPhong){
        return this.ds.stream().filter(phong -> phong.getMaPhong().equals(maPhong)).findFirst().get();
    }
    
}   
