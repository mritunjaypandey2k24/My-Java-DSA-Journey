package com.mritunjay.ArrayList.ContainerWithMostWater;

import java.util.ArrayList;

public class TwoPointerApproach {
    public static void main(String[] args){
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        //Two pointer Approach - O(n)
        int lp  =0, rp=height.size()-1;
        int max=0;
        while(lp<rp){
            int waterheight = Math.min(height.get(lp),height.get(rp));
            int width = rp-lp;
            int trappedwater = waterheight*width;
            max = Math.max(max,trappedwater);
            if(height.get(lp)<height.get(rp)){
                lp++;
            }else{
                rp--;
            }

        }

        System.out.println(max);



    }
}
