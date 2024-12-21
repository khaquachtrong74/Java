package com.excersice3.ReQuest4;

import java.time.LocalDate;

public enum KyHan {
    MOT_TUAN(7, 0.5) {
        @Override
        public LocalDate ngayDaoHan(LocalDate start) {
            // TODO Auto-generated method stub
            //throw new UnsupportedOperationException("Unimplemented method 'ngayDaoHan'");
            return start.plusDays(this.khoangTime);
        }

        @Override
        public double tinhLai(double st) {
            // throw new UnsupportedOperationException("Not supported yet.");
            return (st*this.laiSuat)*(100*12*4);
        }
    },
    MOT_THANG(1, 4.5) {
        @Override
        public LocalDate ngayDaoHan(LocalDate start) {
            // TODO Auto-generated method stub
            //throw new UnsupportedOperationException("Unimplemented method 'ngayDaoHan'");
            return start.plusMonths(this.khoangTime);
        }

        @Override
        public double tinhLai(double st) {
            // throw new UnsupportedOperationException("Not supported yet.");
            return (st*this.laiSuat)*(100*12);
        }
    },
    MOT_NAM(1, 6.8) {
        @Override
        public LocalDate ngayDaoHan(LocalDate start) {
            // TODO Auto-generated method stub
            // throw new UnsupportedOperationException("Unimplemented method 'ngayDaoHan'");
            return start.plusYears(this.khoangTime);
        }

        @Override
        public double tinhLai(double st) {
            // throw new UnsupportedOperationException("Not supported yet.");
            return (st * this.laiSuat)/(100);
        }
    }
    ;

    protected int khoangTime;
    protected double laiSuat;
    private KyHan(int khoangTime, double laiSuat) {
        this.khoangTime = khoangTime;
        this.laiSuat = laiSuat;
    }
    public abstract LocalDate ngayDaoHan(LocalDate start);    
    public abstract double tinhLai(double st);
}
