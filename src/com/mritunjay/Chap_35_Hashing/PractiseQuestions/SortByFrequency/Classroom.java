package com.mritunjay.Chap_35_Hashing.PractiseQuestions.SortByFrequency;

import java.util.*;
public class Classroom {

    public static String sortByFreq(String str){
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        PriorityQueue<Map.Entry<Character,Integer>> pq = new PriorityQueue<>(
                (a,b)-> a.getValue().equals(b.getValue())?   //check if frequencies are equal
                        a.getKey()-b.getKey()    // if true then natural order for equal frequencies
                        :b.getValue()-a.getValue()  // if false then descending order for frequencies
        );

        pq.addAll(map.entrySet());

        StringBuilder sb = new StringBuilder("");

        while(!pq.isEmpty()){
            Map.Entry<Character,Integer> entry = pq.remove();
            char ch = entry.getKey();
            int freq = entry.getValue();

            for( int i=0; i<freq; i++){
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    public static void main(String [] args){
        String str = "tree";

        System.out.println(sortByFreq(str));
    }
}
