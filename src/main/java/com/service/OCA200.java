package com.service;

class CC {
    public CC() {
        System.out.print("C ");
    }
}

class BB extends CC {
    public BB() { // line n1
        System.out.print("B ");
    }
}

public class OCA200 extends BB {

    public OCA200() { //line n2
        System.out.print("A ");
    }
    public static void main(String[] args) {
        OCA200 a = new OCA200();
    }
}
