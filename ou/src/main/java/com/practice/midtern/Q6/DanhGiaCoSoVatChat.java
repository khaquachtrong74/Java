package com.practice.midtern.Q6;

public class DanhGiaCoSoVatChat extends DanhGia{
     private String tenCoSoVatChat;

    public DanhGiaCoSoVatChat(String ngayThucHien, SinhVien sinhVien, String hocKy) {
        super(ngayThucHien, sinhVien, hocKy);
    }

    @Override
    public void dienNoiDung() {
        // throw new UnsupportedOperationException("Not supported yet.");
        System.out.println("NHap ten co so vat chat");
        this.tenCoSoVatChat = CauHinh.SC.nextLine();
        System.out.println("Nhap noi dung");
        String line = null;
        while(!line.equals("\n") ){
            line=CauHinh.SC.nextLine();
            this.noiDung.add(line);
        }
    }
     

}
