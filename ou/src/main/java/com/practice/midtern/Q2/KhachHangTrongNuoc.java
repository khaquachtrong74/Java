package com.practice.midtern.Q2;

import java.time.LocalDate;

public class KhachHangTrongNuoc extends KhachHang{
    private String soCCCD;
    public KhachHangTrongNuoc(String hoTen, String email, LocalDate ngaySinh, String sCCCD) {
        super(hoTen, email, ngaySinh);
        this.soCCCD =sCCCD;
    }
    @Override
    public void hienThi() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'hienThi'");
        System.out.println(this);
        System.out.printf("So can cuoc cong dan : %s\n", soCCCD);
    }
    

}
