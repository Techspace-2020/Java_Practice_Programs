package com.practice.leetcode_programs;

public class Search_Insert_Position {
    public static void main(String[] args) {
        int[] input = {1,3,5,6};
        int num=2;
        System.out.println(searchInsert(input,num));
    }

    public static int searchInsert(int[] nums, int target){
        int left =0;
        int right = nums.length-1;

        while(left <= right){
            int mid = left + (right-left)/2;
            if(nums[mid]==target){
                return mid;
            } else if (nums[mid]<target) {
                left=mid+1;
            }else {
                right=mid-1;
            }
        }
        return left;
    }
}
