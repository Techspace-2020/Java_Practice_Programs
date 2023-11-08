package com.practice.oops_concepts;

class School{
    String name="CKS";
    String location ="HSN";

    public void info(){
        System.out.println("Inheritance example!!!");
    }
}
public class InheritanceExample extends School{
    public static void main(String[] args) {
        School school = new InheritanceExample();
        school.info();

    }
}
