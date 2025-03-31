package com.mritunjay.Chap_25_LinkedList2.PractiseQuestion.SwappingNodeinLL;

public class Classroom {
    static class Node{
        int data;
       Classroom.Node next;

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
            head=tail= newNode;
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

    public void swapNode(int x, int y){
        if(x==y){
            return;
        }

        Node prevX =null;
        Node currX = head;
        while(currX!=null && currX.data !=x){
            prevX = currX;
            currX = currX.next;
        }

        Node prevY=null;
        Node currY=head;
        while(currY != null && currY.data != y){
            prevY = currY;
            currY = currY.next;
        }

        if(currX==null || currY==null){
            return;
        }

        if(prevX!=null){
            prevX.next = currY;
        }else{
            head = currY;
        }
        if(prevY!=null){
            prevY.next = currX;
        }else{
            head = currX;
        }

        //swap
        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;

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
        ll.swapNode(2,4);
        ll.print();
    }
}
