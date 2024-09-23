package com.practice.stream_problems;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class WordCapitalize {
    public static void main(String[] args) {
        String str = "hello world from the interpreter";
        String[] words = str.split(" ");
        //System.out.println(words);

        //System.out.println(str.substring(str.length()-1, str.length()));
        //final String collect = Arrays.stream(words).map(word -> word.substring(0,1).toUpperCase().concat(word.substring(1))).collect(Collectors.joining(" "));
        final String collect = Arrays.stream(words).map(word -> word.substring(0,1).toUpperCase() + word.substring(1)).collect(Collectors.joining(" "));

        final String collect2 = Arrays.stream(words).map(str1 -> str1.substring(0, str1.length() - 1) + str1.substring(str1.length() - 1).toUpperCase()).collect(Collectors.joining(" "));
        //System.out.println(collect2);

        String longStr="";
        for (String word:words) {
            if(word.length()>words[0].length());
            longStr=word;
        }
        //System.out.println(longStr);
        int countStr=0;
        for(int st=0;st< words.length;st++){
            for (int st1=st+1;st1< words.length;st1++){
                if (words[st].equals(words[st1])){
                    countStr++;
                }
            }
        }
        //System.out.println(countStr);

        Map<String,Integer> matchedWords = new HashMap<>();
        for (String word:words){
            matchedWords.put(word, matchedWords.getOrDefault(word,0)+1);
        }
        for (Map.Entry<String,Integer> entry: matchedWords.entrySet()){
            if(entry.getValue()>1){
               // System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }



        final List<String> lonStr = Stream.of(words).filter(word -> word.length() > words[0].length()).collect(Collectors.toList());
        //System.out.println(lonStr);

        final List<StringBuilder> reverseStr = Stream.of(words).map(word -> new StringBuilder(word).reverse()).collect(Collectors.toList());
        //System.out.println(reverseStr);

        //Filter based on starting from number 1
        List<Integer> nums = Arrays.asList(1,2,13,5,6,18,25,19,20,12,1,18,20);
        //sum
        final int sum =nums.stream().mapToInt(Integer::intValue).sum();
        final Optional<Integer> reduce = nums.stream().reduce((a, b) -> a + b);
        //System.out.println(sum);

        //System.out.println(nums.stream().count());

        //IntStream.rangeClosed(1,10).forEach(System.out::println);

        final double avg = nums.stream().mapToInt(a -> a).average().getAsDouble();

        List<Integer> sqrNum = nums.stream().map(num->num*num).collect(Collectors.toList());

        final IntSummaryStatistics intSummaryStatistics = nums.stream().mapToInt(Integer::intValue).summaryStatistics();

        final double avgFilt=nums.stream().map(num->num*num).filter(a->a>100).mapToInt(b->b).average().getAsDouble();

        List<Integer> startWithNum = nums.stream().map(num->String.valueOf(num)).filter(num1->num1.startsWith("1") || num1.startsWith("-2")).map(Integer::valueOf).collect(Collectors.toList());

        Set<Integer> duplicateNum= nums.stream().filter(num->Collections.frequency(nums,num)>1).collect(Collectors.toSet());

        final int maxNum = nums.stream().mapToInt(Integer::intValue).max().getAsInt();

        List<Integer> descNum = nums.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());

        int secHighest = nums.stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).findFirst().get();

        final Map<Boolean, List<Integer>> evenOrOdd = nums.stream().collect(Collectors.partitioningBy(num -> num % 2 == 0));
        //System.out.println(evenOrOdd.get(false));

        //long collect1 = nums.stream().map(num -> num + "").filter(num1 -> num1.contains("1")).count();
        final List<String> collect1 = nums.stream().map(num -> num + "").filter(num1 -> num1.contains("1")).collect(Collectors.toList());
        //System.out.println(collect1);

        final List<Integer> evenNum = nums.stream().filter(num -> num % 2 != 0).collect(Collectors.toList());
        //System.out.println(evenNum);

        //sort array asc/desc
        final List<Integer> sortedList = nums.stream().sorted().collect(Collectors.toList());
        //System.out.println(sortedList);
        Collections.sort(nums,Collections.reverseOrder());
        //System.out.println(nums);

        List<String> fruits = Arrays.asList("apple","banana","cherry","mango","kiwi","orange");
        //Map<Integer, List<String>> collect3 = fruits.stream().collect(Collectors.groupingBy(String::length));
        //System.out.println(collect3);
        //fruits.stream().map(fruit->fruit+" "+ fruit.length()).forEach(System.out::println);
        //fruits.stream().collect(Collectors.groupingBy(String::length)).forEach((length,value)-> System.out.println("Length:"+length+"strings:"+value));



    }
}
