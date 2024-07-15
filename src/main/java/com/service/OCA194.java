package com.service;

public class OCA194 {
//    S2 sobj = new S2(); sobj.display(10, 100);
}

class S1 {
    protected void display(int x) {
        System.out.print("Parent" + x);
    }
}
class S2 extends S1 {
    public void display(int x, int y) {
        this.display(x);
        display(y);
        super.display(y);
    }
    public void display(int x) {
        System.out.println("Child " + x);
    }
}