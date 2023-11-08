package com.practice.array_problem;

import java.util.Scanner;

public class PrintOddPositionNumArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the range:");
        int num=scanner.nextInt();
        int[] arr=new int[num];
        System.out.println("Enter the number:");
        for(int i=0;i<num;i++){
            arr[i]=scanner.nextInt();
        }
        for(int i=0;i<arr.length;i=i+2) {
            System.out.print(arr[i]+" ");
        }

    }
}
