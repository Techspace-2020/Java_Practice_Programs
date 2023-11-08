package com.practice.oops_concepts;

// Also called Compile time or static polymorphism
class Demo{
    public void myMethodOne(){
        System.out.println("Calling method 1");
    }

    public void myMethodOne(String str){
        System.out.println("Calling method 2"+ str);
    }
}
public class OverloadingExample {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.myMethodOne();
        demo.myMethodOne("Overloading feature");
    }
}
