package com.practice.arrayList_problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayList_Example {
    public static void main(String[] args) {
//        ArrayList<Integer> arrayList = new ArrayList<Integer>();
//        arrayList.add(1);
//        arrayList.add(2);
//        arrayList.add(3);
//        arrayList.add(4);
//        System.out.println("Accessing elements:"+arrayList.get(1));
//        System.out.println("=================");
//        System.out.println("Removing elemets:"+ arrayList.remove(2));
//        System.out.println("=================");
//        System.out.println("Changing elements:"+ arrayList.set(0,5));
//
//        System.out.println("=================");
//        Collections.sort(arrayList,Collections.reverseOrder());
//
//        for(int num: arrayList)
//            System.out.println(num);
//
//        System.out.println("Looping through the iterator");
//        Iterator<Integer> integerIterator = arrayList.iterator();
//        while (integerIterator.hasNext()){
//            System.out.println(integerIterator.next());
//        }
//
//        arrayList.stream().forEach(System.out::println);

        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        // Search the value Red

        List<Boolean> red = list_Strings.stream().map(color -> color.equals("Red")).collect(Collectors.toList());
        System.out.println(red);
    }
}
