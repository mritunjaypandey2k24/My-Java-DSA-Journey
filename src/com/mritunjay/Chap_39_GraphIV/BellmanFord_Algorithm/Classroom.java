package com.mritunjay.Chap_39_GraphIV.BellmanFord_Algorithm;
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
        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));

        //1-vertex
        graph[1].add(new Edge(1,2,-4));

        //2-vertex
        graph[2].add(new Edge(2,3,2));

        //3-vertex
        graph[3].add(new Edge(3,4,4));

        //4-vertex
        graph[4].add(new Edge(4,1,-1));


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


    public static void bellmanFord(ArrayList<Edge>[] graph, int src){

        int [] dist = new int [graph.length];

        for(int i=0; i<dist.length; i++){
            if(i!= src){
                dist[i] = Integer.MAX_VALUE;
            }
        }

        int V = graph.length;

        for(int i=0; i<V-1; i++){

            //edges
            for(int j=0; j<graph.length; j++){
                for(int k=0; k<graph[j].size(); k++){
                    Edge e = graph[j].get(k);

                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;

                    if(dist[u] != Integer.MAX_VALUE && dist[u]+ wt < dist[v]){
                        dist[v] = dist[u]+wt;
                    }
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
        ArrayList<Edge> [] graph = new ArrayList[v];
        createGraph(graph);
        int src =0;
        bellmanFord(graph,src);





    }
}

