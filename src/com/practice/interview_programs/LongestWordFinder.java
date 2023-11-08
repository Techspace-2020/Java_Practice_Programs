package com.practice.interview_programs;

public class LongestWordFinder {
    public static void main(String[] args) {
        String inputSentence = "This is a this";

        String longestWord = longWord(inputSentence);
        System.out.println("Longest word in the sentence is:"+ longestWord);

    }

    public static String longWord(String str){
        String[] words = str.split(" ");
        String longestWord = "";

        for(String word: words){
            if(word.length()>longestWord.length()){
                longestWord = word;
            }
        }
        return longestWord;
    }
}
