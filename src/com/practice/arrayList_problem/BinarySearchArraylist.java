package com.practice.arrayList_problem;

import java.util.ArrayList;

public class BinarySearchArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(11);
        arrList.add(22);
        arrList.add(33);
        arrList.add(44);
        arrList.add(55);
        arrList.add(66);
        int result = BinarySearch(arrList, 44);
        if(result==-1){
            System.out.println("Search not found");
        }else{
            System.out.println("Search found at: "+ result);
        }
    }
    private static int BinarySearch(ArrayList<Integer> arr, int searchKey ){
        int leftId=0, rightId=arr.size()-1,mid;

        while(leftId<=rightId){
            mid =leftId+(rightId-leftId)/2;
            if(arr.get(mid)==searchKey){
                return mid;
            } if (arr.get(mid) < searchKey) {
                leftId = mid+1;

            }else{
                rightId = mid-1;
            }

        }
        return -1;
    }
}
