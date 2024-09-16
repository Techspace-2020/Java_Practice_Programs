package com.practice.string_problem;

public class PalindromeString {
    public static void main(String[] args) {
        String str ="Antolice";
        String reversStr="";

        System.out.println(reverseString(str));

        for(int i=str.length()-1;i>=0;i--){
            reversStr = reversStr.concat(String.valueOf(str.charAt(i)));
        }
        if(str.length()==reversStr.length()){
            if (str.equals(reversStr)){
               // System.out.println("Strings are palindrome!");
            }else{
                //System.out.println("Strings are not palindrome!");
            }
        }

    }
    //Reverse of given string
    public static String reverseString(String input){
        String rev="";
        for(int i=input.length()-1;i>=0;i--){
            rev = rev.concat(String.valueOf(input.charAt(i)));
        }
        return rev;
    }
}
