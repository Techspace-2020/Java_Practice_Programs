package com.practice.searching_algorithm;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = new int[]{2,5,6,1,8,9,10,13};
        int num=2;
        int result= Search(arr, num);
        if(result==-1){
            System.out.println("Element not found in the array!");
        }else {
            System.out.println("Elemenet found at index:"+ result);
        }
    }

    private static int Search(int[] element, int key){
        for(int i=0;i<element.length;i++){
            if(element[i]==key){
                return i;
            }
        }
        return -1;
    }

}


