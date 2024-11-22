package com.excersice3.Question3;

public class Sach extends SanPham{
    private int soTrang;
    public Sach(String tenSanPham, String moTaSanPham, String nhaXuatBan, double giaBan, int soTrang){
        super(tenSanPham, moTaSanPham, nhaXuatBan, giaBan);
        this.soTrang = soTrang;
    }
    @Override
    public String toString(){
        return "Sach\n "+ chung() + "\nSo trang :" + String.format("%d", soTrang);
    }

}
