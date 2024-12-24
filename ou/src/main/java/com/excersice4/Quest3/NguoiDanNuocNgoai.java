package com.excersice4.Quest3;

import java.time.LocalDate;

public class NguoiDanNuocNgoai extends NguoiDan{
    private String hoChieu;
    private String quocTich;

    public NguoiDanNuocNgoai(String canCuoc, String gender, String hoTen, LocalDate ngaySinh, String soDienThoai, String hoChieu,
    String quocTich) {
        super(canCuoc, gender, hoTen, ngaySinh, soDienThoai);
        this.hoChieu = hoChieu;
        this.quocTich = quocTich;
    }

    // function
    @Override
    public void hienThi() {
        super.hienThi();
        System.out.printf("Ho chieu : %s\n", hoChieu);
        System.out.printf("QUoc Tich : %s\n", quocTich);
    }
    
}
