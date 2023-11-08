package com.practice.generics;

class GenericClass<T>{
    T obj;
    GenericClass(T obj){
        this.obj=obj;
    }
    public T getObject(){
        return this.obj;
    }
}
public class GenericExample {
    public static void main(String[] args) {
        GenericClass<Integer> ex1 = new GenericClass<Integer>(10);
        System.out.println(ex1.getObject());

        GenericClass<Float> ex2 = new GenericClass<Float>(15.2f);
        System.out.println(ex2.getObject());

    }
}
