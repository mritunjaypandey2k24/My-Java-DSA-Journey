package com.mritunjay.Chap_26_Stacks.PractiseQuestions.SimplifyDirectoryPath;

import java.util.Stack;

public class Classroom {

    public static String simplifyPath(String str){
        Stack<String> s = new Stack<>();
        int len = str.length();
        String res ="";
        res+= "/"; //root directory

        for(int i=0; i<len;i++){
            String dir ="";


            while(i<len && str.charAt(i)=='/'){
                i++;
            }

            while(i<len && str.charAt(i) !='/'){
                dir += str.charAt(i);
                i++;
            }

            //Handle different case (. ..)
            if(dir.equals("..")){
                if(!s.isEmpty()){
                    s.pop();
                }
            }else if(dir.equals(".")){
                continue;
            }else if(dir.length()!=0){
                s.push(dir);
            }
        }

        //reverse the stack toget correct path order
        Stack<String> s2 = new Stack<>();
        while(!s.isEmpty()){
            s2.push(s.pop());
        }

        //construct the path
        while(!s2.isEmpty()){
            if(s2.size()!=1){
                res += (s2.pop() +"/");
            } else{
                res  += s2.pop();
            }
        }

        return  res;
    }

    public static void main(String [] args){
        String st = "/a/./b/../../c/";
        String simplestr =simplifyPath(st);
        System.out.println(simplestr);
    }
}
