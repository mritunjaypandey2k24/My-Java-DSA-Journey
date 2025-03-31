package com.mritunjay.LinkedList1.SearchInLinkedList;

public class RecursiveSearch {//Tc: O(n)  && SC : O(n)

    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }

    }


    public static Node head;
    public static Node tail;
    public static int size;

    //1)AddFirst operation - O(1)
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail= newNode;
            return;
        }
        newNode.next=head;
        head= newNode;
    }
    public void print(){
        if(head==null){
            System.out.println("LinkedList is Empty");
        }
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int recursiveSearch(int key){
        return helper(head,key);
    }

    public int helper(Node head,int key){
        //Base Case
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }

        int idx = helper(head.next,key);

        if(idx==-1){
            return -1;
        }
        return idx+1;
    }


    public static void main(String [] args){
        RecursiveSearch ll = new RecursiveSearch();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addFirst(6);

        ll.print();

        System.out.println(ll.recursiveSearch(5));
    }


}
