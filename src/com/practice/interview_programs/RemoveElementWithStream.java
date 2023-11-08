package com.practice.interview_programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveElementWithStream {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("apple","mango","jackfruit","guava");

        List<String> newStr = stringList.stream().filter(n -> !n.contains("ap")).collect(Collectors.toList());
        System.out.println(newStr);
    }
}
