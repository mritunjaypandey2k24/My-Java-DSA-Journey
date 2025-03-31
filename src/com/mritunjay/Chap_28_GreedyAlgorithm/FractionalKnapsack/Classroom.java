package com.mritunjay.Chap_28_GreedyAlgorithm.FractionalKnapsack;

import java.util.*;

public class Classroom {

    public static void main(String [] args){
        int [] value = {60,100,120};
        int [] weight = {10,20,30};

        int W = 50;

        double [][] ratio = new double[value.length][2];
        //col 0 => idx & col 1 => ratio

        for(int i=0; i<ratio.length; i++){
            ratio[i][0] = i;
            ratio[i][1] = value[i]/(double)weight[i];
        }

        //Ascending order sort
        Arrays.sort(ratio, Comparator.comparingDouble(o->o[1]));

        int capacity = W;
        int finalVal = 0;

        //as ratio is in ascending we traverse ratio column(1) in ratio array in the descending order i.e n-1 to 0

        for(int i=ratio.length-1; i>=0; i--){

            int idx = (int)ratio[i][0];

            if(capacity >= weight[idx]){
                finalVal += value[idx];
                capacity -= weight[idx];
            }
            else{

                finalVal += (capacity*ratio[i][1]);
                capacity =0;
                break;
            }
        }

        System.out.println("Max total Value = "+finalVal);
    }
}
