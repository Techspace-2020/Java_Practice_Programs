package com.practice.arrayList_problem;

import java.util.ArrayList;

public class CloneArraylist {
    public static void main(String[] args) {
        ArrayList<String> al1= new ArrayList<String>();
        ArrayList<String> al2= new ArrayList<String>();
        al1.add("Howdy");
        al1.add("Good Evening");
        al1.add("bye");
        al1.add("Good night");

        int index=0;
        for(String ele: al1){
            al2.add(ele);
            index++;
        }
        System.out.println("Cloning of arraylist:"+ al2);
        System.out.println("");

        //using clone method:
        al2=(ArrayList<String>)al1.clone();
        System.out.println("Cloned array list:"+ al2);
        

    }
}
