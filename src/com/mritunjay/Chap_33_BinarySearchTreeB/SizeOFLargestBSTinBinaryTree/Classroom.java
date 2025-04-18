package com.mritunjay.Chap_33_BinarySearchTreeB.SizeOFLargestBSTinBinaryTree;

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

    static class Info{
        boolean isBST;
        int size;
        int min;
        int max;

        public Info(boolean isBST, int size, int min, int max){
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }

    public static int maxBSTSize=0;
    public static Node maxBST;

    public static Info largestBST(Node root){
        //Base case
        if(root == null){
            return new Info(true,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
        }

        Info leftInfo = largestBST(root.left);
        Info rightInfo = largestBST(root.right);

        int min = Math.min(root.data, Math.min(leftInfo.min,rightInfo.min));
        int max = Math.max(root.data,Math.max(leftInfo.max,rightInfo.max));

        int size = 1+ leftInfo.size + rightInfo.size;

        if(root.data<=leftInfo.max || root.data>=rightInfo.min){
            return new Info(false,size,min,max);
        }
        if(leftInfo.isBST && rightInfo.isBST){
            maxBSTSize = Math.max(maxBSTSize,size);
            maxBST = root;
            return new Info(true,size,min,max);
        }

        return new Info(false,size,min,max);


    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }





    public static void main(String [] args){
        Node root = new Node(50);
        root.left =  new Node(30);
        root.right =  new Node(60);
        root.left.left= new Node(5);
        root.left.right= new Node(20);
        root.right.right = new Node(70);
        root.right.left = new Node(45);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);

           /*           50
                       /  \
                      30   60
                     / \   / \
                    5  20 45  70
                              / \
                             65  80

  */

        inorder(root);
        Info res = largestBST(root);
        System.out.println();
        System.out.println(maxBSTSize);
        inorder(maxBST);




    }
}
