package com.mritunjay.Chap_33_BinarySearchTreeB.PractiseQuestion.eMaximumSumBSTinBinaryTree;

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
        boolean isBST;
        int sum;
        int min;
        int max;

        public Info(boolean isBST, int sum, int min, int max){
            this.isBST = isBST;
            this.sum = sum;
            this.min = min;
            this.max = max;
        }
    }

    public static int maxSum=0;


    public static Info largestBST(Node root){
        //Base case
        if(root == null){
            return new Info(true,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
        }

        Info leftInfo = largestBST(root.left);
        Info rightInfo = largestBST(root.right);

        int min = Math.min(root.data, Math.min(leftInfo.min,rightInfo.min));
        int max = Math.max(root.data,Math.max(leftInfo.max,rightInfo.max));



        boolean isCurrentBST = leftInfo.isBST && rightInfo.isBST &&( leftInfo.max< root.data) && (root.data<rightInfo.min);

        int currsum=0;
        if(isCurrentBST){
            currsum = root.data + leftInfo.sum+ rightInfo.sum;
            maxSum = Math.max(maxSum,currsum);
        }

        return new Info(isCurrentBST,currsum,min,max);


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
        Node root = new Node(5);
        root.left =  new Node(9);
        root.right =  new Node(2);
        root.left.left= new Node(6);
        root.right.right = new Node(3);
        root.left.left.right = new Node(7);
        root.left.left.left = new Node(8);

           /*           5
                       / \
                      9   2
                     /     \
                    6       3
                   / \
                  8   7
  */
        largestBST(root);
        System.out.println(maxSum);






    }
}
