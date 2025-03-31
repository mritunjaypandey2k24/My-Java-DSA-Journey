package com.mritunjay.LinkedList1.CheckLLisPalindrome;

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

    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node mid = slow;
        return  mid;
    }

    public boolean checkPalindrome(){

        if(head==null || head.next==null){
            return  true;
        }

        Node mid = findMid(head);

        Node curr= mid;
        Node prev = null;
        Node next;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev  = curr;
            curr= next;
        }

        Node rightHead = prev;
        Node leftHead = head;

        while(rightHead!=null){
            if(rightHead.data != leftHead.data){
                return false;
            }
            rightHead = rightHead.next;
            leftHead= leftHead.next;
        }

        return true;


    }






    public static void main(String [] args){
        Classroom ll = new Classroom();
        ll.addFirst(6);
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addFirst(6);
        ll.print();

        System.out.println(ll.checkPalindrome());





    }


}
