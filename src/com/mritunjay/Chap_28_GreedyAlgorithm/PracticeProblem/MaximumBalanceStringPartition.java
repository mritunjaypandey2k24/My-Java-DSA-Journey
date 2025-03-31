package com.mritunjay.Chap_28_GreedyAlgorithm.PracticeProblem;

public class MaximumBalanceStringPartition {


    public static int maxBalancePartition(String s){
        int l =0, r=0;
        int ans =0;

        for(char ch : s.toCharArray()){
            if(ch=='L'){
                l++;
            }else if(ch=='R'){
                r++;
            }

            if(l==r){
                ans++;
            }
        }

        return ans;

    }

    public static void main(String [] args){
        String s = "LRRRRLLRLLRL";
        System.out.println(maxBalancePartition(s));
    }
}
