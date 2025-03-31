package com.mritunjay.Chap_28_GreedyAlgorithm.PracticeProblem;

public class LexicographicSmallestString {
    public static String findSmallestString(int N, int K){
        char [] result = new char[N];
        for(int i=0; i<N; i++){
            result[i] = 'a';
        }

        int remainingSum = K-N;

        int index = N-1;

        while(remainingSum>0 && index>=0){
            int addValue = Math.min(25,remainingSum);
            result[index] += addValue;
            remainingSum -= addValue;
            index--;
        }

        return new String(result);
    }

    public static void main(String [] args){
        int N=5, K=42;
        System.out.println(findSmallestString(N,K));
    }
}
