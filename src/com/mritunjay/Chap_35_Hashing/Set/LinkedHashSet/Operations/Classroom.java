package com.mritunjay.Chap_35_Hashing.Set.LinkedHashSet.Operations;

import java.util.*;

public class Classroom {

    public static void main(String [] args){

        //HashSet
        HashSet<String> cities = new HashSet<>();
        cities.add("Mumbai");
        cities.add("Pune");
        cities.add("Delhi");
        cities.add("Noida");

        System.out.println(cities);

        //LinkedHashSet

        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        lhs.add("Mumbai");
        lhs.add("Pune");
        lhs.add("Delhi");
        lhs.add("Noida");

        System.out.println(lhs);
    }

}
