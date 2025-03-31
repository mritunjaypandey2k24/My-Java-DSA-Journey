package com.mritunjay.Chap_34_Heap.Practise.MinimumTimeTOFillNSlots;

import java.util.LinkedList;
import java.util.Queue;

public class Classroom {
    public static void minTime(int [] arr, int N, int K){
        Queue<Integer> q = new LinkedList<>();

        boolean [] vis = new boolean [N+1];
        int time=0;

        for(int i=0; i<K;i++){
            q.add(arr[i]);
            vis[arr[i]] = true;
        }

        while(q.size()>0){

            int levelSize = q.size();

            for(int i=0; i<levelSize; i++){
                int curr = q.remove();
                if(curr-1 >=1 && !vis[curr-1]){
                    vis[curr-1] = true;
                    q.add(curr-1);
                }
                if(curr+1<=N && !vis[curr+1]){
                    q.add(curr+1);
                    vis[curr+1]= true;
                }
            }

            time++;
        }

        System.out.println(time-1);
    }

    public static void main(String [] args){
        int [] arr = {2,6};
        int N=6,k=2;
        minTime(arr,N,k);
    }

}
