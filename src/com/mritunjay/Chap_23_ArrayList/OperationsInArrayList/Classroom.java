package com.mritunjay.ArrayList.OperationsInArrayList;
import java.util.ArrayList;
public class Classroom{
    public static void main(String [] args){

        //Create an ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        //add operation TC-O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        //get operation TC-O(1)
        int element = list.get(2);
        System.out.println(element);
        //remove TC-O(n)
        list.remove(2);
        System.out.println(list);
        //Set element at Index TC-O(n)
        list.set(2,10);
        System.out.println(list);
        //Check AL contain an element
        System.out.println(list.contains(10));
        //Add at a specific index
        list.add(0,5);
        System.out.println(list);
        //Size of Arraylist
        System.out.println(list.size());







    }
}