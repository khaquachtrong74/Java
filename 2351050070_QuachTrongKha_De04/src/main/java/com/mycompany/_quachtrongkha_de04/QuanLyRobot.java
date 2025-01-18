/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._quachtrongkha_de04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author admin
 */
public class QuanLyRobot {
    List<Robot> ds = new ArrayList<>();

    public QuanLyRobot() {
    }
    
    public void themRobot(Robot... rb){
        this.ds.addAll(Arrays.asList(rb));
    }
    public void hienThiTrongBaNamGan(){
//        this.ds.forEach(rb -> System.out.println(rb));
        this.ds.stream().filter(rb -> 
                rb.getNgaySanXuat().getYear() <= 2024 &&
                rb.getNgaySanXuat().getYear() >= 2022).forEach(rb -> rb.hienThi());
    }
    // sap xep giam dan theo do uu tien
    // tang dang theo thoi gian
    
    public void sapXep(){
        this.ds.sort(Comparator.comparing(Robot::getNgaySanXuat));
    }
    public void hienThiRobotDelivering(){
        this.ds.stream().filter(rb -> rb.getTrangThai().getColor().equals("Mau cam"))
                .forEach(b -> b.hienThi());
    }
    public Robot timKiem(String maRobot){
        return this.ds.stream().filter(rb -> rb.getMaSo().equals(maRobot)).findFirst().get();
    }
    public void giaoNhiemVu(NhiemVu nhiemVu){
        String maSo;
        System.out.println("Nhap ma so robot ban muon giao");
        maSo = CauHinh.SC.nextLine();
        Robot tmp = timKiem(maSo);
        if(tmp == null){
            System.out.println("Khong tim thay robot nay! vui long thu lai");
        }
        else{
            if(tmp.getTrangThai() instanceof Idle){
                tmp.themNhiemVu(nhiemVu);
                tmp.setTrangThai(new Delivering(nhiemVu));
            }
            else{
                System.out.println("Loi: Robot" + tmp.getMaSo()+ " khong o trang thai phu hop");
                System.out.println(tmp.getTrangThai());
            }
        }
    }
}
