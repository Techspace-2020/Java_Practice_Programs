package com.practice.oops_concepts;

interface One{
    void myMethodOne();

}
interface Two{
    void myMethodTwo();
}

interface Three{
    void myMethodThree();
}
public class MultipleInheritanceUsingInterfaces implements One,Two,Three{
    @Override
    public void myMethodOne() {
        System.out.println("Calling method 1");
    }

    @Override
    public void myMethodTwo() {
        System.out.println("Calling method 2");
    }

    @Override
    public void myMethodThree() {
        System.out.println("Calling method 3");
    }
    public static void main(String[] args) {
        MultipleInheritanceUsingInterfaces example = new MultipleInheritanceUsingInterfaces();
        example.myMethodOne();
        example.myMethodTwo();
        example.myMethodThree();
    }


}
