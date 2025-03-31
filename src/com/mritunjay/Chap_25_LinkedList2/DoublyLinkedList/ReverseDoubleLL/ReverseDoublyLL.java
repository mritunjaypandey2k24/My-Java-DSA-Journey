package com.mritunjay.Chap_25_LinkedList2.DoublyLinkedList.ReverseDoubleLL;


public class ReverseDoublyLL {

    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //addFirst
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail= newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;

    }

    //addLast
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;

        if(head==null){
            head=tail=newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }



    //print()
    public void print(){
        if(head==null){
            System.out.println("DLL is empty");
            return;
        }

        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void reverse(){
       Node  curr = head;
       Node prev = null;
       Node next;

       while(curr != null){
           next = curr.next;
           curr.next = prev;
           curr.prev = next;
           prev = curr;
           curr = next;
       }

       head = prev;
    }

    public static void main(String [] args){
        ReverseDoublyLL  dll = new ReverseDoublyLL();
        dll.addLast(1);
        dll.addLast(2);
        dll.addLast(3);
        dll.addLast(4);
        dll.addLast(5);
        dll.addLast(6);
        dll.addLast(7);
        dll.print();
        dll.reverse();
        dll.print();
    }
}
