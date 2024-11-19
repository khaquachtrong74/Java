package com.excersice2.Question5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DsPhanSo {
    private List<PhanSo> ds = new ArrayList<>();

    public DsPhanSo() {
    }

    public DsPhanSo(List<PhanSo> ds) {
        this.ds = ds;
    }
    public void them(PhanSo a){
        this.ds.add(a);
    }
    public void them(int tuSo, int mauSo){
        PhanSo tmp = new PhanSo(tuSo, mauSo);
        this.ds.add(tmp);
    }
    public void them(){
        PhanSo tmp = new PhanSo();
        tmp.nhap();
        this.ds.add(tmp);
    }
    public void them(PhanSo... a){
        this.ds.addAll(Arrays.asList(a));
    }
    public void hienThi(){
        if(this.ds == null) return;
        this.ds.forEach(el -> System.out.println(el.toString()));
    }
    public void xoa(PhanSo other){
        if(this.ds == null) return;
        this.ds.removeIf(h-> h.soSanh(other)==0);
    }
    public PhanSo timMax(){
        if(this.ds == null) return null;
        return this.ds.stream().max((p, q) -> p.soSanh(q)).get();
    }
    public PhanSo tong(){
        if(this.ds == null) return null;
        return this.ds.stream().reduce(new PhanSo(), (p,q)-> p.cong(q)).rutGon();
    }
    public void sapXep(){
        if(this.ds == null) return;
        this.ds.sort((p,q)->p.soSanh(q));
    }
}
