package com.mritunjay.Chap_34_Heap.HeapImplementationUsingArrayList.InsertElementInHeap;
import java.util.*;
public class Classroom {

    static class heap{

        ArrayList<Integer> arr = new ArrayList<>();


        //Insert Element in a heap
        public void add(int data){

            arr.add(data);

            int x = arr.size()-1;  //x is index of child
            int par = (x-1)/2; //index of parent

            while(arr.get(x)<arr.get(par)){
                int temp = arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par,temp);

            }
        }








    }


    public static void main(String [] args){

    }
}
