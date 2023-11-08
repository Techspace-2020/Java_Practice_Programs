package com.practice.interview_programs;

import java.util.Arrays;
import java.util.List;

public class SumofSquareWithStream {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(2,3,5,4,7,8,9,1,10);

        int sumOfNum = num.stream().mapToInt(n -> n * n).sum();
        System.out.println("Sum of numbers:"+ sumOfNum);
    }
}
