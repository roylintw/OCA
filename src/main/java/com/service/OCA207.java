package com.service;

class AA {
    public AA() {
        System.out.print("A ");
    }
}

class BBB extends AA {
    public BBB() { //line n1
        System.out.print("B ");
    }
}

class CCC extends BBB {
    public CCC() { //line n2
        System.out.print("C ");
    }
    public static void main(String[] args) {
        CCC c = new CCC();
    }
}

public class OCA207 {
}
