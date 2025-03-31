package com.mritunjay.Chap_28_GreedyAlgorithm.ActivitySelection;

import java.util.ArrayList;

public class Classroom1 {

    public static void main(String [] args){
        //End array is given sorted Already

        int [] start = {1,3,0,5,8,5};
        int [] end = {2,4,6,7,9,9};

        int maxAct = 0;

        ArrayList<Integer> ans = new ArrayList<>();

        //1st Activity
        maxAct = 1;
        ans.add(0);
        int lastEnd = end[0];

        for(int i=1; i<end.length; i++){
            if(start[i]>= lastEnd){
                //Select this activity
                ans.add(i);
                lastEnd = end[i];
                maxAct++;
            }
        }

        System.out.println("Max Activity = "+maxAct);
        for(int answer : ans){
            System.out.print("A"+answer+ " ");
        }
        System.out.println();



    }
}
