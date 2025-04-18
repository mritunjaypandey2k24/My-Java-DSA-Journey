package com.mritunjay.Chap_38_GraphII.BiPartiteGraph;
import java.util.*;
public class Classroom {
    public static class Edge{
        int src;
        int dest;


        public Edge(int s, int d){
            this.src = s;
            this.dest = d;

        }
    }

    public static void createGraph(ArrayList<Edge>[] graph){

        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // 0- vertex
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        //1-vertex
        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));

        //2-vertex
//        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));

        //3-vertex
        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));

        //4-vertex
        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));



    }



    public static boolean isBipartite(ArrayList<Edge> [] graph){

        int[] color = new int[graph.length];
        Arrays.fill(color,-1);

        Queue<Integer> q = new LinkedList<>();

        for(int i=0; i<graph.length; i++){

            if(color[i] == -1){
                q.add(i);
                color[i] = 0; //yellow color

                while(!q.isEmpty()){
                    int curr = q.remove();

                    for(int j=0; j<graph[curr].size(); j++){
                        Edge e = graph[curr].get(j);
                        if(color[e.dest] == -1){
                            int nextCol = color[curr]==0?1:0;
                            color[e.dest] = nextCol;

                            q.add(e.dest);
                        }
                        else if(color[e.dest] == color[curr]){
                            return false; //Not Bipartite
                        }
                    }
                }
            }
        }

        return true;

    }





    public static void main(String [] args){

        int v = 5;
        ArrayList<Edge> [] graph = new ArrayList[v];
        createGraph(graph);

        System.out.println(isBipartite(graph));//false





    }
}
