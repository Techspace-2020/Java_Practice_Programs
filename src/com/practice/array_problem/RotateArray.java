package com.practice.array_problem;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int num=1;

// Rotate Left
        /*for(int i = 0; i < num; i++){
            int j, first;
            first = arr[0];
            for(j = 0; j < arr.length-1; j++){
                arr[j] = arr[j+1];
            }
            arr[j] = first;
        }
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }*/

// Rotate right

        for(int i=0;i<num;i++){
            int j,last;
            last=arr[arr.length-1];
            for(j=arr.length-1;j>0;j--){
                arr[j]=arr[j-1];

            }
            arr[0]=last;
        }
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
