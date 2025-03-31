package com.mritunjay.Chap_33_BinarySearchTreeB.Merge2BST;

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
        if(root == null){
            return;
        }

        getInorder(root.left,arr);
        arr.add(root.data);
        getInorder(root.right,arr);

    }

    public static Node createBST(ArrayList<Integer> arr, int si,int ei){
        if(si>ei){
            return null;
        }

        int mid = (si+ei)/2;

        Node root = new Node(arr.get(mid));
        root.left = createBST(arr,si,mid-1);
        root.right = createBST(arr,mid+1,ei);
        return root;
    }

    public static Node mergeBSts(Node root1, Node root2){

        //Step1 create inorder seq for both bst
        ArrayList<Integer> arr1 = new ArrayList<>();
        getInorder(root1,arr1);

        ArrayList<Integer> arr2 = new ArrayList<>();
        getInorder(root2,arr2);

        //Step 2 merge both bst's
        ArrayList<Integer> finalarr = new ArrayList<>();
        int i=0, j=0;

        while(i<arr1.size()&& j<arr2.size()){
            if(arr1.get(i)<= arr2.get(j)){
                finalarr.add(arr1.get(i));
                i++;
            }else{
                finalarr.add(arr2.get(j));
                j++;
            }
        }
        while(i<arr1.size()){
            finalarr.add(arr1.get(i));
            i++;
        }

        while(j<arr2.size()){
            finalarr.add(arr2.get(j));
            j++;
        }

        return createBST(finalarr,0,finalarr.size()-1);

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
        Node root1 = new Node(2);
        root1.left =  new Node(1);
        root1.right =  new Node(4);

        Node root2 = new Node(9);
        root2.left =  new Node(3);
        root2.right =  new Node(12);


           /*

                        1
                       / \
                      2   4
                      BST1

                        9
                       / \
                      3  12
                      BST2
  */
        Node root = mergeBSts(root1,root2);
        inorder(root);






    }
}
