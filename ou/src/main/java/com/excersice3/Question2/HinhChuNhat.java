package com.excersice3.Question2;

public class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;
    public HinhChuNhat(double dai, double rong){
        this.chieuDai = dai;
        this.chieuRong = rong;
    }
    public double tinhDienTich(){
        return this.chieuDai*this.chieuRong;
    }
    public double tinhChuVi(){
        return 2*(this.chieuDai+this.chieuRong);
    }
    protected String thongTinChung(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Chieu dai : ");
        stringBuilder.append(this.chieuDai);
        stringBuilder.append("\nhieu rong: ");
        stringBuilder.append(this.chieuRong);
        stringBuilder.append("\nDien tich : ").append(this.tinhDienTich());
        stringBuilder.append("\nChu Vi: ").append(this.tinhChuVi());
        return stringBuilder.toString();
    }
    @Override
    public String toString(){
        
        return "Hinh Chu nhat \n" + thongTinChung();
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }
}
