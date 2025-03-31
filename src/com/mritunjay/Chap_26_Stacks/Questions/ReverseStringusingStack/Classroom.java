package com.mritunjay.Chap_26_Stacks.Questions.ReverseStringusingStack;
import java.util.*;
public class Classroom {

    public static String reverseString(String s){
        Stack<Character> st = new Stack<> ();
        StringBuilder sb = new StringBuilder("");
        int i=0;
        while(i<s.length()){
            st.push(s.charAt(i));
            i++;
        }

        while(!st.isEmpty()){
            sb.append(st.pop());
        }

        return sb.toString();
    }
    public static void main(String [] args){
        String str = "Mritunjay";
        System.out.println("Reverse is "+reverseString(str));
    }
}
