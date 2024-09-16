package com.practice.string_problem;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedChar {
    public static void main(String[] args) {

        String str ="swiss";
        Map<Character,Integer> map = new LinkedHashMap<>(); //To maintain the insertion order.
        char[] arrChar = str.toCharArray();
        int count=1;

        for (int i=0;i<str.length();i++){
            if(!map.containsKey(arrChar[i]))
                map.put(arrChar[i],count);
            else
                map.put(arrChar[i],map.get(arrChar[i])+1);
        }

        for(Map.Entry<Character,Integer>entry: map.entrySet())
            if(entry.getValue()==1) {
                System.out.println("The first non repeated Character is:" + entry.getKey());
                break;
            }
    }
}
