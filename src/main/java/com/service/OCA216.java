package com.service;

import java.io.IOException;

class MyException extends RuntimeException {}

public class OCA216 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (MyException ne) {
            System.out.print("A");
        }
    }
    public static void method1() { // line n1
        try {
            throw 3 > 10 ? new MyException() : new IOException();
        } catch (IOException ie) {
            System.out.println("I");
        } catch (Exception re) {
            System.out.print("B");
        }
    }
}
