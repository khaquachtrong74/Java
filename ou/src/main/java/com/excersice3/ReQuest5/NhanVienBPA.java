package com.excersice3.ReQuest5;

public class NhanVienBPA extends NhanVien{

    public NhanVienBPA() {
    }

    public NhanVienBPA(String hoTen, String chungMinhND, String queQuan) {
        super(hoTen, chungMinhND, queQuan);
    }

    @Override
    public double tinhLuong(int soNgayCong) {
        // throw new UnsupportedOperationException("Not supported yet.");
        return CauHinh.LUONG*soNgayCong*1.2;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Nhan vien bo phan A \n");
    }
        
}
