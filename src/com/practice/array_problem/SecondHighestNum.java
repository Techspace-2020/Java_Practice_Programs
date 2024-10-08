package com.practice.array_problem;

public class SecondHighestNum {
    public static void main(String[] args) {
        int[] arr = {12,1,4,7,2,9,5};
        System.out.println(findSecondHighest(arr));
    }

    private static int findSecondHighest(int[] array) {
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int i : array) {
            if (i > highest) {
                secondHighest = highest;
                highest = i;
            } else if (i > secondHighest) {
                secondHighest = i;
            }

        }
        return secondHighest;
    }
}
