package com.excersice2.Question5;

public class PhanSo {
    private int tuSo;
    private int mauSo;

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public PhanSo(int tuSo) {
        this(tuSo, 1);
    }
    public PhanSo(){
        this(0,1);
    }
    public static int ucln(int a, int b){
        int tmp;
        while(a != 0){
            tmp = b % a;
            b = a;
            a = tmp;
        }
        return b;
    }
    public PhanSo rutGon(){
        int ucln = ucln(tuSo, mauSo);
        this.tuSo /= ucln;
        this.mauSo /=ucln;
        if(mauSo < 0){
            this.tuSo = -this.tuSo;
            this.mauSo = - this.mauSo;
        }
        return new PhanSo(this.tuSo, this.mauSo);
    }
    public PhanSo cong(PhanSo other){
        int newNum = this.tuSo * other.mauSo + other.tuSo * this.mauSo;
        int newDeno = this.mauSo * other.mauSo;
        PhanSo newPhanSo = new PhanSo(newNum, newDeno);
        newPhanSo.rutGon();
        return newPhanSo;
    }
    public int soSanh(PhanSo other){
        this.rutGon();
        other.rutGon();
         int thisValue = this.tuSo * other.mauSo;
        int otherValue = other.tuSo * this.mauSo;
        return Integer.compare(thisValue, otherValue);
    }
    public void nhap(){
        this.tuSo = CauHinh.SC.nextInt();
        this.mauSo = CauHinh.SC.nextInt();
    }
    @Override
    public String toString() {
        return tuSo + " / " + mauSo;
    }

}
