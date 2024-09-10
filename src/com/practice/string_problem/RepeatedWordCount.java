package com.practice.string_problem;

import java.util.HashMap;
import java.util.Map;

public class RepeatedWordCount {
    public static void main(String[] args) {
        String input = "hello world hello from the world of java hello";
        countRepeatedWords(input);
    }

    public static void countRepeatedWords(String input) {
        // Split the string into words
        String[] words = input.toLowerCase().split("\\s+");

        // Use a HashMap to store the count of each word
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Iterate through the array of words
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        // Print out the repeated words and their counts
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}

