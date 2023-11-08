package com.practice.oops_concepts;

public class PolymorphismExample2 extends Water{
    @Override
    public void waterState() {
        System.out.println("Impure water!");
    }

    public static void main(String[] args) {
        Water water = new PolymorphismExample2();
        water.waterState();
    }
}
