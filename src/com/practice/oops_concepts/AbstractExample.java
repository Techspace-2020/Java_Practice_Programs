package com.practice.oops_concepts;

abstract class Animal{
    public abstract void animalSound();
}
public class AbstractExample extends Animal{
    @Override
    public void animalSound() {
        System.out.println("Abstract method!!");
    }

    public static void main(String[] args) {
        Animal obj = new AbstractExample();
        obj.animalSound();
    }
}
