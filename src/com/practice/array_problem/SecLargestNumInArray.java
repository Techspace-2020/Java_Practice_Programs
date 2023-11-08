package com.practice.array_problem;

import java.util.Arrays;
import java.util.Collections;

public class SecLargestNumInArray {
    /*public static void main(String[] args) {
        int[] arr={1,3,4,2,4};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.print(max);
    }*/

// Smallest num in array
    /*public static void main(String[] args) {
        int[] arr={1,3,4,2,4};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<max){
                max=arr[i];
            }
        }
        System.out.print(max);
    }*/

// Second Largest num in array
    public static void main(String[] args) {
        int[] arr={2,4,1,8,9,10,3,5,7};
        int temp;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(arr[1]+" "+arr[arr.length-2]);

    }

}
