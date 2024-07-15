package com.service;

public class OCA201 {
    Character c;
    boolean b;
    float f;
    void printAll() {
        System.out.println("c = " + c);
        System.out.println("b = " + b);
        System.out.println("f = " + f);
    }

    public static void main(String[] args) {
        OCA201 f = new OCA201();
        f.printAll();
    }
}
