package com.practice.array_problem;

public class Adding_2_Array {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2={6,7,8,9,10};
        int len1=arr1.length;
        int len2=arr2.length;
        int len3=len1+len2;
        int[] arr3 =new int[len3];
        int index=0;

        for(int i:arr1)
            arr3[index++]=i;

        for(int i:arr2)
            arr3[index++]=i;

        for(int i=0;i<arr3.length;i++)
            System.out.print(arr3[i]+" ");
    }
}
