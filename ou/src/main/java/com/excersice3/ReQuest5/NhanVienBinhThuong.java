package com.excersice3.ReQuest5;

public class NhanVienBinhThuong extends NhanVien {

    public NhanVienBinhThuong() {
    }

    public NhanVienBinhThuong(String hoTen, String chungMinhND, String queQuan) {
        super(hoTen, chungMinhND, queQuan);
    }
    
    
    @Override
    public double tinhLuong(int soNgayCong) {
        // throw new UnsupportedOperationException("Not supported yet.");
        return CauHinh.LUONG*soNgayCong;
    }

    @Override
    public String toString() {
        return super.toString()+String.format("Nhan vien binh thuong\n");
    }
       
}
