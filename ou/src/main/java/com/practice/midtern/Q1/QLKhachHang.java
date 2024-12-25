package com.practice.midtern.Q1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class QLKhachHang {
    List<KhachHang> ds = new ArrayList<>();
    String path;
    public void hienThi(){
        this.ds.forEach(kh -> System.out.println(kh));
    }
    public QLKhachHang(String path) throws IOException{
        try(BufferedReader a = new BufferedReader(new FileReader(path))){
            a.readLine();
            a.readLine();
            StringBuilder sb = new StringBuilder();
            String line = a.readLine();
            while(line != null){
                String[] part = line.trim().split(",\\s*");
                int len = part.length;
                switch(len){
                    case 3 ->{
                        this.ds.add(new KhachHang(part[0], part[1], Double.parseDouble(part[2])));
                    }
                    case 4 ->{
                        this.ds.add(new KhachHangVip(part[0],part[1],Double.parseDouble(part[2]),part[3]));
                    }
                    default ->{
                        System.out.println(line);
                        System.out.println(len);
                        System.out.println("Khong xac dinh");
                    }
                }
                line = a.readLine();
            }
            // String everyThing = sb.toString();
            
            // System.out.println(everyThing);
       }
    }
    // hien thi khach hang thuong
    public void hienThiKhachThuong(){
        this.ds.stream().filter(kh -> !(kh instanceof KhachHangVip)).forEach(k -> System.out.println(k));
    }
    // sap xep khach hang theo so du tang dan
    public void sapXep(){
        this.ds.sort(Comparator.comparing(KhachHang::getSoDu));
    }
}
