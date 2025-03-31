package com.mritunjay.Chap_35_Hashing.Set.Problems.TotalSubarraysWithSumEqualtoK;

import java.util.HashMap;

public class Classroom {
    public static void main(String [] args){
        int [] arr = {10,2,-2,-20,10};
        int k=-10;

        int sum =0, ans=0;

        HashMap<Integer, Integer> map = new HashMap<>();
        //sum ans(count)

        map.put(0,1);

        for(int j=0; j<arr.length;j++){
            sum += arr[j];  //sum(j)
            if(map.containsKey(sum-k)){
                ans += map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);

        }

        System.out.println("No of Subarrays whose sum is k is: "+ans);
    }
}
