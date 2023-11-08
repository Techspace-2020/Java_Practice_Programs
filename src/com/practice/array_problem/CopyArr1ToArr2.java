package com.practice.array_problem;

public class CopyArr1ToArr2 {
    public static void main(String[] args) {
        int[] arr1={2,3,4,5,6,8,19};
        int[] arr2=new int[arr1.length];
        int index=0;
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        for(int i=0;i<arr1.length;i++){
            arr2[index]=arr1[i];
            index++;
        }
        //System.out.println(arr2.length);
        System.out.println(" ");
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}
