package com.mritunjay.Chap_34_Heap.PriorityQueue.CreatePriorityQueue;
import java.util.Comparator;
import java.util.PriorityQueue;
public class Classroom {

    public static void main(String [] args){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(5);
        pq.add(4);
        pq.add(3);
        pq.add(2);
        pq.add(1);
        System.out.println("Priority Queue ( Default priority) ");


        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }

        PriorityQueue<Integer>pq1 =new PriorityQueue<>(Comparator.reverseOrder());
        pq1.add(1);
        pq1.add(2);
        pq1.add(3);
        pq1.add(4);
        pq1.add(5);
        System.out.println("Priority Queue ( Priority Reversed) ");
        while(!pq1.isEmpty()){
            System.out.println(pq1.peek());
            pq1.remove();
        }

    }
}
