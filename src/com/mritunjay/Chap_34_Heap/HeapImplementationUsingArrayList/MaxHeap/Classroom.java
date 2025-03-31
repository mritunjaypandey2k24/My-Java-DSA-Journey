package com.mritunjay.Chap_34_Heap.HeapImplementationUsingArrayList.MaxHeap;
import java.util.*;
public class Classroom {

    static class Heap{

        ArrayList<Integer> arr = new ArrayList<>();


        //Insert Element in a heap
        public void add(int data){

            arr.add(data);

            int x = arr.size()-1;  //x is index of child
            int par = (x-1)/2; //index of parent

            while(arr.get(x)>arr.get(par)){
                int temp = arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par,temp);

                x = par;
                par = (x-1)/2;

            }
        }


        public int peek(){
            return arr.get(0);
        }

        private void heapify(int i){
            int left = 2*i+1;
            int right = 2*i+2;
            int maxIdx = i;

            if(left<arr.size() && arr.get(maxIdx)<arr.get(left)){
                maxIdx = left;
            }

            if(right<arr.size() && arr.get(maxIdx) < arr.get(right)){
                maxIdx = right;
            }

            if(maxIdx != i){
                //swap
                int temp = arr.get(i);
                arr.set(i,arr.get(maxIdx));
                arr.set(maxIdx, temp);

                heapify(maxIdx);
            }
        }
        public int remove(){
            int data =  arr.get(0);

            //Step 1 swap first and last element //O(1)
            int temp = arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);


            //Step 2 delete last element //O(1)

            arr.remove(arr.size()-1);

            //Step 3: heapify
            heapify(0);

            return data;
        }

        public boolean isEmpty(){
            return arr.size()==0;
        }




    }


    public static void main(String [] args){

        Heap h = new Heap();
        h.add(1);
        h.add(2);
        h.add(3);
        h.add(4);

        while(!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
        }

    }
}
