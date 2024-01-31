package com.persistence.vo;

public class ElectricAccount {
    private double kWh;
    private double rate = 0.07;
    private double bill;

    //line n1
    // A
//    public void addKWh(double kWh) {
//        this.kWh += kWh;
//        this.bill = this.kWh * this.rate;
//    }
    // B.
//    public void addKWh(double kWh) {
//        if (kWh > 0) {
//            this.kWh += kWh;
//            this.bill = this.kWh * this.rate;
//        }
//    }
    // C.
//    private void addKWh(double kWh) {
//        if (kWh > 0) {
//            this.kWh += kWh;
//            this.bill = this.kWh * this.rate;
//        }
//    }
//        D.
//    public void addKWh(double kWh) {
//        if (kWh > 0) {
//            this.kWh += kWh;
//            setBill(this.kWh);
//        }
//    }
//    public void setBill(double kWh) {
//        bill = kWh * rate;
//    }
}
