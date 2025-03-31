package com.mritunjay.Chap_33_BinarySearchTreeB.PractiseQuestion.bClosestElementinBST;

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

    static class Info{
        Node node;
        int diff;

        Info(Node root, int diff){
            this.node = root;
            this.diff = diff;
        }

    }

    public static Info closestElement(Node root, int K){

        if(root== null){
            return new Info(null,K);
        }

        Info leftInfo = closestElement(root.left,K);
        Info rightInfo = closestElement(root.right,K);

        int diff = Math.abs(root.data-K);

        if(diff< leftInfo.diff && diff<rightInfo.diff){
            return new Info(root,diff);
        }
        else if(leftInfo.diff<rightInfo.diff){
            return leftInfo;
        }
        else {
            return rightInfo;
        }


    }



    public static void main(String [] args){
        Node root = new Node(8);
        root.left =  new Node(5);
        root.right =  new Node(11);
        root.left.left= new Node(3);
        root.right.right = new Node(20);
        root.left.right = new Node(6);

           /*            8
                        /  \
                       5    11
                      / \     \
                     3   6     12

  */

        Info res = closestElement(root,19);

        System.out.println("Closest Node is: "+res.node.data);
        System.out.println("Whose diff is: "+res.diff);




    }
}
