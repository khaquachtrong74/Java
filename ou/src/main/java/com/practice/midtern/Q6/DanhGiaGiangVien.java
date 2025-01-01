package com.practice.midtern.Q6;

public class DanhGiaGiangVien extends DanhGia{
    private GiangVien giangVien;
    private double score;

    public DanhGiaGiangVien(GiangVien giangVien, String ngayThucHien, SinhVien sinhVien, String hocKy) {
        super(ngayThucHien, sinhVien, hocKy);
        this.giangVien = giangVien;
        
    }
   

    @Override
    public void dienNoiDung() {
        // throw new UnsupportedOperationException("Not supported yet.");
        String line;
        // System.out.println("Thong tin tat ca giang vien, hay chon de tiep tuc danh gia");
       int dem=1;
        while(dem < 50){
            System.out.printf("Nhap noi dung dong %d:\t", dem++);
            line = CauHinh.SC.nextLine();
            this.noiDung.add(line);
        }
        // giả sử điểm đánh giá không lệch quá mức quy định 0-4
        System.out.println("Nhap so diem danh gia cua giang vien: ");
        this.score = Integer.parseInt( CauHinh.SC.nextLine()); 
    }

}
