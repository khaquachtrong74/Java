package com.practice.midtern.Q2;

public class Suite extends Phong{
    private int soPhong;
    private boolean isBep;
    public Suite(double dienTich, int soPhong, boolean isBep) {
        super(dienTich);
        this.soPhong = soPhong;
        this.isBep = isBep;
    }

    @Override
    public double tinhGiaPhong() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'tinhGiaPhong'");
        // 2.000.000 / 1 đêm
        return (500000*this.soPhong) + (isBep?500000:0);
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.printf("So phong ngu : %d\n", this.soPhong);
        System.out.printf("Bep : %s", this.isBep);
    }
    
}
