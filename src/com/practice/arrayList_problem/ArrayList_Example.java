package com.practice.arrayList_problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList_Example {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        System.out.println("Accessing elements:"+arrayList.get(1));
        System.out.println("=================");
        System.out.println("Removing elemets:"+ arrayList.remove(2));
        System.out.println("=================");
        System.out.println("Changing elements:"+ arrayList.set(0,5));

        System.out.println("=================");
        Collections.sort(arrayList,Collections.reverseOrder());

        for(int num: arrayList)
            System.out.println(num);

        System.out.println("Looping through the iterator");
        Iterator<Integer> integerIterator = arrayList.iterator();
        while (integerIterator.hasNext()){
            System.out.println(integerIterator.next());
        }



    }
}
