package com.practice.interview_programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupListOfElementsWithStream {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("apple","mango","jackfruit","guava","apple","mango");

        Map<Integer, List<String>> groupElements = stringList.stream().collect(Collectors.groupingBy(String::length));
        System.out.println("Group of elements:"+ groupElements);

    }
}
