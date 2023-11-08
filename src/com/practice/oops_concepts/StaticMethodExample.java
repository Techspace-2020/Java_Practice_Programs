package com.practice.oops_concepts;

public class StaticMethodExample {
    static int i;
    static String str;

    //Static method
    static void  info(){
        System.out.println("i:"+i);
        System.out.println("str:"+str);
    }

    //Non-static method
    void display(){
        //Static method called in non-static method
        info();
    }

    public static void main(String[] args) {
        StaticMethodExample obj = new StaticMethodExample();
        info();
        obj.display();
    }
}
