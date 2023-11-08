package com.practice.basic_programs;

public class OctalToDec {
    public static void main(String[] args) {
        System.out.println(getDecimal(10));

    }
    private static int getDecimal(int a){
        int n =0;
        int dec=0;
        while (true){
            if (a==0){
                break;
            }else {
                int temp = a % 10;
                dec += temp * Math.pow(8, n);
                a=a/10;
                n++;
            }
        }
        return dec;
    }
}
