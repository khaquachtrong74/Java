package com.excersice4.Quest3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class QLVacXin {
    List<VacXin> ds = new ArrayList<>();

    public QLVacXin() {
    }

    public QLVacXin(List<VacXin> ds) {
        this.ds = ds;
    }
    public QLVacXin(QLVacXin other){
        this.ds = other.ds;
    }
    // function
    public void them(VacXin... a){
        this.ds.addAll(Arrays.asList(a));
    }
    public void xoa(VacXin a ){
        this.ds.remove(a);
    }
    public void hienThi(){
        System.out.println("Hien thi danh sach Vac xin");
        this.ds.forEach(vx -> System.out.println(vx));
    }
    /* sort with increase - xuat su
     * decrease with soLuong
     */
    public void sapXep(){
        this.ds.sort(Comparator.comparing(VacXin::getXuatXu).thenComparing(VacXin::getSoLuong).reversed());
    }
    public VacXin timKiem(String name){
        return this.ds.stream().filter(vx -> vx.getTenVacXin().equals(name)).findFirst().get();
    }

}
