package com.practice.interview_programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumUsingStream {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(2,3,5,4,7,8,9,1,10);

        List<Integer> filterdNum = num.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println("Even numbers:" + filterdNum);

        List<Integer> filterdOddNum = num.stream().filter(n -> n%2 != 0).collect(Collectors.toList());
        System.out.println("Odd numbers:" + filterdOddNum);
    }
}
