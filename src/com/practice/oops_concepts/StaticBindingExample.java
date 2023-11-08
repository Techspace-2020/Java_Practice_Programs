package com.practice.oops_concepts;

class Man{

    public static void eat(){
        System.out.println("Parent class method ");
    }

}
public class StaticBindingExample extends Man{

    public static void eat(){
        System.out.println("Child class method ");
    }

    public static void main(String[] args) {
        eat();
    }
}
