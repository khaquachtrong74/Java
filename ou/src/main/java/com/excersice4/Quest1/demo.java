package com.excersice4.Quest1;

public class demo {
    public static void line(){
        System.out.println("===================================");
    }
    public static void main(String[] args) {
        Hinh a = new HinhChuNhat("Chu nhat", 12, 16);
        Hinh b = new HinhTron("Tron", 50);
        Hinh c = new HinhChuNhat("Chu nhat", 45, 60);
        Hinh d = new TamGiacDeu("Tam giac deu", 8);
        Hinh e = new TamGiac("Tam Giac", 12, 10, 5);
        Hinh f = new HinhTron("Tron", 16);
        Hinh g = new HinhVuong("Vuong", 8);
    
        QLHinh nhieuHinh = new QLHinh();
        nhieuHinh.themHinh(a,b,c,d,e,f,g);
        line();    
        System.out.println("DANH SACH CAC HINH");
        nhieuHinh.hienThi();
        line();
        System.out.println("Xoa hinh theo ten");
        String ten = com.excersice2.Question5.CauHinh.SC.nextLine();
        nhieuHinh.xoaHinhTheoTen(ten);
        nhieuHinh.hienThi();
        line();
        System.out.println("Sap xep theo ten, neu trung se theo dien tich");
        QLHinh tmp = new QLHinh(nhieuHinh.sapXep());
        tmp.hienThi();
        line();
        System.out.println("Sap xep theo dien tich");
        tmp.sapXepDienTich();
        tmp.hienThi();
        line();
        System.out.printf("Dien tich trung binh : %.3f\n", tmp.tinhTrungBinhDienTich());
        line();
        System.out.println("Tim hinh");
        int pos = tmp.timHinh(new HinhChuNhat("Chu nhat", 12, 16));
        System.out.printf("Da tim thay tai %d", pos);
    }

}
