package com.excersice3.ReQuest4;

public class TaiKhoanKhongKyHan extends TaiKhoan {

    public TaiKhoanKhongKyHan(double soTien, String tenTaiKhoan) {
        super(soTien, tenTaiKhoan);
    }

    @Override
    public boolean isDaoHan() {
        // throw new UnsupportedOperationException("Not supported yet.");
        return true;
    }

}
