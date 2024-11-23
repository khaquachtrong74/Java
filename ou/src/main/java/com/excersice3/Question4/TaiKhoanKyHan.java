package com.excersice3.Question4;

import java.time.LocalDate;

enum KyHan {
    MOT_TUAN,
    MOT_THANG,
    MOT_NAM
}

public class TaiKhoanKyHan extends TaiKhoan {
    private KyHan kyHan;
    private final LocalDate ngayDaoHan;

    public TaiKhoanKyHan(String tenTaiKhoan, String soDienThoai, String email, double soTienTaiKhoan,
            String trangThaiTaiKhoan, KyHan kyHan) {
        super(tenTaiKhoan, soDienThoai, email, soTienTaiKhoan, trangThaiTaiKhoan);
        this.ngayDaoHan = tinhNgayDaoHan(kyHan);
    }

    private LocalDate tinhNgayDaoHan(KyHan kyHan) {
        LocalDate toDay = LocalDate.now();
        return switch (kyHan) {
            case MOT_TUAN -> toDay.plusWeeks(1);
            case MOT_THANG -> toDay.plusWeeks(1);
            case MOT_NAM -> toDay.plusYears(1);
            default -> toDay;
        };

    }

    public KyHan getKyHan() {
        return kyHan;
    }

    public LocalDate getNgayDaoHan() {
        return ngayDaoHan;
    }
    @Override
    public String toString() {
        return super.toString() + ", Kỳ hạn: " + kyHan + ", Ngày đáo hạn: " + ngayDaoHan;
    }


}
