package com.mritunjay.Chap_33_BinarySearchTreeB.ConvertBSTtoBalancedBST;

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

    public static void getInorder(Node root, ArrayList<Integer> inorder){
        if(root == null){
            return;
        }
        getInorder(root.left,inorder);
        inorder.add(root.data);
        getInorder(root.right,inorder);
    }
    public static Node balanceBST(Node root){
        //inorder seq
        ArrayList<Integer> inorder = new ArrayList<>();
        getInorder(root,inorder);

        //create inorder sequenced arraylist  to Balanced BST

        root = createBST(inorder,0,inorder.size()-1);

        return root;
    }


    public static Node createBST( ArrayList<Integer> inorder,int si,int ei){
        if(si>ei){
            return null;
        }

        int mid = (si+ei)/2;

        Node root = new Node(inorder.get(mid));

        root.left = createBST(inorder,si,mid-1);
        root.right = createBST(inorder,mid+1,ei);
        return root;
    }


    public static void preOrder(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.data +" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String [] args){
        Node root = new Node(8);
        root.left =  new Node(6);
        root.right =  new Node(10);
        root.left.left= new Node(5);
        root.right.right = new Node(11);
        root.left.left.left = new Node(3);
        root.right.right.right= new Node(12);

           /*           8                             8
                       / \      Balanced BST         /  \
                      6   10      -->               5    11
                     /      \                      / \   / \
                    5        11                   3   6 10  12
                   /           \
                  3             12

  */

        preOrder(root);
        root = balanceBST(root);
        System.out.println();
        preOrder(root);


    }
}
