package com.practice.oops_concepts;


//A class can be made static only if it is a nested class.
//Nested static class doesn’t need reference of Outer class
//A static class cannot access non-static members of the Outer class
public class StaticClassExample {

    private static String str ="Hello";
    //Static class
    static class MyNestedClass{
        //non-static method
        public void disp() {

            /* If you make the str variable of outer class
             * non-static then you will get compilation error
             * because: a nested static class cannot access non-
             * static members of the outer class.
             */
            System.out.println(str);
        }

    }

    public static void main(String[] args) {
        StaticClassExample.MyNestedClass obj = new StaticClassExample.MyNestedClass();
        obj.disp();
    }
}
