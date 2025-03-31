package com.mritunjay.Chap_32_BinarySearchTreeA.CheckIfBSTisValid;

import java.util.ArrayList;

public class Classroom {

    static class Node{
        int data;
        Node right;
        Node left;

        Node(int data){
            this.data = data;
        }
    }

    public static Node insert(Node root,int val){
        if(root==null){
            Node newNode = new Node(val);
            root = newNode;
            return root;
        }

        if(root.data<val){
            root.right = insert(root.right,val);
        }
        else{
            root.left  = insert(root.left,val);
        }

        return root;
    }

    public static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }



    public static boolean isValid(Node root,Node min,Node max){
        if(root==null){
            return true;
        }

        if(min!=null && root.data <= min.data){
            return false;
        }

        else if(max!=null && root.data>=max.data){
            return false;
        }

        return isValid(root.left,min,root)&&isValid(root.right,root,max);
    }




    public static void main(String [] args){
//        int [] values = {8,5,3,1,4,6,10,11,14};
//        int [] values = {5,3,4,1,6,7};
        int [] values = {1,1,1,1};
        Node root = null;
        for(int i=0; i<values.length;i++){
            root = insert(root,values[i]);
        }
        inOrder(root);
/*                      8
                       / \
                      5   10
                     / \    \
                    3   6    11
                   / \         \
                  1   4         14
  */
        System.out.println();
        System.out.println();
        if(isValid(root,null,null)){
            System.out.println("Valid BST");
        }else{
            System.out.println("Invalid BST");
        }



    }
}
