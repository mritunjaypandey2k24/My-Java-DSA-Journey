package com.mritunjay.Chap_26_Stacks.Questions.ReverseaStack;

import java.util.Stack;

public class Classroom {

    public static void pushAtBottom(Stack<Integer> s , int data){

        //Basecase
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        //Recursion or kaam
        int top = s.pop();
        pushAtBottom(s,data);
        s.push(top);
    }

    public static void reverseStack(Stack<Integer>s){

        //BaseCase
        if(s.isEmpty()){
            return;
        }
        //Recursion or kaam
        int top=s.pop();
        reverseStack(s);
        pushAtBottom(s,top);
    }

    public static void main(String [] args){
        Stack<Integer> s = new Stack<> ();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
        System.out.println("-------------------------------------------");
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        reverseStack(s);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
        System.out.println("-------------------------------------------");
    }
}
