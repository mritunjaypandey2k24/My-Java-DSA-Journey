package com.mritunjay.Chap_35_Hashing.PractiseQuestions.BottomViewOfBinaryTree;

import java.util.*;
import java.util.LinkedList;

public class Classroom {

    static class Node{
        int value;
        int hd;
        Node left;
        Node right;

        public Node(int value){
            this.value =value;
            this.left = this.right = null;
        }
    }

    public static ArrayList<Integer> bottomViewBT(Node root){
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null){
            return ans;
        }

        TreeMap<Integer,Integer> map = new TreeMap<>();

        root.hd = 0;
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            Node temp = q.remove();
            int hd = temp.hd;
            map.put(hd,temp.value);

            if(temp.left != null){
                temp.left.hd = hd-1;
                q.add(temp.left);
            }
            if(temp.right != null){
                temp.right.hd = hd+1;
                q.add(temp.right);
            }


        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            ans.add(entry.getValue());
        }

        return ans;



    }

    public static void main(String [] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(8);
        root.left.right.right = new Node(9);
        root.right.left = new Node(6);
        root.right.right = new Node(7);


//                    1
//                   / \
//                  2   3
//                 / \ / \
//                4  5 6  7
//                   /\
//                  8  9

        ArrayList<Integer> BottomView = bottomViewBT(root);

        for(Integer node : BottomView){
            System.out.print(node +" ");
        }


    }
}
