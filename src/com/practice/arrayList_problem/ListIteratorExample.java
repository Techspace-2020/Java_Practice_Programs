package com.practice.arrayList_problem;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("Shyam");
        names.add("Rajat");
        names.add("Paul");
        names.add("Tom");
        names.add("Kate");
        names.add(4,"ram");

        ListIterator<String> listIterator = names.listIterator();
        System.out.println("Traversing the list in forward direction:");
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        System.out.println("Traversing the list in backward direction:");
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }
}
