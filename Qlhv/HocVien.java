/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tan.bth2.Qlhv;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;
import java.util.stream.DoubleStream;

/**
 *
 * @author admin
 */
public class HocVien {
    private int maSo;
//    private static Scanner sc = new Scanner(System.in);
    private static int dem = 0;
    private LocalDate ngaySinh;
    private Double diemToan;
    private Double diemLy;
    private Double diemHoa;
    private double[] diem;
    private String hoTen, queQuan;
    {
        setDem(getDem() + 1);
        this.setMaSo(getDem());
    }

    public HocVien() {
    }

    public HocVien(String hoTen,LocalDate ngaySinh){
        this.hoTen = hoTen;
        
        this.ngaySinh = ngaySinh;
        this.diemToan = null;
        this.diemLy = null;
        this.diemHoa = null;
    }
    public HocVien(String hoTen,String ngaySinh){
        this(hoTen, LocalDate.parse(ngaySinh, CauHinh.FORMATTER));
    }
    public void hienThi(){
        System.out.printf("%d - %s - %s\n", maSo, hoTen, ngaySinh.format(CauHinh.FORMATTER));
        if(this.diem  != null){
            for(var x : diem){
                System.out.printf("%.1f\t", x);
            }
            System.out.println("");
        }
    }
    /**
     * @return the maSo
     */
    public int getMaSo() {
        return maSo;
    }

    /**
     * @param maSo the maSo to set
     */
    public void setMaSo(int maSo) {
        this.maSo = maSo;
    }

    /**
     * @return the dem
     */
    public static int getDem() {
        return dem;
    }

    /**
     * @param aDem the dem to set
     */
    public static void setDem(int aDem) {
        dem = aDem;
    }

    /**
     * @return the ngaySinh
     */
    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    /**
     * @param ngaySinh the ngaySinh to set
     */
    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    /**
     * @return the diemToan
     */
    public Double getDiemToan() {
        return diemToan;
    }

    /**
     * @param diemToan the diemToan to set
     */
    public void setDiemToan(Double diemToan) {
        this.diemToan = diemToan;
    }

    /**
     * @return the diemLy
     */
    public Double getDiemLy() {
        return diemLy;
    }

    /**
     * @param diemLy the diemLy to set
     */
    public void setDiemLy(Double diemLy) {
        this.diemLy = diemLy;
    }

    /**
     * @return the diemHoa
     */
    public Double getDiemHoa() {
        return diemHoa;
    }

    /**
     * @param diemHoa the diemHoa to set
     */
    public void setDiemHoa(Double diemHoa) {
        this.diemHoa = diemHoa;
    }

    /**
     * @return the hoTen
     */
    public String getHoTen() {
        return hoTen;
    }

    /**
     * @param hoTen the hoTen to set
     */
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    /**
     * @return the queQuan
     */
    public String getQueQuan() {
        return queQuan;
    }

    /**
     * @param queQuan the queQuan to set
     */
    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }
    
    public void setDiem(double toan, double ly, double hoa){
        this.setDiemToan(diemToan);
        this.diemLy = ly;
        this.diemHoa = hoa;
    }
    public double tinhDiemTB(){
        if(this.diem!= null){
            return DoubleStream.of(this.diem).average().getAsDouble();
        }
        return 0;
    }
    public boolean isHocBong(){
        if(this.diem != null){
           for(var x : this.diem)
               if(x < 5) return false;
           return 8 <= tinhDiemTB(); 
        }   
        return false;
    }
    public void nhapDiem(){
        System.out.printf("== Nhap diem cho ban : %s",this.hoTen);
        System.out.println("");
        this.diem = new double[CauHinh.SO_MON];
        for(int i = 0; i < CauHinh.SO_MON;i++){
            System.out.printf("Nhap diem thu %d \n",i+1);
            this.diem[i] = CauHinh.SC.nextDouble();
        }
    }
    
//    public double tinhDiemTrungBinh() {
//        if (diemToan != null || diemLy != null || diemHoa != null) {
//            return (diemToan + diemLy + diemHoa) / 3;
//        }
//        return 0.0;
//    }
//
//    public boolean isScholarship() {
//        return tinhDiemTrungBinh() >= 8.0 && diemToan >= 5 && diemLy >= 5 && diemHoa >= 5;
//    }
//
//    @Override
//    public String toString() {
//        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
//        String ngaySinhStr = f.format(ngaySinh);
//        return "MaHV: " + maSo + " - Ho Ten: " + hoTen + " - Que Quan: " + queQuan + " - Ngay Sinh: " + ngaySinhStr
//                + " - Diem Toan: " + diemToan + " - Diem Ly: " + diemLy + " - Diem Hoa: " + diemHoa;
//    }
}
