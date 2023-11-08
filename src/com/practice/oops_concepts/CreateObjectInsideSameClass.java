package com.practice.oops_concepts;

public class CreateObjectInsideSameClass {
    int num=10;
    static void check(){
        System.out.println("Create object inside the same class!!!");
    }

    static int addTwoNumbers(int num1, int num2){
        int sum=0;
        sum=num1+num2;
        return sum;
    }

    public static void main(String[] args) {
        CreateObjectInsideSameClass createObjectInsideSameClass = new CreateObjectInsideSameClass();
        System.out.println(createObjectInsideSameClass.num);
        System.out.println();
        check();
        System.out.println();
        System.out.println(addTwoNumbers(2,4));
    }
}
