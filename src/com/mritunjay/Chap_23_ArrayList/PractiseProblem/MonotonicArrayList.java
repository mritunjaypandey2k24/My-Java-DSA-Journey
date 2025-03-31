package com.mritunjay.Chap_23_ArrayList.PractiseProblem;

import java.util.ArrayList;
import java.util.Collections;

public class MonotonicArrayList {
    public static boolean monotonic(ArrayList<Integer> list){
        boolean isInc = true;
        boolean isDec = true;

        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)<list.get(i+1)){
                isDec= false;
            }
            if(list.get(i)>list.get(i+1)){
                isInc=false;
            }
        }

        return isInc||isDec;
    }
    public static void main(String [] args){
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(7);
        list.add(4);
        list.add(5);
        System.out.println(monotonic(list));
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(monotonic(list));



    }
}
