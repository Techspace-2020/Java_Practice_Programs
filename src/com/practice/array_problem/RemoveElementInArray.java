package com.practice.array_problem;

import java.util.Arrays;

public class RemoveElementInArray {
    public static void main(String[] args) {
        int[] my_arr={25, 14, 56, 15, 36, 56, 77, 18, 29, 45};
        System.out.println("Original array:"+ Arrays.toString(my_arr)+ "\t" + my_arr.length);

        int remove_arr=3;
        for(int i=remove_arr;i<my_arr.length-1;i++){
            my_arr[i]=my_arr[i+1];

        }
        // We cannot alter the size of an array , after the removal, the last and second last element in the array will exist twice
        System.out.println("After removing the array becomes:"+ Arrays.toString(my_arr));
        System.out.println(my_arr.length);
    }
}
