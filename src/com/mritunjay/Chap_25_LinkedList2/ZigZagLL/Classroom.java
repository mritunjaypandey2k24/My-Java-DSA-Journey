package com.mritunjay.Chap_25_LinkedList2.ZigZagLL;

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



    public void zigZag(){

        //Step1 find mid
        Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node mid = slow;

        //Reverse 2nd half

        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        //Step 3 alternate merge - zigzag merge

        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        while(left!=null && right!=null){
            nextL=left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            //update;
            right = nextR;
            left = nextL;
        }





    }




    public static void main(String [] args){
        Classroom ll = new Classroom();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(7);
        ll.addLast(8);
        ll.addLast(9);
        ll.print();
        ll.zigZag();
        ll.print();
    }
}
