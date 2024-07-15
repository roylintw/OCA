package com.service;

public class OCA192 {
    public static void main(String[] args) {
        OCA192 ts = new OCA192();
        System.out.print(isAvailable + " ");
        isAvailable = ts.doStuff();
        System.out.println(isAvailable);
    }
    public static boolean doStuff() {
        return !isAvailable;
    }
    static boolean isAvailable = true;
}
