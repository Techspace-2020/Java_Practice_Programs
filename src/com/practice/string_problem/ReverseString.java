package com.practice.string_problem;


public class ReverseString {
    public static void main(String[] args) {
        String str ="123";
        System.out.println(reverseStr(str));
    }

    public static String reverseStr(String input){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=input.length()-1;i>=0;i--){
            stringBuilder.append(input.charAt(i));
        }
        return stringBuilder.toString();
    }
}
