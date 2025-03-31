package com.mritunjay.Chap_39_GraphIII.Dijkstra_Algorithm;
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
        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,7));

        //2-vertex
        graph[2].add(new Edge(2,4,3));

        //3-vertex
        graph[3].add(new Edge(3,5,1));

        //4-vertex
        graph[4].add(new Edge(4,3,2));
        graph[4].add(new Edge(4,5,5));


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


    public static  void dijkstra(ArrayList<Edge>[]graph,int src){

        int [] dist = new int [graph.length];

        for(int i=0; i<graph.length; i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }

        boolean [] vis = new boolean[graph.length];

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        pq.add(new Pair(src,0));

        while(!pq.isEmpty()){
            Pair curr = pq.remove();

            if(!vis[curr.n]){
                vis[curr.n] = true;

                for(int i=0; i<graph[curr.n].size(); i++){
                    Edge e = graph[curr.n].get(i);

                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;

                    if(dist[u]+wt < dist[v]){
                        dist[v] = dist[u] + wt;
                        pq.add(new Pair(v,dist[v]));
                    }

                }
            }
        }

        //print distance of src from all vertices

        for(int i=0; i<dist.length; i++){
            System.out.print(dist[i]+" ");
        }
        System.out.println();
    }



    public static void main(String [] args){

        int v = 6;
        ArrayList<Edge> [] graph = new ArrayList[v];
        createGraph(graph);
        int src =0;
        dijkstra(graph,src);





    }
}

