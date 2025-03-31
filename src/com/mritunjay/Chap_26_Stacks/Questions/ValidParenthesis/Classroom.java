package com.mritunjay.Chap_26_Stacks.Questions.ValidParenthesis;

import java.util.Stack;

public class Classroom {
    public static boolean isValid(String str){
        Stack<Character> s = new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch=='('||ch=='{'||ch=='['){
                s.push(ch);
            }else{  //matlab closing bracket character ho to
                if(s.isEmpty()){
                    return false;  //matlab stack me koi opening bracket character nahi hai and original string sirf "}])" closing bracket ka hai
                }

                if((s.peek()=='(' && ch==')')||
                        (s.peek()=='{'&& ch=='}')||
                        (s.peek()=='['&& ch==']')){
                    s.pop();
                }else{
                    return false;
                }
            }
        }

        if(s.isEmpty()){
            return true;
        }

        return false;
    }

    public static void main(String [] args){
        String str = "({[]})";
        System.out.println(isValid(str));
    }
}
