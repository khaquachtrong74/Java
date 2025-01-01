package com.practice.midtern.Q6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HeThongDanhGia {
    List<ConNguoi> ds = new ArrayList<>();
    List<DanhGia> ds1 = new ArrayList<>();

    public HeThongDanhGia() {
    }
    public HeThongDanhGia(List<ConNguoi> ds){
        this.ds = ds;
    }
    public void themConNguoi(ConNguoi... cn){
        this.ds.addAll(Arrays.asList(cn));
    }
    public void themDanhGia(DanhGia... danhGia){
        this.ds1.addAll(Arrays.asList(danhGia));
    }
    public void hienSinhVien(){
        List<ConNguoi> tmp = this.ds.stream().filter(cn -> cn instanceof SinhVien).toList();
        tmp.forEach(sv -> System.out.println(sv));
    }
    public void hienGiangVien(){
        List<ConNguoi> tmp = this.ds.stream().filter(cn -> cn instanceof GiangVien).toList();
        tmp.forEach(sv -> System.out.println(sv));
    }
    public void xoa(ConNguoi cn){
        this.ds.remove(cn);
    }
    public ConNguoi timKiem(String maSo){
        return this.ds.stream().filter(cn -> cn.getMaSo().equals(maSo)).findFirst().get();
    }
    public void taoDanhGia(){
        System.out.println("Vui long nhap ma sinh vien de tiep tuc danh gia");
        ConNguoi tmp = (SinhVien) timKiem(CauHinh.SC.nextLine());
        if(tmp == null){
            System.out.println("Khong tim thay sinh vien nay vui long thu lai sau");
        }
        else{
            System.out.println("Vui long nhap ngay thuc hien");
            String ngayThucHien = CauHinh.SC.nextLine();
            System.out.println("Chon loai danh gia ban muon");
            System.out.println("1. Danh gia giang vien");
            System.out.println("2. Danh gia co so vat chat");
            switch(Integer.parseInt(CauHinh.SC.nextLine())){
                case 1->{        
                    hienGiangVien();
                    System.out.println("Vui long nhap ma so giang vien muon danh gia!");
                    String maGiangVien = CauHinh.SC.nextLine();
                    ConNguoi tmp1 = (GiangVien) timKiem(maGiangVien);
                    if(tmp1 == null || !(tmp1 instanceof GiangVien)){
                        System.out.println("Khong tim thay");
                    }
                    else{
                        // String ngayTH = LocalDate.now().format(CauHinh.FORMATTER);
                        DanhGia tmp2 = new DanhGiaGiangVien((GiangVien) tmp1 , ngayThucHien, (SinhVien) tmp, "Hoc ki ");
                        themDanhGia(tmp2);
                        System.out.println("Da danh gia giang vien xong!");
                    }
                }
                case 2->{
                    System.out.println("VUi Lòng chọn 1 trong các cơ sở dưới đây để đánh giá!");
                    System.out.println("""
                        ///
                        VVT: Võ Văn Tần
                        NB : Nhà Bè
                        HHH: Hồ Hảo Hớn
                        LBT: Long Bình Tân
                        ///
                            """);
                    themDanhGia(new DanhGiaCoSoVatChat(ngayThucHien, (SinhVien) tmp, "Hoc ky 1"));
                    System.out.println("Da danh gia xong co so vat chat");
                }   
            }
        }
    }
}