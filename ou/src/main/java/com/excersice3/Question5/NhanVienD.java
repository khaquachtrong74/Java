package com.excersice3.Question5;

public class NhanVienD extends NhanVienBinhThuong{
    private double bonus;
    public NhanVienD(String chungMinhNhanDan, String hoTen, String queQuan, String gioiTinh, String soDienThoaiLienLac) {
        super(chungMinhNhanDan, hoTen, queQuan, gioiTinh, soDienThoaiLienLac);
    }
    public NhanVienD(){
        super();
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public double getBonus() {
        return bonus;
    }

    @Override
    public double tinhLuong() {
        return super.tinhLuong()*super.getSoNgayCong() + getBonus();
    }
    
}
