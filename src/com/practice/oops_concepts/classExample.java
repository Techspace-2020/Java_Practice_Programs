package com.practice.oops_concepts;

class Bicycle {
    int gear = 5;

    public void bracking() {
        System.out.println("Method breaking!!!");
    }
}
public class classExample {
    public static void main(String[] args) {
        Bicycle sportBicycle= new Bicycle();
        sportBicycle.bracking();
        //sportBicycle.gear;


    }
}

