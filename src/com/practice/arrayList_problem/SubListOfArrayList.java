package com.practice.arrayList_problem;

import java.util.ArrayList;
import java.util.List;

public class SubListOfArrayList {
    public static void main(String[] args) {
        try {
            ArrayList<String> al2= new ArrayList<String>();
            al2.add("Howdy");
            al2.add("Good Evening");
            al2.add("bye");
            al2.add("Good night");

            List<String> result = new ArrayList<>();
            result=al2.subList(1,3);//start index is inclusive and end index is exclusive
            System.out.println(result);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
