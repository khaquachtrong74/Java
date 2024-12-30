package com.practice.midtern.Q5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuanLyVe {

    List<Ve> ds = new ArrayList<>();

    public QuanLyVe() {
    }
    public void them(Ve... v){
        this.ds.addAll(Arrays.asList(v));
    }
    public void xoa(Ve v){
        this.ds.remove(v);
    }
    public void hienThi(){
        this.ds.forEach(ve -> System.out.println(ve));
    }
    public List<Ve> getVeMuaTrongNam2024()
    {
        return this.ds.stream().filter(ve -> ve.getNgayMuaVe().getYear()==2024).toList();
    }
}
