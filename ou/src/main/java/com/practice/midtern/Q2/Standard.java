package com.practice.midtern.Q2;

public class Standard extends Phong{
    private int soGiuongDon;

    public Standard(double dienTich, int soGiuongDon) {
        super(dienTich);
        this.soGiuongDon=soGiuongDon;
    }

    @Override
    public double tinhGiaPhong() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'tinhGiaPhong'");
    // 500.000 / 1 đêm
        return 100000*soGiuongDon;
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.printf("So giuong don : %d", this.soGiuongDon);
    }
    

}
