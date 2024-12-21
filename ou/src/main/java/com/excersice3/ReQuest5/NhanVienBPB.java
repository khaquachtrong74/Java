package com.excersice3.ReQuest5;

public class NhanVienBPB extends NhanVien{

    public NhanVienBPB() {
    }

    public NhanVienBPB(String hoTen, String chungMinhND, String queQuan) {
        super(hoTen, chungMinhND, queQuan);
    }

    @Override
    public double tinhLuong(int soNgayCong) {
        // throw new UnsupportedOperationException("Not supported yet.");
        return CauHinh.LUONG*soNgayCong*1.5;
    }

    @Override
    public String toString() {
        return super.toString() + "Nhan Vien bo phan B\n";
    }
    
}
