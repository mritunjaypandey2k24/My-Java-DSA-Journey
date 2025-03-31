package com.mritunjay.Chap_28_GreedyAlgorithm.PracticeProblem;

public class KthLargestOddNumberinRange {
    public static int KthLargestOdd(int L, int R, int K){
        int firstOdd = L%2!=0? L:L+1;
        int lastOdd = R%2!=0? R:R-1;

        if(firstOdd>R || lastOdd <L){
            return 0;
        }

        int count = (lastOdd-firstOdd)/2 + 1;

        if(K> count ){
            return 0;
        }

        int KthOdd = lastOdd-2*(K-1);

        return KthOdd;
    }

    public static void main(String [] args){
        int L=-3,R=3, K=1;
        System.out.println(KthLargestOdd(L,R,K));
    }
}
