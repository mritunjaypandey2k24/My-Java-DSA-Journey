package com.mritunjay.Chap_34_Heap.NearestKPointsOrCars;

import java.util.PriorityQueue;

public class Classroom {

    static class Point implements Comparable<Point>{

        int x;
        int y;
        int distSq;
        int idx;

        public Point(int x, int y, int distSq, int idx){
            this.x = x;
            this.y = y;
            this.distSq = distSq;
            this.idx  = idx;
        }

        public int compareTo(Point p1){
            return this.distSq-p1.distSq;
        }
    }


    public static void main(String [] args){
        int [] [] pts = {{3,3},{5,-1},{-2,4}};
        int k = 2;

        PriorityQueue<Point> pq = new PriorityQueue<>();

        for(int i=0; i<pts.length; i++){
            int dist = pts[i][0]*pts[i][0] + pts[i][1]*pts[i][0];
            pq.add(new Point(pts[i][0], pts[i][1],dist,i));
        }

        for(int i=0; i<k; i++){
            System.out.println("C"+pq.remove().idx);
        }
    }

}
