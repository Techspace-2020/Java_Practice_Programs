package com.practice.string_problem;

import java.util.Arrays;

public class AnagramString {
    public static void main(String[] args) {

        String str= "army";
        String str1="mary";

        if(str.length()==str1.length()){
            char[] arrChar= str.toCharArray();
            char[] arrChar1= str1.toCharArray();
            Arrays.sort(arrChar);
            Arrays.sort(arrChar1);
            if(Arrays.equals(arrChar,arrChar1)){
                System.out.println("Given strings are anagram!");
            }else{
                System.out.println("Given strings are not anagram!");
            }
        }else{
            System.out.println("Given strings are not anagram!");
        }
    }
}
