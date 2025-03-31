package com.mritunjay.Chap_26_Stacks.StackUsingArrayList;

import java.util.ArrayList;

public class Classroom {

    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();

        //To Check if Stack is Empty
        public static boolean isEmpty(){
            return list.size()==0;
        }

        //push -> to add element to the stack
        public static void push(int data){
            list.add(data);
        }

        //pop-> to remove element from the stack
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int val = list.get(list.size()-1);
            list.remove(list.size()-1);
            return val;
        }

        //peek-> to see the element at top of stack
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }

    public static void main(String [] args){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.peek());
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
