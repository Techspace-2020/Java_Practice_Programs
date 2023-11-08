package com.practice.array_problem;

import java.util.Arrays;
import java.util.HashSet;

public class CommonElementsInArrays {
    public static void main(String[] args) {

        String[] array1 = {"Python", "JAVA", "PHP", "C#", "C++", "SQL"};
        String[] array2 = {"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};

        int[] arr=new int[]{1,2,4,5,7,8,10};
        int[] arr1= new int[]{2,3,6,9,10};
        CommonElementsInArrayValues(arr,arr1);
        HashSet<String> hashSet = new HashSet<>();
        for (int i = 0; i < array1.length; i++)
        {
            for (int j = 0; j < array2.length; j++)
            {
                if(array1[i].equals(array2[j]))
                {
                    hashSet.add(array1[i]);
                }
            }
        }
        System.out.println("Common element in string values:"+ hashSet);
    }

    private static void CommonElementsInArrayValues(int[] arr1, int[] arr2){
        for (int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.println("Common elements in array values:"+ arr1[i]);
                }
            }
        }
    }
}
