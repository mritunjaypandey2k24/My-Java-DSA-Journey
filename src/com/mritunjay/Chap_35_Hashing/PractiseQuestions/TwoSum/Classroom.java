package com.mritunjay.Chap_35_Hashing.PractiseQuestions.TwoSum;
import java.util.HashMap;
public class Classroom {
    public static void main(String [] args){
        int [] arr = {3,2,4};
        int target = 6;
        int diff =0;
        HashMap<Integer, Integer> map = new HashMap<>();
        // sum & index
        int [] ans = new int [2];

        for(int j=0; j<arr.length; j++){
            diff = target -arr[j];
            if(map.containsKey(diff)){
                ans[0]= map.get(diff);
                ans[1] = j;
                break;
            }

            map.put(arr[j],j);
        }

        for(int i=0; i<2; i++){
            System.out.print(ans[i]+" ");
        }

    }
}
