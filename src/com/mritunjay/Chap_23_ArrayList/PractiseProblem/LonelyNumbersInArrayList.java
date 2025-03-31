package com.mritunjay.Chap_23_ArrayList.PractiseProblem;

import java.util.ArrayList;
import java.util.Collections;

public class LonelyNumbersInArrayList {

    public static ArrayList<Integer> lonely(ArrayList<Integer>list){
        Collections.sort(list);
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0; i<list.size();i++){
            boolean isLonely = true;

            if(i>0 && (list.get(i)==list.get(i-1) || list.get(i)-1 == list.get(i-1))){
                isLonely = false;
            }

            if(i<list.size()-1 && (list.get(i)==list.get(i+1)||list.get(i)+1 == list.get(i+1))){
                isLonely = false;
            }


            if(isLonely){
                arr.add(list.get(i));
            }
        }


        return arr;

    }

    public static void main(String [] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);
        System.out.println(lonely(list));
    }
}
