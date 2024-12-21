package com.excersice3.ReQuest4;

import java.time.LocalDate;

public class TaiKhoanCoKyHan extends TaiKhoan{
    private KyHan kyHan;
    private LocalDate ngayDaoHan;
    public TaiKhoanCoKyHan(double soTien, String tenTaiKhoan, KyHan kyHan) {
        super(soTien, tenTaiKhoan);
        this.kyHan = kyHan;
        this.ngayDaoHan = this.kyHan.ngayDaoHan(LocalDate.now());
    }

    @Override
    public boolean isDaoHan() {
    //    throw new UnsupportedOperationException("Not supported yet.");
        // return this.kyHan.ngayDaoHan(LocalDate);    
        return this.ngayDaoHan.equals(LocalDate.now());
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.printf("\nKyHan: %s\nNgay Dao Han : %s \n", this.kyHan, this.ngayDaoHan.format(CauHinh.FORMATTER));
    }

    
    
}
