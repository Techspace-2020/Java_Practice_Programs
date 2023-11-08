package com.practice.generics;

import java.util.ArrayList;
import java.util.List;

public class UnboundedWildcard {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        System.out.println("Adding String elements:");
        myElements(arrayList);

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(3);
        System.out.println("Adding Integer elements:");
        myElements(arrayList1);
    }

    private static void myElements(List<?> arr){
        for (Object numbers : arr){
            System.out.println(numbers+" ");
        }
    }
}
