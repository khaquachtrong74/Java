package com.excersice3.Question5;

public class NhanVien {
    private static int dem =1;
    private String maSo = String.format("NhanVien:%5d",dem++);
    private String chungMinhNhanDan;
    private String hoTen;
    private String queQuan;
    private String gioiTinh;
    private String soDienThoaiLienLac;
    public NhanVien(){
        
    }
    public NhanVien(String chungMinhNhanDan, String hoTen, String queQuan, String gioiTinh, String soDienThoaiLienLac) {
        this.chungMinhNhanDan = chungMinhNhanDan;
        this.hoTen = hoTen;
        this.queQuan = queQuan;
        this.gioiTinh = gioiTinh;
        this.soDienThoaiLienLac = soDienThoaiLienLac;
    }
    public int getDem(){
        return dem;
    }
    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public String getChungMinhNhanDan() {
        return chungMinhNhanDan;
    }

    public void setChungMinhNhanDan(String chungMinhNhanDan) {
        this.chungMinhNhanDan = chungMinhNhanDan;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSoDienThoaiLienLac() {
        return soDienThoaiLienLac;
    }

    public void setSoDienThoaiLienLac(String soDienThoaiLienLac) {
        this.soDienThoaiLienLac = soDienThoaiLienLac;
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Ho va ten: ").append(this.hoTen);
        stringBuilder.append("\nSo chung minh nhan dan: ").append(chungMinhNhanDan);
        stringBuilder.append("\nGioi tinh: ").append(this.gioiTinh);
        stringBuilder.append("\nQue quan: ").append(this.queQuan);
        stringBuilder.append("\n So dien thoai: ").append(this.soDienThoaiLienLac);
        return stringBuilder.toString();
    } 
}
