package com.mritunjay.Chap_34_Heap.Practise.KthLargestElementInStream;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Classroom {

    static PriorityQueue<Integer> min;
    static int k;

    static List<Integer> getAllKthNumber(int [] arr){

        List<Integer>list = new ArrayList<>();

        for(int val: arr){
            if(min.size()<k){
                min.add(val);
            }
            else{
                if(val > min.peek()){
                    min.remove();
                    min.add(val);
                }
            }

            if(min.size()>=k){
                list.add(min.peek());
            }
            else{
                list.add(-1);
            }
        }

        return list;
    }

    public static void main(String [] args){

        int [] arr = {10,20,11,70,50,40,100,5};
        min = new PriorityQueue<>();
        k=3;

        List<Integer> res = getAllKthNumber(arr);
        for(int val: res){
            System.out.print(val+" ");
        }
        System.out.println();

    }
}
