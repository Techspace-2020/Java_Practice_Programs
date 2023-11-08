package com.practice.oops_concepts;

//Also called Runtime polymorphism
class Transport{
    public void transportSystemInfo(){
        System.out.println("Dynamic polymorphism example");
    }
}
public class DynamicPolymorphismExample extends Transport{
    public void transportSystemInfo(){
        System.out.println("Using base class method here,call decided by JVM ");
    }

    public static void main(String[] args) {
        Transport transport = new DynamicPolymorphismExample();
        transport.transportSystemInfo();
    }
}
