package com.practice.string_problem;

public class CharacterCasing {
    public static void main(String[] args) {
        String str = "HeLLO";
        StringBuilder stringBuilder = new StringBuilder();

//        for( int i=0;i<str.length();i++){
//            if(Character.isLowerCase(str.charAt(i))){
//                stringBuilder.append(Character.toUpperCase(str.charAt(i)));
//            } else if (Character.isUpperCase(str.charAt(i))) {
//                stringBuilder.append(Character.toLowerCase(str.charAt(i)));
//            }
//        }
//        System.out.println(stringBuilder.toString());

        char[] charStr = str.toCharArray();
        for (Character ch:charStr){
            if(Character.isLowerCase(ch))
                stringBuilder.append(Character.toUpperCase(ch));
            else if (Character.isUpperCase(ch)) {
                stringBuilder.append(Character.toLowerCase(ch));
            }
        }
        System.out.println(stringBuilder.toString());
    }
}
