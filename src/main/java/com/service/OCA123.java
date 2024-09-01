package com.service;

class Cart {
    Product1 p;
    double totalAmount;
}

class Product1 {
    String name;
    Double price;
}

public class OCA123 {
    public static void main(String[] args) {
        Cart c = new Cart();
        System.out.println(c.p + ":" + c.totalAmount);
    }
}
