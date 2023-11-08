package com.practice.string_problem;

public class ToggleWords {
    public static void main(String[] args) {
        String str = "ApPle";
        String resutStr;
        System.out.println("Before Toggle: "+ str);
        resutStr = wordsToggling(str);
        System.out.println("After Toggle: " + resutStr);

    }

    private static String wordsToggling(String s){
        char[] chars= s.toCharArray();
        for(int i=0; i<s.length();i++){
            char c = chars[i];
            if(Character.isUpperCase(c)){
                chars[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                chars[i] = Character.toUpperCase(c);

            }


        }

        return new String(chars);
    }

}
