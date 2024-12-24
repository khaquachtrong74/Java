package com.excersice4.Quest3;

public class VacXin {
    private static int dem;
    private String maVacXin = String.format("MVX-%05d", dem++);
    private String tenVacXin;
    private String xuatXu; // Comefrom?
    private int soLuong;
    public VacXin(String tenVacXin, String xuatXu, int soLuong) {

        this.tenVacXin = tenVacXin;
        this.xuatXu = xuatXu;
        this.soLuong = soLuong;
    }

    public String getMaVacXin() {
        return maVacXin;
    }

    public void setMaVacXin(String maVacXin) {
        this.maVacXin = maVacXin;
    }

    public String getTenVacXin() {
        return tenVacXin;
    }

    public void setTenVacXin(String tenVacXin) {
        this.tenVacXin = tenVacXin;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    // function
    @Override
    public String toString() {
        // return super.toString();
        return String.format("Ma Vac xin: %s\nTen Vac Xin : %s\nSo luong: %s \nXuat xu : %s\n"
        , this.maVacXin, this.tenVacXin, this.soLuong, this.xuatXu);
    }
    

    
}
