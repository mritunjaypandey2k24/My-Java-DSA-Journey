package com.mritunjay.ArrayList.PairSum_1_InSortedArrayList;

import java.util.ArrayList;

public class TwoPointerApproach {

    public static boolean pairSum(ArrayList<Integer>list,int target){
        int lp=0, rp=list.size()-1;
        while(lp<rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }else if(list.get(lp)+list.get(rp)<target){
                lp++;
            }else{
                rp--;
            }
        }

        return false;
    }
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(pairSum(list,5));
        System.out.println(pairSum(list,100));


    }
}
