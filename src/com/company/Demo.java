package com.company;

public class Demo {
    public static void main(String[] args) {
        B b = new B();
        b.setA(55);
        System.out.println(b.getA());
        b.show();
    }
}

class A {
    private int a;

    void show() {
        System.out.println("Hello");
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}

class B extends A {
}