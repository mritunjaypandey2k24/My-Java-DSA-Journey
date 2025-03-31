package com.mritunjay.Chap_28_GreedyAlgorithm.ActivitySelection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Classroom2 {
    //Here we are provide end array which are not sorted so we use 2d array to solve
    public static void main(String [] args){
        //End array is given sorted Already

        // Here we are changing the order and making end time unsorted so the activity no i.e A0,A1,A2 etc will change
        //but max activity remain same;
        int [] start = {0,5,8,5,1,3};
        int [] end = {6,7,9,9,2,4};

        //Sorting
        int [][] activities = new int [start.length][3];

        for(int i=0; i< start.length; i++){
            activities[i][0] =i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }
        //lambda function - short form to sort the 2D array based on column 2 i.e end time row
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));


        int maxAct = 0;

        ArrayList<Integer> ans = new ArrayList<>();

        //1st Activity
        maxAct = 1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];

        for(int i=1; i<end.length; i++){
            if(activities[i][1] >= lastEnd){
                //Select this activity
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
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
