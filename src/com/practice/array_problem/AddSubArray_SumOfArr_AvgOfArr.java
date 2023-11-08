package com.practice.array_problem;

public class AddSubArray_SumOfArr_AvgOfArr {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int k=3;
        int length = arr.length;
        //sum of the numbers in the array:
        int sumOfNum=sumOfArray(arr);
        System.out.println("Sum of the numbers in the array:"+ sumOfNum);

        // average of the elements in array:
        System.out.println("Average of the elements in array:"+ avgOfArray(arr,sumOfNum));

        int result=0;
        for(int i=0;i<length;i++){
            int sum=0;
            for(int j=i;j<length;j++){
                sum=sum+arr[j];
                if(sum==k)
                    result++;
            }
        }
        System.out.println("SubArray is "+ k +" and sum up "+ result);
    }
    private static int sumOfArray(int[] arr){
        int sum_result=0;
        for(int num:arr){
            sum_result=sum_result+num;
        }
        return sum_result;
    }

    private static double avgOfArray(int[] arr,int sum){
        double avg_result;
        avg_result=sum/arr.length;
        return avg_result;

    }
}
