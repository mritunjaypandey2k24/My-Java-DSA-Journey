package com.mritunjay.ArrayList.ContainerWithMostWater;

import java.util.ArrayList;

public class BruteForce {


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

        //Brute force approach - O(n^2)
        int max=0;
        for(int i=0;i<height.size();i++){
            for(int j=i+1; j<height.size();j++){
                int waterlevel = Math.min(height.get(i),height.get(j));
                int width = j-i;
                int trappedwater = waterlevel*width;
                max = Math.max(max,trappedwater);
            }
        }
        System.out.println(max);

    }
}
