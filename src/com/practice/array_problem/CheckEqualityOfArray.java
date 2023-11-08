package com.practice.array_problem;

public class CheckEqualityOfArray {
    public static void main(String[] args) {
        boolean result=EqualityOfTwoArray(new int[]{2,3,4,5,6,7}, new int[]{2, 3, 4, 5, 6,7});
        if(result){
            System.out.println("Two arrays are equal.");
        }else{
            System.out.println("Two arrays are not equal.");
        }


    }
    private static boolean EqualityOfTwoArray(int[] arr1, int[] arr2){
        boolean notEqual = false;
        if(arr1.length==arr2.length){
            for(int temp:arr1){
                for (int temp1:arr2){
                    if(arr1[temp]!=arr2[temp1]){
                        return notEqual;
                    }else{
                        return (!notEqual);
                    }
                }
            }

        }else{
            return notEqual;
        }
        return notEqual;
    }
}
