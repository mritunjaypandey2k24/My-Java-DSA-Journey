package com.mritunjay.Chap_26_Stacks.PractiseQuestions.CheckLLisPalindromeUsingStacks;

import java.util.Stack;

public class Classroom {

    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static boolean isPalindrome(Node head){
        Stack<Integer> s = new Stack<>();

        Node temp = head;
        while(temp!=null){
            s.push(temp.data);
            temp = temp.next;
        }

        while(!s.isEmpty()){
            if(s.pop()!= head.data){
                return false;
            }
            head = head.next;
        }

        return true;
    }

    public static void main(String [] args){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        //head.next.next.next = new Node(1);
        if(isPalindrome(head)){
            System.out.println("LL is Palindrome");
        }else{
            System.out.println("LL is not a Palindrome");
        }
    }
}
