package com.mritunjay.Chap_36_Trie.HomeworkProblem.GroupAnagramsTogether.HashMap;

import java.util.*;
public class Classroom {


    public static List<List<String>> groupAnagrams(String [] strs){
        HashMap<String,List<String>> map = new HashMap<>();

        for(String str : strs){ //OIterate on each string from array
            char [] chars = str.toCharArray(); //convert each string to array
            Arrays.sort(chars); //Sort the array

            String sortedChar = new String(chars); //make sorted string of original string

            map.putIfAbsent(sortedChar, new ArrayList<>());  //Add the sorted string in map
            map.get(sortedChar).add(str);

        }

        return  new ArrayList<>(map.values());
    }
    public static void main(String [] args){

        String [] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }


}
