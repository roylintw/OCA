package com.service;

public class OCA190 {
    public static void main(String[] args) {
        int x;
        /* insert code here */
        // A
        for (x = 0; x < 100; ++x) {
            System.out.println("Welcome " + x);
        }
        // B
        for (x = 100; x <= 100; x++) {
            System.out.println("Welcome " + x);
        }
        // C
        x = 100;
        while (x <= 100) {
            x++;
            System.out.println("Welcome " + x);
        }
        // D
        x = 100;
        do {
            ++x;
            System.out.println("Welcome " + x);
        } while (x < 100);
    }
}
