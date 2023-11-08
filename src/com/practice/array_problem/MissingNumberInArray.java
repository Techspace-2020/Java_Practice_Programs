package com.practice.array_problem;

public class MissingNumberInArray {
    public static void main(String[] args) {
        int[] arr=new int[]{2,3,4,5,6,7};
        int total_num=7, expected_num_sum,arr_sum=0,missing_num;

        expected_num_sum=total_num*((total_num+1)/2);
        for (int num:arr){
            arr_sum+=num;
        }

        missing_num=expected_num_sum-arr_sum;
        System.out.println("Missing number is:"+ missing_num);


    }
}
