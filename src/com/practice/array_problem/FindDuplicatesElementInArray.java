package com.practice.array_problem;

import java.util.Arrays;
import java.util.Scanner;

public class FindDuplicatesElementInArray {
    static int j;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr= {2,3,4,5,5,6,2,3};
        for (int i=0;i< arr.length-1;i++){
            for ( j=i+1;j< arr.length;j++){
                if((arr[i]==arr[j]) && (i!=j)){
                    System.out.print(arr[j]+" ");
                    RemoveDuplicateElements(new int[]{arr[j]});
                }
            }

        }
    }

    private static void RemoveDuplicateElements(int[] arr){
        for(int i=arr[0];i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        System.out.println("After removing the duplicates elements:"+ Arrays.toString(arr));
    }

}
