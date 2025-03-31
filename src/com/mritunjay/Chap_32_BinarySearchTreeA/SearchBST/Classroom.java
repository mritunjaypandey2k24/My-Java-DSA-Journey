package com.mritunjay.Chap_32_BinarySearchTreeA.SearchBST;

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

    public static boolean search(Node root, int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        if(root.data>key){
            return search(root.left,key);
        }
        else{
            return search(root.right,key);
        }

    }
    public static void main(String [] args){
        int [] values = {5,1,3,4,2,7};
        Node root = null;
        for(int i=0; i<values.length;i++){
            root = insert(root,values[i]);
        }
        if(search(root,8)){
            System.out.println("Key found");
        }else{
            System.out.println("Key not found");
        }
    }
}
