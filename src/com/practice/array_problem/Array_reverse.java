package com.practice.array_problem;

import java.util.Scanner;

public class Array_reverse {
    public static void main(String[] args) {
        int[] arr= new int[6];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the num:");
        for(int i=0;i<arr.length;i++){
            arr[i]= scanner.nextInt();

        }
        System.out.println("output number:");
        for (int i= arr.length-1;i>0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
