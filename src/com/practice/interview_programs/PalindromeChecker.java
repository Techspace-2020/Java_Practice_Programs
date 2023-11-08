package com.practice.interview_programs;

public class PalindromeChecker {
    public static void main(String[] args) {
        String str = "racecar";
        if(checkPalindrome(str)){
            System.out.println("String is palindrome");
        }else {
            System.out.println("String is not palindrome");
        }

    }
    public static boolean checkPalindrome(String s1){
        int left =0, right=s1.length()-1;

        while(left<right){
            if(s1.charAt(left)!=s1.charAt(right)){
                return false;
            }
                left++;
                right--;
        }
        return true;
    }
}
