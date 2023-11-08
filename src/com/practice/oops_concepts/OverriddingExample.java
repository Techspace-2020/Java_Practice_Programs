package com.practice.oops_concepts;


//Also called as runtime or dynamic polymorphism or dynamic disptach method.
class Human{
    //Overridden method
    public void eat(){
        System.out.println("Parent class method ");
    }
}

public class OverriddingExample extends Human {
    //Overridding method
    @Override
    public void eat(){
        super.eat();
        System.out.println("Child class method");
    }

    public static void main(String[] args) {
        Human human = new OverriddingExample();
        human.eat();
    }
}
