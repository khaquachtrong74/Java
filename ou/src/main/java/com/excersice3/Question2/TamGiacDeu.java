package com.excersice3.Question2;

public class TamGiacDeu extends TamGiacCan{

    public TamGiacDeu(double abc) {
        super(abc, abc);
    }
    @Override
    public String toString(){
        return "Tam giac deu\n" + thongTinChung();
    }
}
