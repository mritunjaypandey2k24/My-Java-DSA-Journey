package com.mritunjay.Chap_33_BinarySearchTreeB.PractiseQuestion.dTwoSumInTwoBSTs;

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
        if(root==null){
            return;
        }

        getInorder(root.left,arr);
        arr.add(root.data);
        getInorder(root.right,arr);
    }

    public static int countPairs(ArrayList<Integer>arr1, ArrayList<Integer>arr2,int x){

        int i=0, j=arr2.size()-1;
        int count = 0;
        while(i<arr1.size() && j>=0){
            if(arr1.get(i)+arr2.get(j)==x){
                count++;
                j--;
                i++;
            }
            else if(arr1.get(i)+ arr2.get(j)<x){
                i++;
            }else{
                j--;
            }
        }

        return count;
    }

    public static int findpairs(Node root1,Node root2,int x){

        ArrayList<Integer> arr1 = new ArrayList<>();
        getInorder(root1,arr1);
        ArrayList<Integer> arr2 = new ArrayList<>();
        getInorder(root2,arr2);

        return countPairs(arr1,arr2,x);




    }





    public static void main(String [] args){
        Node root = new Node(5);
        root.left =  new Node(3);
        root.right =  new Node(7);
        root.left.left= new Node(2);
        root.left.right = new Node(4);
        root.right.left = new Node(6);
        root.right.right = new Node(8);

        Node root2 = new Node(10);
        root2.left =  new Node(6);
        root2.right =  new Node(15);
        root2.left.left= new Node(3);
        root2.left.right = new Node(8);
        root2.right.left = new Node(11);
        root2.right.right = new Node(18);

           /*            8
                        /  \
                       5    11
                      / \     \
                     3   6     12

  */
        System.out.println(findpairs(root,root2,16));






    }
}
