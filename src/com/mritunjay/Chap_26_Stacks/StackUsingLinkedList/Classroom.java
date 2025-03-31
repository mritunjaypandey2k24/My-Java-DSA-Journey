package com.mritunjay.Chap_26_Stacks.StackUsingLinkedList;

public class Classroom {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Stack{
        static Node head = null;

        //check if stack is Empty
        public static boolean isEmpty(){
            return head==null;
        }

        //push element in the stack
        public static void push(int data){
            Node newNode = new Node(data);
            if(head==null){
                head = newNode;
                return;
            }
            newNode.next =head;
            head = newNode;
        }

        //pop element from the stack
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int val = head.data;
            head = head.next;
            return val;
        }

        //peek the element from stack
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
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
