package com.mritunjay.Chap_24_LinkedList1.OperationsInLinkedList;

public class LinkedList {

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

    //2)AddLast operation- O(1)

    public  void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    //3)Print a LinkedList - O(n)

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

    //4) Add in Middle
    public  void add(int idx, int data){
        if(head==null){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        int i=0;
        Node temp = head;
        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next =  newNode;

    }

    //Remove in a LinkedList

    //1) removeFirst

    public int removeFirst(){
        if(head==null){
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val = head.data;
            head=tail=null;
            size--;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    //2) removeLast
    public int removeLast(){
        if(head==null){
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val = head.data;
            head=tail=null;
            size--;
            return val;
        }

        Node prev = head;
        int i=0;

        while(i<size-2){
            prev = prev.next;
            i++;
        }

        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public static void main(String [] args){
        LinkedList ll = new LinkedList();
        //addFirst
        ll.addFirst(1);
        ll.addFirst(2);
        //addLast
        ll.addLast(3);
        ll.addLast(4);
        //print
        ll.print();
        //add(index,data)
        ll.add(2,9);
        ll.print();
        //size
        System.out.println(ll.size);
        //removeFirst()
        ll.removeFirst();
        ll.print();
        //removeLast
        ll.removeLast();
        ll.print();
    }
}
