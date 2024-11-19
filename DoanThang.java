/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tan.bth2;

/**
 *
 * @author admin
 */
public class DoanThang {

    private Diem d1;
    private Diem d2;

    public DoanThang(Diem d1, Diem d2) {
        this.d1 = d1;
        this.d2 = d2;
    }

    public void hienThi() {
        System.out.printf("([ %.1f,%,1f ],[%.1f,%.1f])", this.d1.getHoanhDo(),
                this.d1.getTungDo(), this.d2.getHoanhDo(), this.d2.getTungDo());
    }       
            /**
             * @return the d1
             */
    public double Dodai(){
        return this.d1.Khoangcach(this.d2);
    }
    public Diem Trungdiem(){
        double x = (this.d1.getHoanhDo()+this.d2.getHoanhDo())/2;
        double y = (this.d1.getTungDo()+this.d2.getTungDo())/2;
        return new Diem(x,y);
    }
    public boolean isSS(DoanThang d){
        double v1 = (this.d1.getHoanhDo()-this.d2.getHoanhDo())
                *(this.d1.getTungDo()-this.d2.getTungDo());
        double v2 = (this.d1.getTungDo()-this.d2.getTungDo())
                *(this.d1.getHoanhDo()-this.d2.getHoanhDo());
        return v1 == v2;
    }
    public Diem getD1() {
        return d1;
    }

    /**
     * @param d1 the d1 to set
     */
    public void setD1(Diem d1) {
        this.d1 = d1;
    }

    /**
     * @return the d2
     */
    public Diem getD2() {
        return d2;
    }

    /**
     * @param d2 the d2 to set
     */
    public void setD2(Diem d2) {
        this.d2 = d2;
    }

}
