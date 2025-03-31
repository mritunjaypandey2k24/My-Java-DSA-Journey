package com.mritunjay.Chap_25_LinkedList2.MergeSortLL;

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

    private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast!= null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;

    }

    public Node mergeSort(Node head){
        if(head==null|| head.next==null){
            return head;
        }

        //1 find the midNode
        Node mid = getMid(head);

        //2  left and right MS
        Node righthead = mid.next;
        mid.next = null;
        Node newleft = mergeSort(head);
        Node newright = mergeSort(righthead);

        //3 merge
        return merge(newleft, newright);


    }

    private Node merge(Node head1, Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while(head1!=null & head2!=null){
            if(head1.data<=head2.data){
                temp.next = head1;
                temp = temp.next;
                head1 = head1.next;
            }else{
                temp.next = head2;
                temp = temp.next;
                head2 = head2.next;
            }
        }

        while(head1 !=null){
            temp.next = head1;
            temp=temp.next;
            head1=head1.next;
        }

        while(head2 != null){
            temp.next = head2;
            temp = temp.next;
            head2 = head2.next;
        }

        return mergedLL.next;
    }




    public static void main(String [] args){
        Classroom ll = new Classroom();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addFirst(6);
        ll.addFirst(7);
        ll.addFirst(18);
        ll.print();
        head = ll.mergeSort(head);
        ll.print();
    }
}
