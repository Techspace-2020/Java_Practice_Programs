package com.practice.arrayList_problem;

import java.util.ArrayList;

public class Compare2Arraylist {
    public static void main(String[] args) {
        ArrayList<String> al1= new ArrayList<String>();
        al1.add("hi");
        al1.add("How are you");
        al1.add("Good Morning");
        al1.add("bye");
        al1.add("Good night");

        ArrayList<String> al2= new ArrayList<String>();
        al2.add("Howdy");
        al2.add("Good Evening");
        al2.add("bye");
        al2.add("Good night");

        ArrayList<String> result= new ArrayList<>();
        for (String temp: al1){
            result.add(al2.contains(temp)?"yes":"no");
        }
        System.out.println("Result after comparing:"+ result);
    }
}
