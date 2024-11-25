package com.excersice3.Question5;

public class NhanVienB extends NhanVienBinhThuong{

    public NhanVienB() {
        super(null, null, null, null, null);
    }

    public NhanVienB(String chungMinhNhanDan, String hoTen, String queQuan, String gioiTinh, String soDienThoaiLienLac) {
        super(chungMinhNhanDan, hoTen, queQuan, gioiTinh, soDienThoaiLienLac);
    }

    @Override
    public double tinhLuong() {
        return 1.5 * super.tinhLuong();
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Bo Phan : %s", "B");
    }
        
}
