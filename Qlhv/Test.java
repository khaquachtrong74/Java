/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tan.bth2.Qlhv;

import java.io.FileNotFoundException;
import java.text.ParseException;

/**
 *
 * @author admin
 */
public class Test {
    public static void main(String[] args) throws FileNotFoundException{
        QuanLyHocVien ql = new QuanLyHocVien();
        HocVien h1 = new HocVien("Kha","19/10/2002");
        HocVien h2 = new HocVien("Kha4","12/03/2003");
        HocVien h3 = new HocVien("Kha3","24/08/2002");
        HocVien h4 = new HocVien("Kha2","06/12/2009");
        HocVien h5 = new HocVien("Kha1","25/05/2001");
        
        ql.themHocVien(h1,h2,h3,h4,h5);
//        ql.themHocVien("src/main/resources/taiLieu.txt");
        ql.nhapDiem();
        ql.hienThi();
        ql.xuatHB("src/main/resources/hocBong.txt");
    }
}
