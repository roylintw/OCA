package com.service;

public class OCA210 {
    public static void main(String[] args) {
        float var1 = (12_345.01 <= 123_45.00) ? 12_456 : 124_56.02f;
        float var2 = var1 + 1024;
        System.out.print(var2);
    }
}
