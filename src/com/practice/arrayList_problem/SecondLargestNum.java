package com.practice.arrayList_problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class SecondLargestNum {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(11);
        arrayList.add(12);
        arrayList.add(13);
        arrayList.add(9);
        arrayList.add(8);
        int[] arr = new int[arrayList.size()];
        for(int i=0;i<arrayList.size();i++){
            arr[i]= arrayList.get(i);
        }
        Arrays.sort(arr);
        for(int a : arr){
            System.out.print(a+ " ");
        }
        System.out.println();
        System.out.println("Second largest:"+ arr[arr.length-1]);

    }
}
