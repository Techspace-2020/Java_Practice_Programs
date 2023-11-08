package com.practice.array_problem;

public class RemoveDuplicatesSortedArray {
    public static void main(String[] args) {
        int num[]={1,2,2,3,3,4,4,5,5,6};
        int len= num.length;
        len = RemoveDuplicate(num, len);
        for(int i=0;i<len;i++){
            System.out.print(num[i]+" ");
        }
    }

    public static int RemoveDuplicate(int [] num,int count){
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
