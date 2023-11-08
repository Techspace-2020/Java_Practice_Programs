package com.practice.oops_concepts;

class Details{
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class EncapsulationExample {
    public static void main(String[] args) {
        Details details = new Details();
        details.setAge(22);
        details.setName("Rohan");
        System.out.println(details.getAge());
        System.out.println(details.getName());
    }
}
