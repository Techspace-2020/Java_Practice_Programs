package com.practice.string_problem;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharacter {
    public static void main(String[] args) {
        String str="laptop";
        String str1="hello from the world hello";
        System.out.println("Normal method:"+ freqOfStr(str1));
        char[] arrChar = str.toCharArray();
        int count=1;

        Map<Character,Integer> map = new HashMap<Character,Integer>();

        for(Integer i=0;i<arrChar.length;i++){
            if(!map.containsKey(arrChar[i])){
                map.put(arrChar[i],count);
            }else{
                map.put(arrChar[i],map.get(arrChar[i])+1);
            }
        }

        for(Character character: map.keySet()){
            if(map.get(character)>1)
                System.out.println(character + ":" + map.get(character));
        }
    }

    public static Map<String,Integer> freqOfStr(String input){
        Map<String,Integer> map = new HashMap<>();
        for (String ch:input.split(" ")){
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        return map;
    }

}
