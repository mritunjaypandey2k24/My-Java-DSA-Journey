package com.mritunjay.Chap_35_Hashing.Map.HashMap.Problems.MajorityElement;

import java.util.HashMap;

public class Classroom {
    public static void main(String [] args){
//        int [] arr = {1,3,2,5,1,3,1,5,1};
        int [] arr = {1,2};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }

        for(Integer key: map.keySet()){
            if(map.get(key) > arr.length/3){
                System.out.print(key+" ");
            }
        }
    }
}
