package com.mritunjay.Chap_39_GraphIV.MST_PrimsAlgorithm;
import java.util.*;
public class Classroom {
    public static class Edge{
        int src;
        int dest;
        int wt;


        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;

        }
    }

    public static void createGraph(ArrayList<Edge>[] graph){

        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }


        //0-vertex
        graph[0].add(new Edge(0,1,10));
        graph[0].add(new Edge(0,2,30));
        graph[0].add(new Edge(0,3,15));

        //1-vertex
        graph[1].add(new Edge(1,0,10));
        graph[1].add(new Edge(1,3,40));

        //2-vertex
        graph[2].add(new Edge(2,0,15));
        graph[2].add(new Edge(2,3,50));

        //3-vertex
        graph[3].add(new Edge(3,1,40));
        graph[3].add(new Edge(3,0,30));
        graph[3].add(new Edge(3,2,50));




    }

    public static class Pair implements Comparable<Pair>{
        int src;
        int v;
        int cost;

        public Pair(int s, int v, int c){
            this.src = s;
            this.v =v;
            this.cost = c;
        }

        @Override
        public int compareTo(Pair p2){
            return this.cost - p2.cost;
        }
    }


    public static void prims(ArrayList<Edge>[] graph){

        boolean [] vis = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int finalCost = 0;
        pq.add(new Pair(0,0,0));

        ArrayList<Edge> MST = new ArrayList<>();

        while (!pq.isEmpty()){
            Pair curr = pq.remove();

            if(!vis[curr.v]){
                vis[curr.v] = true;

                finalCost+= curr.cost;
                MST.add(new Edge(curr.src,curr.v,curr.cost));

                for(int i=0; i<graph[curr.v].size(); i++){
                    Edge e = graph[curr.v].get(i);
                    pq.add(new Pair(e.src,e.dest,e.wt));
                }
            }
        }

        System.out.println("Final (minm) cost of MST is "+finalCost);

        for(int i=0; i<MST.size();i++){
            System.out.println(MST.get(i).src +"->"+ MST.get(i).dest+ " cost = "+MST.get(i).wt);
        }
    }








    public static void main(String [] args){

        int v = 4;
        ArrayList<Edge> [] graph = new ArrayList[v];
        createGraph(graph);
        prims(graph);





    }
}

