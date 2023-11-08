package com.practice.array_problem;

public class FindIndexOfArray {
    public static void main(String[] args) {
        int[] arr={2,4,5,8,10};
        int key=9;
        System.out.println(findIndex(arr,key));
    }
    public static int findIndex(int[] arr, int key){
        if(arr==null)
            return -1;
        else
            for(int i=0;i< arr.length;i++){
                if(arr[i]==key)
                    return i;
            }
        return -1;
    }
}
