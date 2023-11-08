package com.practice.array_problem;

public class SearchIDsInArray {
    public static void main(String[] args) {
        int[] arr = {110745, 111011, 110818, 110542, 110841, 110599};
        int num=11059;
        SearchIDs(arr,num);


    }

    private static void SearchIDs(int[] arr1, int key) {

        Boolean found=false;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]==key) {
                found = true;
                break;

            }
        }
        if(found){
            System.out.println("Found: "+ key);
        }else{
            System.out.println("Not found!!");
        }

    }

}
