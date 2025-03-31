package com.mritunjay.Chap_39_GraphIV.BellmanFordmthd2_Algorithm;
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

    public static void createGraph(ArrayList<Edge> graph){




        graph.add(new Edge(0,1,2));
        graph.add(new Edge(0,2,4));


        graph.add(new Edge(1,2,-4));

        graph.add(new Edge(2,3,2));

        graph.add(new Edge(3,4,4));

        //4-vertex
        graph.add(new Edge(4,1,-1));


    }

    public static class Pair implements Comparable<Pair>{
        int n;
        int path;

        public Pair(int n, int path){
            this.n =n;
            this.path = path;
        }

        @Override
        public int compareTo(Pair p2){
            return this.path - p2.path;
        }
    }


    public static void bellmanFord(ArrayList<Edge> graph, int src,int V){

        int [] dist = new int [V];

        for(int i=0; i<dist.length; i++){
            if(i!= src){
                dist[i] = Integer.MAX_VALUE;
            }
        }



        for(int i=0; i<V-1; i++){

                for(int j=0; j<graph.size(); j++){
                    Edge e = graph.get(j);

                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;

                    if(dist[u] != Integer.MAX_VALUE && dist[u]+ wt < dist[v]){
                        dist[v] = dist[u]+wt;
                    }
                }

        }

        //print
        for(int i=0; i<dist.length; i++){
            System.out.print(dist[i]+" ");
        }
        System.out.println();
    }




    public static void main(String [] args){

        int v = 5;
        ArrayList<Edge> graph = new ArrayList<>();
        createGraph(graph);
        int src =0;
        bellmanFord(graph,src,v);





    }
}

