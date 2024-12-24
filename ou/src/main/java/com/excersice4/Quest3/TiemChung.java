package com.excersice4.Quest3;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class TiemChung {
    private final int SOLUONGTOIDA=3;
    private NguoiDan nguoiDan;
    // this ds here use to show info about availible vac xin now
    
    // ds use to save info about vacxin
    private QLVacXin daTiem = new QLVacXin();
    private List<LocalDate> ngayTiem = new ArrayList<>();
    public TiemChung() {
    }
    

    public TiemChung(NguoiDan nguoiDan) {
        this.nguoiDan = nguoiDan;
        
    }
    
    // Kiem tra nguoi dan co du dieu kien de tiem khong;
    public boolean isPossible(){
        // kiem tra xem lan cuoi tiem cho toi hien tai cach bao nhieu ngay
        Period time = Period.between(ngayTiem.get(ngayTiem.size() - 1), LocalDate.now());
        return ( time.getMonths() < 3
         && LocalDate.now().getYear() - nguoiDan.getNgaySinh().getYear() >= 18 && ngayTiem.size() < SOLUONGTOIDA);
    }
    public void dienThongTin(QLVacXin infoVacXin, String nameVacXin){
        // if(isPossible()){
            // this.ds.hienThi();
            VacXin a = infoVacXin.timKiem(nameVacXin);
            if(a != null)
                System.out.println("Co");
            // this.daTiem.ds.add(infoVacXin.timKiem(nameVacXin));
            this.daTiem.ds.add(a);
            a.setSoLuong((a.getSoLuong()-1 < 0 ? 0 : a.getSoLuong()-1));
            System.out.println("Nhap ngay hom nay : ");
            int ngay = Integer.parseInt(com.excersice2.Question5.CauHinh.SC.nextLine());
            System.out.println("Nhap thang : ");
            int thang = Integer.parseInt(com.excersice2.Question5.CauHinh.SC.nextLine());
            System.out.println("Nhap nam : ");
            int nam = Integer.parseInt(com.excersice2.Question5.CauHinh.SC.nextLine());
            ngayTiem.add(LocalDate.of(nam,thang,ngay));
        // }
    }
    public void hienThi(){
        nguoiDan.hienThi();
        System.out.println("Cac loai vacxin ma nguoi nay da tiem");
        for(int i = 0; i < ngayTiem.size();i++){
            System.out.printf("Vac xin: %s : Ngay tiem : %s", 
            daTiem.ds.get(i),ngayTiem.get(i).format(com.excersice3.ReQuest4.CauHinh.FORMATTER));
        }   
    }
    // nguoi dan da tiem 2 mui se duoc hien thi

    public NguoiDan getNguoiDan() {
        return nguoiDan;
    }

    public void setNguoiDan(NguoiDan nguoiDan) {
        this.nguoiDan = nguoiDan;
    }


    public QLVacXin getDaTiem() {
        return daTiem;
    }

    public void setDaTiem(QLVacXin daTiem) {
        this.daTiem = daTiem;
    }

    public List<LocalDate> getNgayTiem() {
        return ngayTiem;
    }

    public void setNgayTiem(List<LocalDate> ngayTiem) {
        this.ngayTiem = ngayTiem;
    }

}
