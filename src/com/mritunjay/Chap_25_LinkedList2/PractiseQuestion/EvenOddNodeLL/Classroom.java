package com.mritunjay.Chap_25_LinkedList2.PractiseQuestion.EvenOddNodeLL;

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


    public void  evenOdd(){
        if(head==null || head.next==null){
            return;
        }
        Node evenStart =null, evenEnd=null;
        Node oddStart = null, oddEnd = null;
        Node curr =head;

        while(curr!=null){
            if(curr.data%2 ==0){
                if(evenStart==null){
                    evenStart=curr;
                    evenEnd = evenStart;
                }else{
                    evenEnd.next = curr;
                    evenEnd = evenEnd.next;
                }
            }else{
                    if(oddStart==null){
                        oddStart = curr;
                        oddEnd = oddStart;
                    }else{
                        oddEnd.next = curr;
                        oddEnd = oddEnd.next;
                    }
            }

            curr = curr.next;
        }

        if(evenStart==null ||oddStart==null){
            return;
        }

        evenEnd.next = oddStart;
        oddEnd.next = null;
        head = evenStart;
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
        ll.evenOdd();
        ll.print();
    }
}
