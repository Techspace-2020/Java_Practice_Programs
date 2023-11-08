package com.practice.basic_programs;

public class SpyNumber {
    public static void main(String[] args) {
        int num =134,sum=0,prod=1,lastDigit;
        int originalNum = num;
        while(num>0){
            lastDigit = num%10;
            sum+=lastDigit;
            prod = prod* lastDigit;
            num=num/10;

        }

        if(sum==prod){
            System.out.println("Num " + originalNum + " is a spy number");
        }else{
            System.out.println("Num " + originalNum + " is not a spy number");
        }
    }
}
