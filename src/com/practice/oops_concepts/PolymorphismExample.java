package com.practice.oops_concepts;

abstract class Water{
    public abstract void waterState();
}
public class PolymorphismExample extends Water {
    @Override
    public void waterState() {
        System.out.println("Pure water!");
    }

    public static void main(String[] args) {
        Water water = new PolymorphismExample();
        water.waterState();
    }
}
