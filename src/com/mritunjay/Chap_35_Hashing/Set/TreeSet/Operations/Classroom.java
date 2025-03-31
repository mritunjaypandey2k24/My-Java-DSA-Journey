package com.mritunjay.Chap_35_Hashing.Set.TreeSet.Operations;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Classroom {

    public static void main(String [] args){

        //HashSet
        HashSet<String> cities = new HashSet<>();
        cities.add("Mumbai");
        cities.add("Pune");
        cities.add("Delhi");
        cities.add("Noida");

        System.out.println("Using HashSet: "+cities);

        //LinkedHashSet

        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        lhs.add("Mumbai");
        lhs.add("Pune");
        lhs.add("Delhi");
        lhs.add("Noida");

        System.out.println("Using LinkedHashSet: "+lhs);

        //Using TreeSet
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Mumbai");
        ts.add("Pune");
        ts.add("Delhi");
        ts.add("Noida");

        System.out.println("Using TreeSet: " +ts);
    }
}
