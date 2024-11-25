package com.excersice3.Question5;

public class NhanVienC extends NhanVienBinhThuong{

    public NhanVienC() {
        super(null, null, null, null, null);
    }

    public NhanVienC(String chungMinhNhanDan, String hoTen, String queQuan, String gioiTinh, String soDienThoaiLienLac) {
        super(chungMinhNhanDan, hoTen, queQuan, gioiTinh, soDienThoaiLienLac);
    }

    @Override
    public double tinhLuong() {
        return 2.5 * super.tinhLuong();
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Bo phan: ", "C");
    }
    
}
