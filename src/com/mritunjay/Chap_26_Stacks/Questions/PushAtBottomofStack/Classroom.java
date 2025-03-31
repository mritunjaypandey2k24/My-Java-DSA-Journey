package com.mritunjay.Chap_26_Stacks.Questions.PushAtBottomofStack;
import java.util.*;
public class Classroom {

    public static void pushAtBottom(Stack<Integer>s, int data){
        //BaseCase
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        //Recursion
        int top = s.pop();
        pushAtBottom(s,data);
        s.push(top);
    }
    public static void main(String [] args){

        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while(!s.isEmpty()){
            System.out.println(s.pop());

        }
        System.out.println("----------------------------");

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        pushAtBottom(s,5);

        System.out.println();

        while(!s.isEmpty()){
            System.out.println(s.pop());

        }
        System.out.println("----------------------------");


    }
}
