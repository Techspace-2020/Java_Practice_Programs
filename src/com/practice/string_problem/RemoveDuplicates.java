package com.practice.string_problem;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String word = "abcdabcd";
        if(word==null || word.length()<2){
            System.out.println(word);
        }
        int pos=1;
        char[] chars = word.toCharArray();

        for (int i=1;i<word.length();i++){
            int j;
            for(j=0;j<pos;++j){
                if(chars[i]==chars[j]){
                    break;
                }
            }
            if(j==pos){
                chars[pos]=chars[i];
            }else{
                chars[pos]=0;
            }
            ++pos;
        }
        System.out.println(chars);
    }
}
