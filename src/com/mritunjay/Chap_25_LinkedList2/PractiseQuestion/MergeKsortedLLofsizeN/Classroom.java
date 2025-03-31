package com.mritunjay.Chap_25_LinkedList2.PractiseQuestion.MergeKsortedLLofsizeN;

public class Classroom {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node mergedKLL(Node[] arr, int last){
        while(last!=0){
            int i=0,j=last;

            while(i<j){
                arr[i] = sortedMerge(arr[i], arr[j]);
                i++;
                j--;

                if(i>=j){
                    last =j;
                }
            }

        }

        return arr[0];
    }

    public static Node sortedMerge(Node a, Node b){
        // Base case
        if(a==null){
            return b;
        }
        if(b==null){
            return a;
        }
        Node result = null;

        if(a.data<=b.data){
            result = a;
            result.next = sortedMerge(a.next,b);
        }else{
            result = b;
            result.next = sortedMerge(a,b.next);
        }

        return result;

    }


    public static void main(String [] args){
        int k=4; //No of linked list
        Node [] arr = new Node [k];

        arr[0] = new Node(1);
        arr[0].next = new Node(3);
        arr[0].next.next = new Node(5);
        arr[0].next.next.next = new Node(7);

        arr[1] = new Node(2);
        arr[1].next = new Node(4);
        arr[1].next.next = new Node(6);
        arr[1].next.next.next = new Node(8);

        arr[2] = new Node(0);
        arr[2].next = new Node(9);
        arr[2].next.next = new Node(10);
        arr[2].next.next.next = new Node(11);

        arr[3] = new Node(14);
        arr[3].next = new Node(15);
        arr[3].next.next = new Node(16);
        arr[3].next.next.next = new Node(17);

        Node head = mergedKLL(arr,k-1);
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");


    }
}
