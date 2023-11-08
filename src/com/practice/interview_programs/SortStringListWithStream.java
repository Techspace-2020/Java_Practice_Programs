package com.practice.interview_programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortStringListWithStream {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("apple","mango","jackfruit","guava");

        List<String> sortedString = stringList.stream().sorted().collect(Collectors.toList());
        System.out.println("String sorted:"+ sortedString);
    }
}
