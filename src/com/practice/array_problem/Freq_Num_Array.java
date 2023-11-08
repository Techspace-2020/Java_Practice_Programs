package com.practice.array_problem;

import java.util.Scanner;

public class Freq_Num_Array {
    public static void main(String[] args) {
        int n;
        int visited=-1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the num:");
        n=scanner.nextInt();
        int[] arr=new int[n];
        int[] fr=new int[arr.length];
        System.out.print("Enter the array num:");
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count+=1;
                    fr[j]=visited;
                }
            }
            if(fr[i]!=visited)
                fr[i]=count;
        }
        System.out.println(" Element | Frequency");
        System.out.println("---------------------");
        for(int i = 0; i < fr.length; i++){
            if(fr[i] != visited)
                System.out.println("    " + arr[i] + "    |    " + fr[i]);
        }
        System.out.println("---------------------");

    }
}
