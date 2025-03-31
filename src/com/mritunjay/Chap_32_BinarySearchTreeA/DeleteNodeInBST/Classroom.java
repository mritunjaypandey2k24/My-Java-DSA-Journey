package com.mritunjay.Chap_32_BinarySearchTreeA.DeleteNodeInBST;

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



    public static Node delete(Node root,int val){

        if(root.data<val){
            root.right = delete(root.right,val);
        }else if(root.data>val){
            root.left = delete(root.left,val);
        }else{//Node=val found

            //case1 leaf node
            if(root.left==null && root.right==null){
                return null;
            }
            //case2 single child
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            //case 3: both children
            Node IS = findInOrderSuccesor(root.right);
            root.data = IS.data;
            root.right = delete(root.right,IS.data);

        }
        return root;
    }
    public static Node findInOrderSuccesor(Node root){
        while(root.left!=null){
            root = root.left;
        }
        return root;
    }
    public static void main(String [] args){
        int [] values = {8,5,3,1,4,6,10,11,14};
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

        delete(root,5);
        System.out.println();
        inOrder(root);
    }
}
