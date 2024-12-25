package com.practice.midtern.Q2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QLDatPhong {
    List<DatPhong> ds = new ArrayList<>();

    public QLDatPhong() {
    }
    public void themDatPhong(DatPhong... tmp){
        this.ds.addAll(Arrays.asList(tmp));
    }
    public void xoaPhongDaDat(DatPhong tmp){
        this.ds.remove(tmp);
    }
    // hien thi thong tin ma phong da dat va ten nguoi dung
    public void hienThi(){
        this.ds.forEach(kh -> kh.hienThi());
    }
}
