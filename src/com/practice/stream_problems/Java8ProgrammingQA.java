package com.practice.stream_problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8ProgrammingQA {
    public static void main(String[] args) {
        List<PersonData> personDataList = Stream.of(
                new PersonData(1, "aman", "chennai", 24, "Male", Arrays.asList("8146282398","723487651")),
                new PersonData(2, "vikash", "karnataka", 30, "Male",Arrays.asList("91456382398","951443287")),
                new PersonData(3,"mahesh","Tamilnadu", 45, "Male", Arrays.asList("908006451","8561233451")),
                new PersonData(4, "Vinod", "Bengaluru", 35, "Male", Arrays.asList("9051478292","876518104")),
                new PersonData(5, "rohini", "hyd", 14,"female",Arrays.asList("7543328190","84539728710")),
                new PersonData(6, "bharathi","orissa",21,"female",Arrays.asList("84319075513","9514433661"))
        ).collect(Collectors.toList());

        //Find the list of person with range of age b/w 20-40
        final List<PersonData> filterAge = personDataList.stream().filter(person -> person.age > 20 && person.age <= 40).collect(Collectors.toList());
        //System.out.println(filterAge.stream().count() +" " +filterAge);

        //Find the person who stays in karnataka and then sort by their names
        final List<PersonData> filterSortPerson = personDataList.stream().filter(person -> person.place.equals("karnataka"))
                .sorted(Comparator.comparing(PersonData::getName))  // reverseOrder -> sorted(Comparator.comparing(PersonData::getName,Collections.reverseOder()))
                .collect(Collectors.toList());
        //System.out.println(filterSortPerson);

        //Find all the person place
        final List<String> allPlaces = personDataList.stream().map(PersonData::getPlace).collect(Collectors.toList());
        //System.out.println(allPlaces);

        //Find all the phoneNumbers
        final List<List<String>> contacts = personDataList.stream().map(PersonData::getPhoneNum).collect(Collectors.toList());
        //System.out.println(contacts);
        final List<String> flatMapContacts = personDataList.stream().flatMap(person -> person.getPhoneNum().stream()).collect(Collectors.toList());
        //System.out.println(flatMapContacts);

        //Group all Male candidates
        final Map<String, List<PersonData>> groupAge = personDataList.stream().collect(Collectors.groupingBy(PersonData::getGender));
        //System.out.println(groupAge);
        final Map<String, Long> groupCountAge = personDataList.stream().collect(Collectors.groupingBy(PersonData::getGender, Collectors.counting()));
        //System.out.println(groupCountAge);

        //Average age of the person
        final Map<String, Double> avgAge = personDataList.stream().collect(Collectors.groupingBy(PersonData::getGender, Collectors.averagingInt(PersonData::getAge)));
        System.out.println(avgAge);
    }
}
