package com.practice.midtern.Q6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Thực hiện nhiều đánh giá trong học kỳ
    // thông tin cơ bản gồm
//     Mã đánh giá, nội dung, sinh viên và ngày, năm thực hiện
//          2 nhóm được đánh giá là giảng viên và cơ sở vật chất


public abstract class DanhGia {
    private static int dem;
    private String maDanhGia = String.format("MDG-%05d", dem++);
    protected List<String> noiDung = new ArrayList<>();
    private SinhVien sinhVien;
    private LocalDate ngayThucHien;
    private String hocKy;

    public DanhGia(String ngayThucHien, SinhVien sinhVien, String hocKy) {
        this.ngayThucHien = LocalDate.parse(ngayThucHien, CauHinh.FORMATTER);
        this.sinhVien = sinhVien;
        this.hocKy = hocKy;
    }
    public abstract void dienNoiDung();

    @Override
    public String toString() {
        // return super.toString();
        return String.format("Ma danh gia: %s\nNgay thuc hien: %s\nSinh vien: %s\n"
            ,this.maDanhGia,this.ngayThucHien.format(CauHinh.FORMATTER), this.sinhVien);
    }
    
}
