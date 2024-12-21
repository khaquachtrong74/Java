/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.time.LocalDate;

/**
 *
 * @author oslamelon
 */
public class GiangVienThinhGiang extends GiangVien {
    private String noiCongTac;

    public GiangVienThinhGiang(String hoTen, String hocHam, LocalDate ngaySinh,
            String hocVi, LocalDate ngayCongTac, String noiCongTac) {
        super(hoTen, hocHam, ngaySinh, hocVi, ngayCongTac);
        this.noiCongTac = noiCongTac;
    }
    
    public void tinhLuong() {
        this.luong = 90000*this.getSoGioLam();
    }
    
    @Override
    public String toString() {
        return super.toString() + String.format("Noi cong tac: %s\n", 
                this.noiCongTac);
    }
}
