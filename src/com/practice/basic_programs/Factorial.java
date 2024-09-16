package com.practice.basic_programs;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(FactNum(4));
    }

    public static int FactNum(int num){
        if(num==1){
            return 1;
        }else {
            return num*FactNum(num-1);
        }
    }
}
