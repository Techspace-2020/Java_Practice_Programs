package com.practice.array_problem;

import java.util.Arrays;

public class RemoveDuplicatesUnSortedArray {

    public static void main(String[] args) {
        int num[]={2,4,4,1,3,3,6,5,5,5,9,9,8};
        Arrays.sort(num);
        int len= num.length;
        len = RemoveDuplicateUnSortedArray(num, len);
        for(int i=0;i<len;i++){
            System.out.print(num[i]+" ");
        }
    }

    public static int RemoveDuplicateUnSortedArray(int [] num,int count){
        if(count==0 || count==1){
            return count;
        }
        int[] temp =new int[count];
        int j=0;
        for(int i=0;i< count-1;i++){
            if(num[i]!=num[i+1]){
                temp[j++]=num[i];
            }
        }
        temp[j++]=num[count-1];
        for(int i=0;i<j;i++){
            num[i]=temp[i];
        }
        return j;

    }
}
