package com.practice.basic_programs;

public class ContinueStat {
    public static void main(String[] args) {
        int i =4;
        for( int a=0; a<=i ;a++){
            System.out.print("Start "+ a);
            if(a==3){
                continue;
            }

            System.out.print("End "+ a);
            System.out.println();
        }
    }
}
