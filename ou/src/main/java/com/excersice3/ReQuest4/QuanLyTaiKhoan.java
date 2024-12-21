package com.excersice3.ReQuest4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class QuanLyTaiKhoan {
    private List<TaiKhoan> ds = new ArrayList<>();
    public void themTaiKhoan(TaiKhoan... a){
        this.ds.addAll(Arrays.asList(a));
    }
    public void hienThi(){
        this.ds.forEach(h-> h.hienThi());
    }
    public List<TaiKhoan> timKiem(String tenLop) throws ClassNotFoundException{
        Class C = Class.forName(tenLop);
        return this.ds.stream().filter(h-> C.isInstance(h)).collect(Collectors.toList());
    }
    // public List<TaiKhoan> timKiem(TaiKhoan a){
    //     return this.ds.stream().filter(h-> h.equals(a)).collect(Collectors.toList());
    // }
    public TaiKhoan timKiem(TaiKhoan a){
        for (var x : this.ds){
            if(x.equals(a))
                return x;
        }
        return null;
    }
}
