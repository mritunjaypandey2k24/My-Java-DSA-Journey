package com.mritunjay.Chap_35_Hashing.Map.HashMap.IterationsInHashMap;

import java.util.HashMap;
import java.util.Set;

public class Classroom {

    public static void main(String [] args){
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",50);
        hm.put("Nepal",5);

        //Iterate using keySet()
        Set<String> keys = hm.keySet();
        System.out.println(keys);


        for(String k: keys){
            System.out.println("Keys = "+k+", Value = "+hm.get(k));
        }

        //Iterate Using entrySet()
        System.out.println(hm.entrySet());
    }
}
