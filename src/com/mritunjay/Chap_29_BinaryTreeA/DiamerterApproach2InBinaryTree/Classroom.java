package com.mritunjay.Chap_29_BinaryTreeA.DiamerterApproach2InBinaryTree;

public class Classroom {

    public static class Node{
        int data;
        Node left,right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Info{
        int diam;
        int ht;

        public Info(int d, int h){
            diam = d;
            ht = h;
        }
    }

    public static Info diameter(Node root ){

        if(root==null){
            return new Info(0,0);
        }

        Info leftInfo = diameter(root.left);
        Info rightInfo =  diameter(root.right);

        int diam = Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo.ht+rightInfo.ht+1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht)+1;

        return new Info(diam,ht);

    }




    public static void main(String [] args){

        /*

                    1
                  /  \
                 2    3
                / \    \
               4   5    6
              /
             7
            /
           8
        *  */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        root.left.left.left = new Node(7);
        root.left.left.left.left = new Node(8);

        System.out.println(diameter(root).diam);
        System.out.println(diameter(root).ht);
    }
}
