package com.practice.string_problem;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class longestWord {
    public static void main(String[] args) {
        String str1 = "This course has multiple practice exams";
        String[] word = str1.split(" ");
        //System.out.println(word);


        String[] str={"this","course","has","multiple","practice","exmas"};

        String longWord="";
        for (int i=1;i<str.length-1;i++){
            if(str[i].length()>str[0].length()){
                longWord=str[i];
            }
        }
        //System.out.println(longWord+""+longWord.length());

        //Using Stream
        final String longStr = Stream.of(word).reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2).get();
        System.out.println(longStr);
    }
}
