package com.excersice3.Question5;

public class NhanVienA extends NhanVienBinhThuong{

    public NhanVienA(String chungMinhNhanDan, String hoTen, String queQuan, String gioiTinh, String soDienThoaiLienLac) {
        super(chungMinhNhanDan, hoTen, queQuan, gioiTinh, soDienThoaiLienLac);
    }
    public NhanVienA(){
        super();
    }
    @Override
    public double tinhLuong(){
        return 1.2 * super.tinhLuong();
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Bo phan : %s ", "A");
    }
    
}
