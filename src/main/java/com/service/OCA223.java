//package com.service;
//
//class E1 extends Exception {}
//
//class E2 extends RuntimeException {}
//
//public class OCA223 {
//    public void m1() {
//        System.out.println("ml.Accessed.");
//        throw new E1();
//    }
//
//    public void m2() {
//        System.out.println("m2.Accessed.");
//        throw new E2();
//    }
//    public static void main(String[] args) {
//        int level = 1;
//        OCA223 obj = new OCA223();
//        if (level <= 5 && level >= 3) {
//            obj.m1();
//        } else {
//            obj.m2();
//        }
//    }
//}
