package com.mritunjay.Chap_28_GreedyAlgorithm.JobSequenceProblem;

import java.util.ArrayList;
import java.util.Collections;

public class Classroom {

    static class Job{
        int id;
        int deadline;
        int profit;

        public  Job(int i, int d, int p){
            id = i;
            deadline = d;
            profit = p;
        }
    }

    public static void main(String [] args){
        int [] [] jobInfo = {{4,20}, {1,10},{1,40},{1,30}};

        ArrayList<Job> jobs = new ArrayList<>();

        for(int i=0; i<jobInfo.length; i++){
            jobs.add(new Job(i,jobInfo[i][0],jobInfo[i][1]));
        }

        //Sort the Jobs in descending order of profit in ArrayList jobs
        Collections.sort(jobs, (obj1,obj2)-> obj2.profit - obj1.profit);

        ArrayList<Integer> seq = new ArrayList<>();
        int time =0;

        for(int i=0; i<jobs.size(); i++){
            Job curr = jobs.get(i);
            if(curr.deadline > time){
                seq.add(curr.id);
                time++;
            }
        }

        System.out.println("Maxm jobs = "+seq.size());
        System.out.println("Their index in jobInfo is: ");
        for(int i=0; i<seq.size(); i++){
            System.out.print(seq.get(i)+"  ");
        }
        System.out.println();
    }
}
