package com.mritunjay.ArrayList.PairSum_2_InSorted_Rotated_ArrayList;

import java.util.ArrayList;

public class Bruteforce {

    public static boolean pairSum2(ArrayList<Integer>list,int target){  //O(n^2)
        for(int i=0;i<list.size();i++){
            for(int j=i+1; j<list.size();j++){
                if(list.get(i)+list.get(j)== target){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(pairSum2(list,16));


    }
}
