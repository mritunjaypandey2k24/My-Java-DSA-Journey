package com.mritunjay.Chap_33_BinarySearchTreeB.PractiseQuestion.aRangeSumofBST;

import java.util.ArrayList;

public class Classroom {

    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right= null;
        }
    }

    public static int rangeSum(Node root, int L,int R){

        if(root == null){
            return 0;
        }

        int leftsum = rangeSum(root.left,L,R);
        int sum = (root.data>=L && root.data<=R)? root.data:0;
        int rightsum = rangeSum(root.right,L,R);

        return leftsum+sum+rightsum;

    }



    public static void main(String [] args){
        Node root = new Node(8);
        root.left =  new Node(5);
        root.right =  new Node(11);
        root.left.left= new Node(3);
        root.right.right = new Node(12);
        root.left.right = new Node(6);

           /*            8
                        /  \
                       5    11
                      / \     \
                     3   6     12

  */

        System.out.println(rangeSum(root,5,6));



    }
}
