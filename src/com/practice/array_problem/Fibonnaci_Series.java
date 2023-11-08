package com.practice.array_problem;

public class Fibonnaci_Series {
    public static void main(String[] args) {
        int firstTerm=0,secondTerm=1,thirdTerm;
        int num=10;
        System.out.println("fibonnacci series:");
        for(int i=0;i<num;i++){
            System.out.print(firstTerm+ " ");
            thirdTerm=firstTerm+secondTerm;
            firstTerm=secondTerm;
            secondTerm=thirdTerm;

        }

    }

}
