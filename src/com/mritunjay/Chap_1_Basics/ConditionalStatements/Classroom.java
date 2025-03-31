package com.mritunjay.Chap_1_Basics.ConditionalStatements;

public class Classroom{
    public static void main(String [] args){

        int a =10;
        int b= 20;

        //If- else if and else

        if(a>b){
            System.out.println(a);
        }
        else if(a<b){
            System.out.println(b);
        }
        else{
            System.out.println("Both equal");
        }

        //ternary Operator

        System.out.println(a>b?a:b);
    }
}