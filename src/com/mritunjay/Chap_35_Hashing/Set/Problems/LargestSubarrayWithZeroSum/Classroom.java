package com.mritunjay.Chap_35_Hashing.Set.Problems.LargestSubarrayWithZeroSum;

import java.util.HashMap;

public class Classroom {

    public static void main(String [] args){
        int [] arr = {15,-2,2,-8,1,7,10,23};

        HashMap<Integer,Integer> map = new HashMap<>();
        //key=sum , value=idx
        int sum=0;
        int len= 0; //length of subarray whose sum is 0
        for(int j=0; j<arr.length;j++){
            sum+= arr[j];
            if(map.containsKey(sum)){
                len = Math.max(len,j-map.get(sum));
            }else{
                map.put(sum,j);
            }
        }

        System.out.println("Length of the largest subarray with sum 0 is : "+len);
    }
}
