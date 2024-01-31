//package com.persistence.vo;
//
//public class Vehicle {
//    //    String type = "4W";
////    int maxSpeed = 100;
////
////    Vehicle(String type, int maxSpeed) {
////        this.type = type;
////        this.maxSpeed = maxSpeed;
////    }
////
////    Vehicle() {
////    }
//    // OCA53
//    int x;
//
//    Vehicle() {
//        this(10); // line n1
//    }
//
//    Vehicle(int x) {
//        this.x = x;
//    }
//}
//
//class Car extends Vehicle {
//    //    String trans;
////
////    Car(String trans) { //line n1
////        this.trans = trans;
////    }
////
////    Car(String type, int maxSpeed, String trans) {
////        super(type, maxSpeed); // line n2
////        this.trans = trans;
////    }
////
////    public static void main(String[] args) {
////        Car c1 = new Car("Auto");
////        Car c2 = new Car("4W", 150, "Manual");
////        System.out.println(c1.type + " " + c1.maxSpeed + " " + c1.trans);
////        System.out.println(c2.type + " " + c2.maxSpeed + " " + c2.trans);
////    }
//    // OCA53
//    int y;
//    Car() {
//        super();
//        this(20); // line n2
//    }
//    Car(int y) {
//        this.y = y;
//    }
//    public String toString() {
//        return super.x + ":" + this.y;
//    }
//}
