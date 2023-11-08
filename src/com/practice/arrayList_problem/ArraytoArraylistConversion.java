package com.practice.arrayList_problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraytoArraylistConversion {
    public static void main(String[] args) {
        String cityNames[]={"Agra", "Mysore", "Chandigarh", "Bhopal"};

        //conversion using Array.asList():
        ArrayList<String> arrayList =new ArrayList<>(Arrays.asList(cityNames));
        System.out.println("conversion using Array.asList():");
        for (String temp: arrayList)
            System.out.println(temp+" ");

        //conversion using collection
        ArrayList<String> arrayList1= new ArrayList<String>();
        Collections.addAll(arrayList1,cityNames);
        System.out.println("conversion using collection:");
        for (String temp:arrayList1)
            System.out.println(temp+" ");

    }
}
