package com.mritunjay.Chap_23_ArrayList.PractiseProblem;

import java.util.ArrayList;

public class MostFrequentNumber {
    public static int mostFrequent(ArrayList<Integer> nums, int key){
        ArrayList<Integer> result= new ArrayList<>();
        for(int i=0; i<nums.size();i++){
            if(nums.get(i)==key){
                int target = nums.get(i+1);

                while(result.size()<=target){
                    result.add(0);
                }
                result.add(target, result.get(target)+1);
            }
        }

        int max=0;
        int ans=0;
        for(int i=0; i<result.size();i++){
            if(result.get(i)>max){
                max= result.get(i);
                ans = i;
            }
        }
        return ans;
    }

    public static void main(String [] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(100);
        list.add(200);
        list.add(1);
        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);

        System.out.println(mostFrequent(list,1));
    }


}
