package com.practice.oops_concepts;

public class StaticBlockExample {
    static int num;
    static String str,myStr;

    //Static block example:
    static {
        System.out.println("Static block 1");
        num=90;
        str="Block 1 ";
    }

    static{
        System.out.println("Static Block 2");
        num = 98;
        myStr = "Block2";
    }

    public static void main(String[] args) {
        System.out.println(num);
        System.out.println(str);
        System.out.println("=========");
        System.out.println(num);
        System.out.println(myStr);
    }
}
