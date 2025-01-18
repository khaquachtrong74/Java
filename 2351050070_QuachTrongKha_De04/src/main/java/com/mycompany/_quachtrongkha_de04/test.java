package com.mycompany._quachtrongkha_de04;
public class test {
    public static void main(String[] args) {
        // Các lệnh trong main
        C a1 = new C(10);
        a1.inc1();
        a1.show();

        A a2 = new B();
        a2.inc1();
        a2.inc2();
        a2.show();

        A a3 = new C(3);
        a3.inc1();
        a3.inc2();
        a3.show();
        A a4 = (A) a3;
        a4.inc1();
        a4.inc2();
        a4.show();
    }
}

class A {
    protected int value;
    public A(int x) {
        this.value = x;
        System.out.println("In A1");
    }
    public A() {
        this(1);
        System.out.println("In A0");
    }
    public void inc1() {
        this.value += 1;
        System.out.println("Plus in A");
    }
    public void inc2() {
        this.value += 2;
        System.out.println("Plus in A");
    }
    public final void show() {
        System.out.print(this.value);
    }
}

class B extends A {
    @Override
    public void inc2() {
        this.inc1();
        this.value += 2;
        System.out.println("Plus in B");
    }
}

class C extends B {
    public C(int y) {
        this.value += y;
        System.out.println("In C");
    }
    public void inc1() {
        this.value += 4;
        System.out.println("Plus in C");
    }
    public void inc2() {
        super.inc2();
        super.inc1();
        System.out.println("Plus in C");
    }
}


