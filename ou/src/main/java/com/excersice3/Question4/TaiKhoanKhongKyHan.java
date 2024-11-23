package com.excersice3.Question4;

public class TaiKhoanKhongKyHan extends TaiKhoan{

    public TaiKhoanKhongKyHan(String tenTaiKhoan, String soDienThoai, String email, double soTienTaiKhoan, String trangThaiTaiKhoan) {
        super(tenTaiKhoan, soDienThoai, email, soTienTaiKhoan, trangThaiTaiKhoan);
    }
    public double tinhLai(){
        double laiSuat = 0.001; // 0.1% /nam
        return getSoTienTaiKhoan() * laiSuat;
    }
    @Override
    public String toString() {
        return super.toString() + "Khong ky han";
    }
}
