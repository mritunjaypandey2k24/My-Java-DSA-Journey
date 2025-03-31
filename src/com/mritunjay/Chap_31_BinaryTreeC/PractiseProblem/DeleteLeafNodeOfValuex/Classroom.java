package com.mritunjay.Chap_31_BinaryTreeC.PractiseProblem.DeleteLeafNodeOfValuex;

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






    public static Node deleteX(Node root, int x){

        if(root == null){
            return null;
        }

        root.left = deleteX(root.left,x);
        root.right =deleteX(root.right,x);

        if((root.data == x) && (root.left==null) && (root.right==null)){

            return null;
        }

        return root;


    }

    public static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }








    public static void main(String [] args){
         /*

                    1
                  /   \
                 3     3
                / \
               3   2

        *  */
        Node root = new Node(1);
        root.left = new Node(3);
        root.right = new Node(3);
        root.left.left = new Node(3);
        root.left.right = new Node(2);

        int x =3;
        root = deleteX(root,x);
        preOrder(root);


/*

                    1
                  /   \
                 3
                / \
                   2

        *  */




    }
}
