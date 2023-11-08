package com.practice.generics;

public class GenericMethod {
    public static <T> void getElements(T[] input){
        for (T arr:input){
            System.out.println(arr+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] str={"A","B","C"};
        getElements(str);
        Character[] chArr = {'H', 'E', 'L', 'L', 'O'};
        getElements(chArr);
    }
}
