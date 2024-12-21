package com.excersice4.Quest1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class QLHinh {
    List <Hinh> ds = new ArrayList<>();

    public QLHinh() {
    }
    public QLHinh(List<Hinh> ds){
        this.ds = ds;
    }
    public void themHinh(Hinh... a){
        this.ds.addAll(Arrays.asList(a));
    }
    public void hienThi(){
        this.ds.forEach(h -> System.out.println(h));
    }
    public Hinh timKiem(String ten){
        return this.ds.stream().filter(h -> h.getTen().equals(ten)).findFirst().get();
        // return tmp;
    }
    public void xoaHinhTheoTen(String ten){
        Hinh tmp = timKiem(ten);
        this.ds.remove(tmp);
        System.out.println("Da xoa hinh thanh cong!");
    }
    public List<Hinh> sapXep(){
        return this.ds.stream().sorted(Comparator.comparing(Hinh::getTen).thenComparing(Hinh::tinhDienTich))
        .collect(Collectors.toList());
    }
    /*Sap xep giam dan theo dien tich */
    public void sapXepDienTich(){
        this.ds.sort((h1, h2) -> -Double.compare(h1.tinhDienTich(), h2.tinhDienTich()));
    }
    /*
     * Tinh dien tich trung binh cua tat ca cac hinh
     */
    public double tinhTrungBinhDienTich(){
        return this.ds.stream().mapToDouble(h -> h.tinhDienTich()).average().orElse(0.0);
    }
    public int timHinh(Hinh h){
        return this.ds.indexOf(h);
    }
}
