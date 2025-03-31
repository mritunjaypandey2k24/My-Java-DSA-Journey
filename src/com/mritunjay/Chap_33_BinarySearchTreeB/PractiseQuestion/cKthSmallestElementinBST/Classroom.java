package com.mritunjay.Chap_33_BinarySearchTreeB.PractiseQuestion.cKthSmallestElementinBST;

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

    public static void getInorder(Node root, ArrayList<Integer> arr){
        if(root==null){
            return;
        }

        getInorder(root.left,arr);
        arr.add(root.data);
        getInorder(root.right,arr);
    }

    public static int KthSmallestnode(Node root,int K){

        ArrayList<Integer> arr = new ArrayList<>();
        getInorder(root,arr);

        return arr.get(K-1);
    }





    public static void main(String [] args){
        Node root = new Node(8);
        root.left =  new Node(5);
        root.right =  new Node(11);
        root.left.left= new Node(3);
        root.right.right = new Node(20);
        root.left.right = new Node(6);

           /*            8
                        /  \
                       5    11
                      / \     \
                     3   6     12

  */
        System.out.println(KthSmallestnode(root,3));






    }
}
