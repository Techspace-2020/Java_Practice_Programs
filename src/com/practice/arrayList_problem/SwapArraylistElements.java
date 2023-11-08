package com.practice.arrayList_problem;

import java.util.ArrayList;
import java.util.Collections;

public class SwapArraylistElements {
    public static void main(String[] args) {
        ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        System.out.println("Array list before Swap:");
        System.out.println(c1+" ");

        System.out.println("Array list after Swap:");
        Collections.swap(c1,0,3);
        System.out.println(c1+" ");
    }
}
