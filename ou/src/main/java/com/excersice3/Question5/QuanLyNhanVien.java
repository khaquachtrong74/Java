package com.excersice3.Question5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class QuanLyNhanVien {
    private final List<NhanVien> dsNhanVien = new ArrayList<>();
    private Map<String, Supplier<NhanVien>> boPhanRegistry = new HashMap<>();

    public void themNhanVien(NhanVien... a) {
        this.dsNhanVien.addAll(Arrays.asList(a));
    }

    public QuanLyNhanVien() {
        boPhanRegistry.put("A", () -> new NhanVienA());
        boPhanRegistry.put("B", () -> new NhanVienB());
        boPhanRegistry.put("C", () -> new NhanVienC());
    }

    public void dangKyBoPhan(String tenBoPhan, Supplier<NhanVien> factory) {
        boPhanRegistry.put(tenBoPhan, factory);
    }

    public NhanVien taoNhanVien(String tenBoPhan, String hoTen, String cmnd, String queQuan, String gioiTinh,
            String soDienThoai) {
        Supplier<NhanVien> factory = boPhanRegistry.getOrDefault(tenBoPhan, NhanVienBinhThuong::new);
        NhanVien nhanVien = factory.get();
        nhanVien.setHoTen(hoTen);
        nhanVien.setChungMinhNhanDan(cmnd);
        nhanVien.setQueQuan(queQuan);
        nhanVien.setGioiTinh(gioiTinh);
        nhanVien.setSoDienThoaiLienLac(soDienThoai);
        return nhanVien;
    }

    public void xoaNhanVienMoi() {
        // xoa nhan vien moi duoc them vao
        // xoa cuoi
        this.dsNhanVien.remove(this.dsNhanVien.size() - 1);
    }

    public void hienThi() {
        this.dsNhanVien.forEach(nhanVien -> System.out.println(nhanVien));
    }

    public NhanVien traCuu(String info) {

        return this.dsNhanVien.stream().filter(
                el -> el.getHoTen().equalsIgnoreCase(info) || el.getChungMinhNhanDan().equals(info)
                        || el.getHoTen().equals(info))
                .findFirst().orElse(null);
    }

    public NhanVien traCuu() {
        String info = CauHinhQ5.SC.nextLine();
        return this.dsNhanVien.stream().filter(
                el -> el.getHoTen().equalsIgnoreCase(info) || el.getChungMinhNhanDan().equals(info)
                        || el.getHoTen().equals(info))
                .findFirst().orElse(null);
    }

    public void tinhTienLuong() {
        if (this.dsNhanVien.isEmpty()) {
            System.out.println("Danh sach trong.");
        } else {
            for (NhanVien nhanVien : dsNhanVien) {
                if (nhanVien instanceof NhanVienBinhThuong) {
                    System.out.println("=============================");
                    System.out.println("Nhap so nhay cong cho nhan vien " + nhanVien.getHoTen());
                    int ngayCong = Integer.parseInt(CauHinhQ5.SC.nextLine());
                    NhanVienBinhThuong tmp = (NhanVienBinhThuong) traCuu(nhanVien.getChungMinhNhanDan());
                    tmp.setSoNgayCong(ngayCong);
                    System.out.println("================================");
                    System.out.println(tmp);
                } else {
                    System.out
                            .println("Nhan vien" + nhanVien + " Khong phai nhan vien binh thuong nen khong tinh cong!");
                }
            }
        }
    }
}
