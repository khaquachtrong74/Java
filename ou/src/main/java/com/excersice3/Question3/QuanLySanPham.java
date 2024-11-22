package com.excersice3.Question3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class QuanLySanPham {
    private List<SanPham> ds = new ArrayList<>();

    public QuanLySanPham() {
    }

    public void themSanPham(SanPham sanPhamMoi) {
        ds.add(sanPhamMoi);
        // System.out.println("Them thanh cong");
    }

    public void xoaSanPham(SanPham sanPhamCanXoa) {
        ds.removeIf(x -> x.equals(sanPhamCanXoa));
    }

    public void hienThi() {
        this.ds.forEach(el -> System.out.println(el.toString()));
    }

    public SanPham timKiem(String maSanPhamOrTenSanPham) {
        return this.ds.stream().filter(sp -> sp.getTenSanPham().equals(maSanPhamOrTenSanPham)
                || sp.getMaSanPham().equals(maSanPhamOrTenSanPham)).findFirst().orElse(null);
    }

    public List<SanPham> timKiem(double giaThapNhat, double giaCaoNhat) {
        return this.ds.stream().filter(sp -> sp.getGiaBan() >= giaThapNhat && sp.getGiaBan() <= giaCaoNhat)
                .collect(Collectors.toList());
    }

    public void sapXep(){
        this.ds.sort((sp1, sp2) -> (int)sp1.soSanh(sp2));
    }

    public void capNhapSanPham() {
        System.out.print("Nhap ma san pham vao day: ");
        String maSo = CauHinh.sc.nextLine();
        SanPham tmp = timKiem(maSo);
        System.out.print("Cap nhap ten san pham");
        String tenSp = CauHinh.sc.nextLine();
        System.out.println("Ban muon cap nhap gia san pham (1) hay mo ta san pham (2)");
        int luaChon = Integer.parseInt(CauHinh.sc.nextLine());
        switch (luaChon) {
            case 1:
                System.out.print("Cap nhap mo ta");
                String moTa = CauHinh.sc.nextLine();
                tmp.setTenSanPham(tenSp);
                tmp.setMoTaSanPham(moTa);
                break;
            case 2:
                System.out.print("Cap nhap gia tien");
                double giaBan = Double.parseDouble(CauHinh.sc.nextLine());
                tmp.setTenSanPham(tenSp);
                tmp.setGiaBan(giaBan);
                break;
            default:
                throw new AssertionError();
        }

    }

    void menu() {
        System.out.println("===========MENU==============");
        System.out.println("1. Them san pham");
        System.out.println("2. Xoa san pham | Nhap doi tuong muon xoa trong list.");
        System.out.println("3. Cap nhap ten san pham, mo ta san pham dua tren ma san pham.");
        System.out.println("4. Tim kiem theo ma san pham, ten san pham hoac khoang gia ban");
        System.out.println("5. Sap xep cac san pham giam dan theo gia");
        System.out.println("0. Thoat chuong trinh");
    }

    public static void main(String[] args) {
        QuanLySanPham qlsp = new QuanLySanPham();
        
        // Thêm sản phẩm mẫu
        qlsp.themSanPham(new SanPham("Laptop", "Máy tính", "Dell", 1000.0));
        qlsp.themSanPham(new SanPham("Phone", "Điện thoại", "Apple", 1230.0));
        qlsp.themSanPham(new SanPham("Tablet", "Máy tính bảng", "Samsung", 600.0));

        System.out.println("Danh sách trước khi sắp xếp:");
        qlsp.hienThi();

        qlsp.sapXep();
        
        System.out.println("\nDanh sách sau khi sắp xếp giảm dần:");
        qlsp.hienThi();
    }
}
