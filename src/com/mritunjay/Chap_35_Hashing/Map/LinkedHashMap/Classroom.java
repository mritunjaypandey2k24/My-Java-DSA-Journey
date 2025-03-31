package com.mritunjay.Chap_35_Hashing.Map.LinkedHashMap;

import java.util.LinkedHashMap;

public class Classroom {
    public static void main(String [] args){

        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
        lhm.put("India",100);
        lhm.put("China",150);
        lhm.put("US",50);

        System.out.println(lhm);

    }
}
