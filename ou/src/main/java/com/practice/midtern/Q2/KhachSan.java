package com.practice.midtern.Q2;

import java.time.LocalDate;
import java.util.List;

public class KhachSan {
    private static int dem;
    private String maKhachSan = String.format("HOTEL-%05d", dem++);
    private String hoTen;
    private String diaChi;
    private String soSao; // 3-5sao
    private LocalDate namThanhLap;
    // private List<DatPhong> ds = new ArrayList<>();
    private QLDatPhong ds = new QLDatPhong();
    private QLPhong ds1 = new QLPhong();
    public KhachSan(String hoTen, String diaChi, String soSao, LocalDate namThanhLap, List<Phong>dsp) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.soSao = soSao;
        this.namThanhLap = namThanhLap;
        this.ds1 = new QLPhong(dsp);
    }
    // xử lý đặt phòng
    public void datPhong(KhachHang a, String maPhong){
        Phong tmp = ds1.timKiem(maPhong);
        if(a != null && tmp != null){
            String ngayCheckIn;
            String ngayCheckOut;
            System.out.println("Nhap thong tin vao day");
            System.out.println("Nhap ngay Check-In");
            ngayCheckIn=com.excersice2.Question5.CauHinh.SC.nextLine();
            System.out.println("Nhap ngay Check-Out");
            ngayCheckOut=com.excersice2.Question5.CauHinh.SC.nextLine();
            DatPhong tp = new DatPhong(a, ngayCheckIn, ngayCheckOut, "Da Dat");
            this.ds.ds.add(tp);
            if(a.getTuoi() < 18 || !this.ds.ds.get(this.ds.ds.size()-1).getIsDuDieuKien()){
            
                if(!(a instanceof KhachHangNuocNgoai)){            
                
                    System.out.println("khong du dieu kien de dat phong");
                    this.ds.xoaPhongDaDat(tp);
                }
                
                else{
                    if(LocalDate.now().compareTo(((KhachHangNuocNgoai) a).getNgayHetHanVisa() ) > 0){
                        System.out.println("Khong du dieu kien de dat phong");
                        this.ds.xoaPhongDaDat(tp);
                    }   
                }
            }
        }
    }
}


