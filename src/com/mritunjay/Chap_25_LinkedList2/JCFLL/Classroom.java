package com.mritunjay.Chap_25_LinkedList2.JCFLL;

import java.util.LinkedList;
public class Classroom {

    public static void main(String [] args){
        //Create a LL

        LinkedList<Integer> ll = new LinkedList<>();

        //add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        System.out.println(ll);
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);

    }
}
