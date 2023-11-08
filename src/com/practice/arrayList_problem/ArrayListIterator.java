package com.practice.arrayList_problem;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {
    public static void main(String[] args) {
        ArrayList names = new ArrayList();
        names.add("Chaitanya");
        names.add("Steve");
        names.add("Jack");
//        names.add(10);
// Iteration can be done in two ways 1. for loop 2. Iterator method
        Iterator it = names.iterator();

        while(it.hasNext()) {
            String obj = (String)it.next();
            System.out.println(obj);
        }
    }
}
