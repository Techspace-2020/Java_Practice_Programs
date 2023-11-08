package com.practice.array_problem;

public class RemoveCharacterFromString {
    public static void main(String[] args) {
        String str="TechTalk";
        removeCharFromStr(str);

    }
    public static void removeCharFromStr(String str){
        String finalStr="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!='T'){
                finalStr=finalStr+str.charAt(i);
            }
        }
        System.out.print(finalStr);
    }
}
