package com.persistence.vo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Product {
    //    double price;
    // OCA75
    int id;
    String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Test {
    //    public void updatePrice(Product product, double price) {
//        price = price * 2;
//        product.price = product.price + price;
//    }
//
//    public static void main(String[] args) {
//        Product prt = new Product();
//        prt.price = 200;
//        double newPrice = 100;
//
//        Test t = new Test();
//        t.updatePrice(prt, newPrice);
//        System.out.println(prt.price + " : " + newPrice);
//    }
//    void readCard(int cardNo) throws Exception {
//        System.out.println("Reading Card");
//    }
//
//    void checkCard(int cardNo) throws RuntimeException { // line n1
//        System.out.println("Checking Card");
//    }
//
//    public static void main(String[] args) {
//        Test ex = new Test();
//        int cardNo = 12344;
//        ex.readCard(cardNo); //line n2
//        ex.checkCard(cardNo); //line n3
//    }
//    public static void main(String[] args) {
//        /* insert code here */
//        array[0] = 10;
//        array[1] = 20;
//        System.out.print(array[0] + ":" + array[1]);
//    }
//    public static void main(String[] args) {
//        Test ts = new Test();
//        System.out.print(isAvailable + " ");
//        isAvailable = ts.doStuff();
//        System.out.println(isAvailable);
//    }
//    public static boolean doStuff() {
//        return !isAvailable;
//    }
//    static boolean isAvailable = false;
    // OCA39
//    public static void main(String[] args) {
//        if (args[0].equals("Hello") ? true : false) {
//            System.out.println("Success");
//        } else {
//            System.out.println("Failure");
//        }
//    }
    // OCA47
//    public static void checkAge(List<Person> list, Predicate<Person> predicate) {
//        for (Person p : list) {
//            if (predicate.test(p)) {
//                System.out.println(p.name + " ");
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        List<Person> iList = Arrays.asList(new Person("Hank", 45),
//                new Person("Charlie", 40),
//                new Person("Smith", 38));
//        //line n1
    // OCA69
//    public static void main(String[] args) {
//        //line n1
//        switch (x) {
//            case 1:
//                System.out.println("One");
//                break;
//            case 2:
//                System.out.println("Two");
//                break;
//        }
//    }
    // OCA71
//        public static void main(String[] args) {
//            try {
//                method1();
//            } catch (MyException ne) {
//                System.out.print("A");
//            }
//        }
//
//        public static void method1() { // line n1
//            try {
//                throw Math.random() > 0.5 ? new MyException() : new RuntimeException();
//            } catch (RuntimeException re) {
//                System.out.print("B");
//            }
//        }
    // OCA85
//    public static void main(String[] args) {
//        boolean a = new Boolean(Boolean.valueOf(args[0]));
//        boolean b = new Boolean(args[1]);
//        System.out.println(a + " " + b);
//    }
    // OCA89
//    public static void main(String[] args) {
//        List ps = new ArrayList();
//        Patient p2 = new Patient("Mike");
//        ps.add(p2);
//
//        // insert code here
//
//        if (f >= 0) {
//            System.out.print("Mike Found");
//        }
//    }
    // OCA93
//    public static void main(String[] args) {
//        Employee e1 = new Employee();
//        Employee e2 = new Employee("Jack", 50);
//        Employee e3 = new Employee("Chloe", 40, 5000);
//
//        e1.printDetails();
//        e2.printDetails();
//        e3.printDetails();
//    }
    // OCA97
//    public static void main(String[] args) {
//        int numbers[] = {12, 13, 42, 32, 15, 156, 23, 51, 12};
//        int[] keys = findMax(numbers);
//    }
//
//    /* line n1 */ {
//        int[] keys = new int[3];
//        /* code goes here*/
//        return keys;
//    }
}
