package com.mritunjay.Chap_35_Hashing.Set.TreeSet.IterationsOnTreeSet;

import java.util.*;

public class Classroom {
    public static void main(String [] args){
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Mumbai");
        ts.add("Pune");
        ts.add("Delhi");
        ts.add("Noida");

        Iterator it = ts.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
