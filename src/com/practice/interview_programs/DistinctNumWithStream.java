package com.practice.interview_programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctNumWithStream {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(2,3,5,4,7,8,9,1,10,2,1,3);

        List<Integer> distinctNum = num.stream().distinct().collect(Collectors.toList());
        System.out.println("Distinct numbers:"+ distinctNum);
    }
}
