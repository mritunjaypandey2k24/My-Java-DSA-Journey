package com.mritunjay.Chap_25_LinkedList2.LLisCyclic;

public class RemoveLoopCycleInLL {

    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }

    }

    public static boolean isCyclic(Node head){
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast ){
                return true;
            }

        }
        return false;
    }

    public static void removeCycle(Node head){
        Node slow = head;
        Node fast = head;
        boolean isCycle = false;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow==fast){
                isCycle = true;
                break;
            }
        }

        if(!isCycle){
            return;
        }

        slow = head;
        Node prev = fast ;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            prev =fast;
            fast = fast.next;

            if(slow == fast){
                break;
            }

        }

        prev.next = null;
    }

    public static void main(String [] args){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        Node temp = new Node(5);
        head.next.next.next.next = temp;
        temp.next = head.next.next;
        //1->2->3->4->5->3

        System.out.println(isCyclic(head));
        removeCycle(head);
        System.out.println(isCyclic(head));

    }
}
