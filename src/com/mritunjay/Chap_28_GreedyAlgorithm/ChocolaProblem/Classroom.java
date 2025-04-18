package com.mritunjay.Chap_28_GreedyAlgorithm.ChocolaProblem;

import java.util.Arrays;
import java.util.Collections;

public class Classroom {

    public static void main(String [] args){
        int n=4, m=6;
        Integer [] costVer = {2,1,3,1,4};
        Integer [] costHor = {4,1,2};

        Arrays.sort(costHor, Collections.reverseOrder());
        Arrays.sort(costVer, Collections.reverseOrder());

        int h=0,v=0; //pointers
        int hp=1, vp =1;
        int cost =0;

        while(h<costHor.length && v<costVer.length){
            if(costVer[v] <= costHor[h]){//Horizontal cut
                cost += (costHor[h]*vp);
                hp++;
                h++;

            }else{
                //Vertical Cut
                cost += (costVer[v]*hp);
                vp++;
                v++;
            }
        }

        while(h<costHor.length){
            cost += (costHor[h]*vp);
            hp++;
            h++;
        }

        while(v<costVer.length){
            cost += (costVer[v]*hp);
            vp++;
            v++;
        }

        System.out.println("min cost of cuts = "+cost);
    }
}
