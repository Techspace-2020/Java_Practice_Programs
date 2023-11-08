package com.practice.arrayList_problem;

import java.util.ArrayList;

public class ConvertingArraylistToArray {
    public static void main(String[] args) {
        ArrayList<String> al2= new ArrayList<String>();
        al2.add("Howdy");
        al2.add("Good Evening");
        al2.add("bye");
        al2.add("Good night");

        //converting arraylist to array
        String[] arr= new String[al2.size()];
        System.out.println("converting arraylist to array:");
        for(int i=0;i<al2.size();i++){
            arr[i]= al2.get(i);
        }
        for (String temp:arr)
            System.out.println(temp+" ");

        //converting arraylist using toArray()
        String[] arr1= al2.toArray(new String[0]);// new String[al2.size()]
        System.out.println("converting arraylist using toArray:");
        for (String temp:arr1)
            System.out.println(temp+" ");

    }
}
