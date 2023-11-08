package com.practice.array_problem;

import java.util.Arrays;
import java.util.Collections;

public class Array_Sorting_ASC_DSC {
    public static void main(String[] args) {
        Integer num[]={2,4,1,3,6,5,9,8};
        System.out.print("Before Array:");
        for(int i:num) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        System.out.print("After Sorting array in ascending order:");
        Arrays.sort(num);
        for(int i:num) {
            System.out.print(i + " ");
        }

        System.out.println(" ");
        System.out.print("After Sorting array in Desending order:");
        Arrays.sort(num,Collections.reverseOrder());
        for(int i:num) {
            System.out.print(i + " ");
        }

    }
}
