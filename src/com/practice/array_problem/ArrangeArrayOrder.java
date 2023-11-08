package com.practice.array_problem;

public class ArrangeArrayOrder {
    public static void main(String[] args) {
        int[] arr={1,3,4,9,2,10,5,6,8};
        ArrangeOrder(arr);


    }
    public static void ArrangeOrder(int arr[]){

        int[] arr2= new int[arr.length];
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                arr2[index]=arr[i];
                index++;
            }

        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                arr2[index]=arr[i];
                index++;
            }
        }
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+ " ");
        }

    }
}
