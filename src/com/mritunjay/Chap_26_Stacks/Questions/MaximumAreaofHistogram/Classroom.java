package com.mritunjay.Chap_26_Stacks.Questions.MaximumAreaofHistogram;

import java.util.Stack;

public class Classroom {

    public static void maxArea(int [] arr){
        int maxArea =0;
        int [] nsr = new int[arr.length];
        int [] nsl = new int[arr.length];

        Stack<Integer>s = new Stack<>();

        //Next smaller on the right-nsr
        for(int i=arr.length-1; i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = arr.length;
            }else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        //Next smaller on the left - nsl
        s = new Stack<>();
        for(int i=0; i<arr.length;i++){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            }else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        for(int i=0; i<arr.length;i++){
            int ht = arr[i];
            int width = nsr[i]-nsl[i]-1;

            int Area = ht* width;

            maxArea = Math.max(maxArea,Area);
        }

        System.out.println(maxArea);
    }
    public static void  main(String [] args){
        int [] arr = {2,1,5,6,2,3};
        maxArea(arr);
    }
}
