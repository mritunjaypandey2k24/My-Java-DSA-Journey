package com.mritunjay.Chap_29_BinaryTreeA.DiamerterApproach1InBinaryTree;

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

    public static int height(Node root){
        if(root == null){
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);
        int height = Math.max(lh,rh)+1;
        return height;
    }


    public static int diameter(Node root){
        if(root == null){
            return 0;
        }

        int ldiam = diameter(root.left);
        int rdiam = diameter(root.right);
        int lh = height(root.left);
        int rh = height(root.right);
        int selfdiam = lh+rh+1;

        return Math.max(selfdiam, Math.max(ldiam, rdiam));
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

        System.out.println(diameter(root));
    }
}
