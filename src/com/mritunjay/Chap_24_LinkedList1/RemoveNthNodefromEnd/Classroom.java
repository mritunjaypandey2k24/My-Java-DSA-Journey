package com.mritunjay.LinkedList1.RemoveNthNodefromEnd;

public class Classroom {

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

    public void deleteNthEndNode(int n){
        int sz=0;
        Node temp = head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }
        //sz-n is the prev node
        Node prev = head;
        int i=1;
        int iToFind = sz-n;
        while(i<iToFind){
            prev=prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }




    public static void main(String [] args){
        Classroom ll = new Classroom();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addFirst(6);
        ll.print();
        ll.deleteNthEndNode(3);
        ll.print();




    }


}
