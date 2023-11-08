package com.practice.interview_programs;

public class AnagramChecker {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "ab";

        if (CheckAnagram(str1,str2)){
            System.out.println("Strings are anagram!");
        }else {
            System.out.println("Strings are not anagram!");
        }

    }

    public static boolean CheckAnagram(String s1, String s2){
        if(s1.length()!=s2.length()){
            return false;
        }

        int[] charCount = new int[26];

        for (int i=0;i<s1.length();i++){
            charCount[s1.charAt(i) - 'a']++;
        }

        for (int i=0; i<s2.length();i++){
            charCount[s2.charAt(i) - 'a']--;
        }

        for (int count:charCount){
            if(count!=0)
                return false;
        }
        return true;
    }

}
