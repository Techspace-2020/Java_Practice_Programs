package com.practice.oops_concepts;

class Dynamic{
    //Overidden method
    public void eat(){
        System.out.println("Parent class method ");
    }
}
public class DynamicBindingExample extends Dynamic {
    //Overridding method.
    @Override
    public void eat(){
        System.out.println("child class method ");
    }

    public static void main(String[] args) {
        /* Reference is of Dynamic type and object is
         * Dynamic type
         */
        Dynamic obj = new Dynamic();
        /* Reference is of Dynamic type and object is
         * DynamciBidningExample type
         */
        Dynamic obj2 = new DynamicBindingExample();
        obj.eat();
        obj2.eat();
    }
}

