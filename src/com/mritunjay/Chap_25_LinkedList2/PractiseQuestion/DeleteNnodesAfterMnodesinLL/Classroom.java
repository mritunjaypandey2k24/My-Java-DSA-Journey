package com.mritunjay.Chap_25_LinkedList2.PractiseQuestion.DeleteNnodesAfterMnodesinLL;


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

    public void deleteNnodes(int m, int n){
        Node temp1 = head;

        while(temp1!=null){
            int i=0;
            while(i<m-1){
                temp1 = temp1.next;
                i++;
            }

            if(temp1.next == null ){
                return;
            }

            Node temp2 = temp1.next;

            int j=0;
            while(j<n){
                temp2 = temp2.next;
                j++;
            }
            temp1.next=temp2;
            temp1 = temp2;
        }
    }


    public static void main(String [] args){
        Classroom ll = new Classroom();
        ll.addFirst(8);
        ll.addFirst(7);
        ll.addFirst(6);
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        ll.deleteNnodes(2,2);
        ll.print();
    }
}
