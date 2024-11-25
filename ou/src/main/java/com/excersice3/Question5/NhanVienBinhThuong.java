package com.excersice3.Question5;

public class NhanVienBinhThuong extends NhanVien{
    private double luong=100000;
    private int soNgayCong;
    public NhanVienBinhThuong(){
        super();
    }
    public NhanVienBinhThuong(String chungMinhNhanDan, String hoTen, String queQuan, String gioiTinh, String soDienThoaiLienLac) {
        super(chungMinhNhanDan, hoTen, queQuan, gioiTinh, soDienThoaiLienLac);
    }
    // caculate salary
    public double tinhLuong(){
        return luong*soNgayCong;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("So ngay cong: %d\n Tien luong: %.5f\n", soNgayCong, tinhLuong());
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public int getSoNgayCong() {
        return soNgayCong;
    }

    public void setSoNgayCong(int soNgayCong) {
        this.soNgayCong = soNgayCong;
    }
    
}
