package com.excersice4.Quest3;

import java.util.ArrayList;
import java.util.List;

import com.excersice3.Question3.CauHinh;

public class QLTiemChung {
    // TiemChung ql = new TiemChung();
    List<TiemChung> ql = new ArrayList<>();
    private QLVacXin infoVacXin;
    public QLTiemChung() {
    }
    
    public QLTiemChung(QLVacXin infoVacXin, QLNguoiDan ngd) {
        this.infoVacXin = infoVacXin;
        int dem=0;
        // System.out.println(ngd.ds.get(0));
        for(var q : ngd.ds){
            this.ql.add(new TiemChung(q));
        }
        // for(var q : this.ql){
        //     System.out.println(ngd.ds.get(0));
        //     q.setNguoiDan(ngd.ds.get(dem++));
        // }
        // this.ql.forEach(nguoi -> nguoi.setNguoiDan(ngd.get(dem)));
    }

    // hien thi nhung nguoi da tiem 2 mui
    public void hienThi(){
        // this.ql.stream().filter(nguoi -> nguoi.getNgayTiem().size()-1 >= 2).forEach(ng -> ng.getNguoiDan().hienThi());
        this.ql.forEach(q -> q.hienThi());
    }
    // hien thi
    public void hienThi(boolean f){
        this.ql.forEach(q -> q.getNguoiDan().hienThi());
    }
    /* dien thong tin cho het tat ca nguoi co trong danh sach */
    public void dienThongTin(){
        System.out.println("Nhap loai vac xin muon dung");
        String nameVacXin = CauHinh.sc.nextLine();
        if(this.infoVacXin.timKiem(nameVacXin) == null) {
            System.out.println("Khong co loai vac xin nay vui long nhap loai khac");
            return;
        }  
        this.ql.forEach(
            nguoi -> nguoi.dienThongTin(this.infoVacXin, nameVacXin)
            );
    }
    public void dienThongTin(NguoiDan nguoiDan){
        System.out.println("Nhap loai vac xin muon dung");
        String nameVacXin = CauHinh.sc.nextLine();
        if(this.infoVacXin.timKiem(nameVacXin) == null) {
            System.out.println("Khong co loai vac xin nay vui long nhap loai khac");
            return;
        }  
        TiemChung a = this.ql.stream().filter(q -> q.getNguoiDan().equals(nguoiDan)).findFirst().get();
        if(a == null) {
            System.out.println("khong tim thay!");
            return;
        }
        a.dienThongTin(infoVacXin, nameVacXin);
    }
}
