package com.mritunjay.Chap_1_Basics.Input;
import java.util.*;
public class Classroom {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        String input = sc.next();//only capture till next space in input
        System.out.println(input);
        sc.nextLine();

        String ip = sc.nextLine(); //capture entire line
        System.out.println(ip);

        //llrly for nextByte(), nextDouble,nextShort, nextLong

        //Sum of a and b by taking inputs

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a+b);

    }
}