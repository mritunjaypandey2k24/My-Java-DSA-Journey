package com.mritunjay.Chap_26_Stacks.Questions.NextGreaterElement;

public class BruteForce {
    public static void main(String [] args){
        int[] arr = {6, 8, 0, 1, 3};
        int[] nextGreater = new int[arr.length];
        nextGreater[arr.length-1]=-1;

        for (int i = 0; i < arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    nextGreater[i]=arr[j];
                    break;
                }else{
                    nextGreater[i] =-1;
                }
            }
        }

        for(int i=0; i<nextGreater.length;i++){
            System.out.print(nextGreater[i]+" ");
        }
    }
}
