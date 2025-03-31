package com.mritunjay.Chap_31_BinaryTreeC.LowestCoomonAncestorApproach2;

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



    public static Node lca2(Node root, int n1, int n2){
        if(root ==null || root.data==n1 || root.data==n2){
            return root;
        }

        Node leftlca = lca2(root.left,n1,n2);
        Node rightlca = lca2(root.right,n1,n2);

        //rightlca not null but leftlca is null
        if(leftlca==null){
            return rightlca;
        }
        //leftlca not null but rightlca  is null
        if(rightlca==null){
            return leftlca;
        }
        //if both not null
        return root;

    }



    public static void main(String [] args){
         /*

                    1
                  /   \
                 2     3
                / \   / \
               4   5  6  7

        *  */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int n1=4, n2=6;
        System.out.println(lca2(root,n1,n2).data);





    }
}
