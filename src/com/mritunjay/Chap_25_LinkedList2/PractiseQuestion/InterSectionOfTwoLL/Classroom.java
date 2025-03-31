package com.mritunjay.Chap_25_LinkedList2.PractiseQuestion.InterSectionOfTwoLL;

public class Classroom {

    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node getIntersetion(Node head1, Node head2){
        while(head2 !=null){
            Node temp = head1;
            while(temp!=null){
                if(temp == head2){
                    return head2;
                }

                temp = temp.next;
            }

            head2 = head2.next;
        }

        return null;
    }

    public static void main(String [] args){
        Node head1,head2;
        head1 = new Node(10);
        head2 = new Node(3);
        Node newNode = new Node(6);
        head2.next = newNode;
        newNode = new Node(9);
        head2.next.next = newNode;
        newNode = new Node(15);
        head2.next.next.next = newNode;
        head1.next = newNode;
        newNode = new Node(30);
        head1.next.next =newNode;
        head1.next.next.next = null;

        Classroom list = new Classroom();

        Node Intersetionpoint = getIntersetion(head1,head2);
        if(Intersetionpoint !=null){
            System.out.println("Intersection Point = "+Intersetionpoint.data);
        }else{
            System.out.println("No Intersection Point");
        }



    }
}
