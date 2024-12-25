package com.practice.midtern.Q2;

import java.time.LocalDate;

import com.excersice3.ReQuest4.CauHinh;

public class KhachHangNuocNgoai extends KhachHang {
    private int soHoChieu;
    private String quocTich;
    private LocalDate ngayHetHanVisa;
    public KhachHangNuocNgoai(String hoTen, String email, LocalDate ngaySinh, int soHoChieu, String quocTich, String ngayHanVisa) {
        super(hoTen, email, ngaySinh);
        this.soHoChieu = soHoChieu;
        this.quocTich = quocTich;
        this.ngayHetHanVisa = LocalDate.parse(ngayHanVisa, com.excersice3.ReQuest4.CauHinh.FORMATTER);
    }
    @Override
    public void hienThi() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'hienThi'");
        System.out.println(this);
        System.out.printf("So ho chieu : %s\n", this.soHoChieu);
        System.out.printf("Quoc tich : %s\n", this.quocTich);
        System.out.printf("Ngay het han Visa : %s\n", this.ngayHetHanVisa.format(CauHinh.FORMATTER));
    }

    public int getSoHoChieu() {
        return soHoChieu;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public LocalDate getNgayHetHanVisa() {
        return ngayHetHanVisa;
    }


}
