package com.practice.array_problem;

import java.util.Arrays;

public class InsertElementIntoArray {
    public static void main(String[] args) {
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        int Index_Pos=2;
        int New_Value=10;
        for(int i=my_array.length-1;i>Index_Pos;i--){
            my_array[i]=my_array[i-1];
        }
        my_array[Index_Pos]=New_Value;
        System.out.println("Insert element into array:"+ Arrays.toString(my_array));

        //other method:
        my_array[4]=20;
        System.out.println("Inserting element and removing the existing one:"+Arrays.toString(my_array));
    }

}
