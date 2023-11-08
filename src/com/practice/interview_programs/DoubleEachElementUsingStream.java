package com.practice.interview_programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DoubleEachElementUsingStream {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(2,3,5,4,7,8,9,1,10);

        List<Integer> doubledNum = num.stream().map(n -> n * 2).collect(Collectors.toList());
        System.out.println("Doubled number:"+ doubledNum);
    }
}
