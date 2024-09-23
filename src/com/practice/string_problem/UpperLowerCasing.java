package com.practice.string_problem;

public class UpperLowerCasing {
    public static void main(String[] args) {
        String str = "This course has multiple practice exams";

        int mid = str.length()/2;
        String upperCase="";
        String lowerCase="";

        for(int i=0;i<str.length();i++){
            if(i<mid){
                lowerCase+=Character.toLowerCase(str.charAt(i));
            }else{
                upperCase+=Character.toUpperCase(str.charAt(i));
            }
        }
        System.out.println(lowerCase+upperCase);

    }
}
