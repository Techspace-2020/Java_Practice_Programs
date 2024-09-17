package com.practice.string_problem;

public class CheckRotation {
    public static void main(String[] args) {
        String original="IndiaVsAustralia";
        String rotation="AustraliaIndiaV";
        if(checkRotationString(original,rotation)){
            System.out.println(original+ " "+ "and" + " "+ rotation + " "+"are rotation of each other");
        }else{
            System.out.println("Not rotation of each other");
        }
    }

    public static boolean checkRotationString(String org, String rotate){
        if(org.length()!=rotate.length()){
            return false;
        }
        String concatenated = org+org;
        if(concatenated.indexOf(rotate)!=-1){
            return true;
        }
        return false;
    }
}
