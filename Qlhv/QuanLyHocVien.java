/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tan.bth2.Qlhv;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author admin
 */
public class QuanLyHocVien {
    private static final List<HocVien> dsHocVien = new ArrayList<>();
    public void themHocVien(HocVien... a){
        QuanLyHocVien.dsHocVien.addAll(Arrays.asList(a));
    }
    public void hienThi(){
        QuanLyHocVien.dsHocVien.forEach(hocVien -> hocVien.hienThi());
        
    }
    public void nhapDiem(){
        QuanLyHocVien.dsHocVien.forEach(hocVien -> hocVien.nhapDiem());
    }
    public void themHocVien(String duongDan) throws FileNotFoundException{
        File file = new File(duongDan);
        try(Scanner sc = new Scanner(file)){
            while(sc.hasNext()){
                this.dsHocVien.add(new HocVien(sc.nextLine(),sc.nextLine()));
            }
        }catch(FileNotFoundException e){
            System.out.println("Khong tim thay file "+ duongDan);
        }
    }
    public void docFileHocVien(String duongDan){
        File file = new File(duongDan);
        try(Scanner sc = new Scanner(file)){
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Khong tim thay file" + duongDan);
        }
    }
    public HocVien timKiem(int id){
        return QuanLyHocVien.dsHocVien.stream().filter(h -> h.getMaSo() == id).findFirst().get();
    }
    public List<HocVien> timKiem(String kw){
        return QuanLyHocVien.dsHocVien.stream().filter(h-> h.getHoTen().contains(kw)).collect(Collectors.toList());
    }
    public List<HocVien> timKiem(){
        return QuanLyHocVien.dsHocVien.stream().filter(h -> h.isHocBong()).collect(Collectors.toList());
    }
    public void xuatHB(String duongDan) throws FileNotFoundException{
        File f = new File(duongDan);
        try(PrintWriter w = new PrintWriter(f)){
            List<HocVien> hb = this.timKiem();
            hb.forEach(h -> w.printf("%s - %.1f\n",h.getHoTen(), h.tinhDiemTB()));
        }
        
    }
//    }
//    public void vietFileHocVien(String duongDan){
//        BufferWritter writer = new BufferWritter(duong)
//    }
}
