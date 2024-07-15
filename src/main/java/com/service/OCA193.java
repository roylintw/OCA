package com.service;

public class OCA193 {
    String greet = "Welcome!";
    public OCA193() {
        String greet = "Hello!";
    }
    public void setGreet() {
        String greet = "Good Day!";
    }
    public static void main(String[] args) {
        OCA193 t = new OCA193();
        String greet = "Good Luck!";
        System.out.println(t.greet);
    }
}
