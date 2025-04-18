package com.mritunjay.Chap_31_BinaryTreeC.PractiseProblem.InvertorMirrorBinaryTree;

public class Classroom {
    static class Node{
        int data;
        Node left;
        Node right;

        public  Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }




    public static void invertTree(Node root){

        if(root == null){
            return;
        }

        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);


    }

    public static void preOrder(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);

    }







    public static void main(String [] args){
         /*

                    1
                  /   \
                 2     3
                / \   / \
               4   5 6   7

        *  */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        invertTree(root);
        preOrder(root);

         /*

                    1
                  /   \
                 3     2
                / \   / \
               7   6 5   4

        *  */





    }
}
