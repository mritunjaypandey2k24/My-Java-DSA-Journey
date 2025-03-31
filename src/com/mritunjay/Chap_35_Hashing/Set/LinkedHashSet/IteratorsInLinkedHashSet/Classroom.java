package com.mritunjay.Chap_35_Hashing.Set.LinkedHashSet.IteratorsInLinkedHashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Iterator;

public class Classroom {

    public static void main(String [] args){

        //LinkedHashSet

        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        lhs.add("Mumbai");
        lhs.add("Pune");
        lhs.add("Delhi");
        lhs.add("Noida");

        Iterator it = lhs.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("-----------------------------");

        //Using for-each or enhanced for loop

        for(String city: lhs){
            System.out.println(city);
        }


    }
}
