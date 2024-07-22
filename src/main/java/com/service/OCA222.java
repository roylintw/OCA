//package com.service;
//
//class LogFileException extends Exception { }
//class AccessViolationException extends RuntimeException { }
//
//public class OCA222 {
//    public static void main(String[] args) throws LogFileException {
//        OCA222 obj = new OCA222();
//        try {
//            obj.open();
//            obj.process();
//                // insert code here
//        }
//        catch (Exception e) {
//            System.out.println("Completed.");
//        }
//    }
//    public void process() {
//        System.out.println("Processed");
//        throw new LogFileException();
//    }
//    public void open() {
//        System.out.println("Opened.");
//        throw new AccessViolationException();
//    }
//}
