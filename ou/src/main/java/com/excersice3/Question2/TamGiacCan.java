package com.excersice3.Question2;

public class TamGiacCan extends TamGiac{

    public TamGiacCan(double ab, double c) {
        super(ab, ab, c);
    }
    @Override
    public String toString(){
        return "Tam giac can\n" + thongTinChung();
    }
}
