package com.mritunjay.Chap_26_Stacks.StackUsingJCF;
import java.util.*;
public class Classroom {

    public static void main(String [] args){
        Stack<Integer> s =  new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.peek());
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }

}
