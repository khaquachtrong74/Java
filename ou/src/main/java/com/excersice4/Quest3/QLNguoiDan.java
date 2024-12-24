package com.excersice4.Quest3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QLNguoiDan {

    List<NguoiDan> ds = new ArrayList<>();

    public QLNguoiDan() {
    }

    public QLNguoiDan(List<NguoiDan> ds) {
        this.ds = ds;
    }
    // function   
    public void them(NguoiDan... a){
        this.ds.addAll(Arrays.asList(a));
    }
    public void xoa(NguoiDan a){
        this.ds.remove(a);
    }
    public void hienThi(){
        System.out.println("Hien thi danh sach nguoi dan");
        this.ds.forEach(nguoiDan -> nguoiDan.hienThi());
    }
    public NguoiDan timKiem(String canCuoc){
        return this.ds.stream().filter(nguoiDan -> nguoiDan.getCanCuoc().equals(canCuoc)).findFirst().get();
    }
}
