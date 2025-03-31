package com.mritunjay.Chap_28_GreedyAlgorithm.MinAbsDifferencePairs;

import java.util.*;

public class Classroom {
    public static void main(String [] args){
        int [] A = {4,1,8,7}, B={2,3,6,5};
        Arrays.sort(A);
        Arrays.sort(B);

        int absMinDiff = 0;

        for(int i=0; i<A.length; i++){
            absMinDiff += Math.abs(A[i]-B[i]);
        }

        System.out.println("Absolute Minimum Difference of Pair = "+absMinDiff);

    }
}
