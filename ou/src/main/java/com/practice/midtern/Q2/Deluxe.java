package com.practice.midtern.Q2;

public class Deluxe extends Phong{
    private int soGiuongDoi;
    private boolean isBanCong;

    public Deluxe(double dienTich, int soGiuongDoi, boolean isBanCong) {
        super(dienTich);
        this.soGiuongDoi = soGiuongDoi;
        this.isBanCong = isBanCong;
    }

    @Override
    public double tinhGiaPhong() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'tinhGiaPhong'");
        // 1.200.000 / 1 đêm
        return (200000*this.soGiuongDoi) + (isBanCong?300000:0);
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.printf("So giuong doi : %d\n", this.soGiuongDoi);
        System.out.printf("Ban cong : %s \n", this.isBanCong);
    }
    
}
