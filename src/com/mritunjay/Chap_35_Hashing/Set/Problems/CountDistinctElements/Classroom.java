package com.mritunjay.Chap_35_Hashing.Set.Problems.CountDistinctElements;

import java.util.ArrayList;
import java.util.HashSet;

public class Classroom {
    public static void main(String [] args){
        int [] nums = {4,3,2,5,6,7,3,4,2,1};

        //Brute force approach
//        ArrayList<Integer> arr =  new ArrayList<>();
//
//        for(int i=0; i<nums.length; i++){
//            if(!arr.contains(nums[i])){
//                arr.add(nums[i]);
//            }
//
//        }
//
//        System.out.println(arr.size());

        //Optimal approach

        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }

        System.out.println(set.size());

    }
}
