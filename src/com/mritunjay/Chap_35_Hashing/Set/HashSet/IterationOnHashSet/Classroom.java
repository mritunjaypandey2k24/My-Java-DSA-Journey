package com.mritunjay.Chap_35_Hashing.Set.HashSet.IterationOnHashSet;
import java.util.*;
public class Classroom {

    public static void main(String [] args){
        HashSet<String> cities = new HashSet<>();


        cities.add("Mumbai");
        cities.add("Pune");
        cities.add("Delhi");
        cities.add("Noida");


        //Using iterators

        Iterator it = cities.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("-----------------------------");

        //Using for-each or enhanced for loop

        for(String city: cities){
            System.out.println(city);
        }


    }

}
