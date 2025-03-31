package com.mritunjay.Chap_35_Hashing.Map.HashMap.OperationsInHashMap;

import java.util.HashMap;

public class Classroom{
    public static void main(String [] args){
        HashMap<String, Integer> hm = new HashMap<>();
        //Insert Operation O(1)
        hm.put("India", 100);
        hm.put("China",150);
        hm.put("US",50);

        //Print HashMap
        System.out.println(hm);

        //Get operation O(1)
        int population = hm.get("India");
        System.out.println(population);
        System.out.println(hm.get("Indonesia"));

        //containsKey O(1)
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Indonesia"));

        //remove operation O(1)
        System.out.println(hm.remove("China"));
        System.out.println(hm);

        //size
        System.out.println(hm.size());

        //isEmpty();
        System.out.println(hm.isEmpty());

        //clear() operation
        hm.clear();
        System.out.println(hm.isEmpty());



    }
}
