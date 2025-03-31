package com.mritunjay.Chap_26_Stacks.Questions.NextGreaterElement;

import java.util.Stack;

public class Classroom {

    //Next Greater Element on Right side using stack

    public static void main(String [] args){
        int [] arr = {6,8,0,1,3};
        Stack<Integer>s = new Stack<>();
        int [] nextGreater = new int [arr.length];

        for(int i=arr.length-1; i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]<= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextGreater[i]=-1;
            }else{
                nextGreater[i] = arr[s.peek()];
            }
            s.push(i);
        }
        for(int i=0; i<nextGreater.length; i++){
            System.out.print(nextGreater[i]+" ");
        }
        System.out.println();

    }

    //Next Greater Element on Left side using stack-> change for loop condition

//    public static void main(String [] args){
//        int [] arr = {6,8,0,1,3};
//        Stack<Integer>s = new Stack<>();
//        int [] nextGreater = new int [arr.length];
//
//        for(int i=0; i<arr.length;i++){
//            while(!s.isEmpty() && arr[s.peek()]<= arr[i]){
//                s.pop();
//            }
//            if(s.isEmpty()){
//                nextGreater[i]=-1;
//            }else{
//                nextGreater[i] = arr[s.peek()];
//            }
//            s.push(i);
//        }
//
//        for(int i=0; i<nextGreater.length; i++){
//            System.out.print(nextGreater[i]+" ");
//        }
//        System.out.println();
//
//    }


    //Next Smallest Element on Right side using stack-> change the while condition from next greater on right

//    public static void main(String [] args){
//        int [] arr = {6,8,0,1,3};
//        Stack<Integer>s = new Stack<>();
//        int [] nextGreater = new int [arr.length];
//
//        for(int i=arr.length-1; i>=0;i--){
//            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
//                s.pop();
//            }
//            if(s.isEmpty()){
//                nextGreater[i]=-1;
//            }else{
//                nextGreater[i] = arr[s.peek()];
//            }
//            s.push(i);
//        }
//
//        for(int i=0; i<nextGreater.length; i++){
//            System.out.print(nextGreater[i]+" ");
//        }
//        System.out.println();
//
//    }


    //Next Smallest Element on left side using stack-> change for loop condition and while condtion

//    public static void main(String [] args){
//        int [] arr = {6,8,0,1,3};
//        Stack<Integer>s = new Stack<>();
//        int [] nextGreater = new int [arr.length];
//
//        for(int i=0;i<arr.length;i++){
//            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
//                s.pop();
//            }
//            if(s.isEmpty()){
//                nextGreater[i]=-1;
//            }else{
//                nextGreater[i] = arr[s.peek()];
//            }
//            s.push(i);
//        }
//
//        for(int i=0; i<nextGreater.length; i++){
//            System.out.print(nextGreater[i]+" ");
//        }
//        System.out.println();
//
//    }





}
