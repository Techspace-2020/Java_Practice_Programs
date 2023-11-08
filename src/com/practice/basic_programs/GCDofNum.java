package com.practice.basic_programs;

public class GCDofNum {
    public static void main(String[] args) {
        int num1=10, num2=5, gcd=0;
        int res = getGcd(num1,num2);
        System.out.println("GCD of two number: "+ res);
        for(int i=1;i<num1-1;i++){
            for(int j=1;j<num2-1;j++){
                if(num1%i==0 && num2%i==0){
                    gcd=i;
                }
            }
        }
        System.out.println("GCD of two number: "+ gcd);
    }

    private static int getGcd(int a, int b){
        int gcd;
        while(b!=0){
            int temp = b;
            b = a % b;
            a=temp;
        }
        gcd = a;
        return gcd;
    }
}
