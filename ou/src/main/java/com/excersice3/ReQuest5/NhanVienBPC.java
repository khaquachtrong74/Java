package com.excersice3.ReQuest5;

public class NhanVienBPC extends NhanVien{

    public NhanVienBPC() {
    }

    public NhanVienBPC(String hoTen, String chungMinhND, String queQuan) {
        super(hoTen, chungMinhND, queQuan);
    }
    
    @Override
    public double tinhLuong(int soNgayCong) {
        // throw new UnsupportedOperationException("Not supported yet.");
        return CauHinh.LUONG*soNgayCong*2.5;
    }

    @Override
    public String toString() {
        return super.toString() + "Nhan vien bo phan C \n";
    }
        
}
