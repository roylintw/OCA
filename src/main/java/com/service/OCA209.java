package com.service;

// A
abstract class A3 {
    private static int i;
    public void doStuff() {}
    public A3() {}
}

// B
final class A1 {
    public A1() {}
}

// C
//private class A2 {
//    private static int i;
//    private A2() {}
//}

// D
class A4 {
    protected static final int i = 10;
    private A4() {}
}

// E
//final abstract class A5 {
//    protected static int i;
//    void doStuff() {}
//    abstract void doIt();
//}

public class OCA209 {

}
