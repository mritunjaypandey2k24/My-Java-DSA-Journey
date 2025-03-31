package com.mritunjay.Chap_36_Trie.LongestSubstring;

public class Classroom {

    static class Node{

        Node [] children = new Node[26];
        boolean eow = false;


        public Node(){
            for(int i=0; i<26; i++){
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word){

        Node curr = root;

        for(int i=0; i<word.length(); i++){
            int idx = word.charAt(i)-'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }

            curr = curr.children[idx];
        }

        curr.eow = true;
    }

    public static boolean search(String key){
        Node curr = root;

        for(int level =0; level<key.length(); level++){
            int index = key.charAt(level) -'a';
            if(curr.children[index]==null){
                return false;
            }
            curr = curr.children[index];
        }

        return curr.eow == true;
    }


    public static String ans = "";

    public static void longestWord(Node root, StringBuilder temp){
        if(root == null){
            return;
        }

        for(int i=0; i<26; i++){
            if(root.children[i] != null && root.children[i].eow == true){
                char ch = (char)(i +'a');
                temp.append(ch);
                if(temp.length() > ans.length()){
                    ans = temp.toString();
                }

                longestWord(root.children[i],temp);

                temp.deleteCharAt(temp.length()-1); //BackTracking
            }
        }
    }


    public static void main(String args[]){

        String [] word = {"a","ap","app","appl","apple","apply","banana"};

        for(int i=0; i<word.length; i++){
            insert(word[i]);
        }


        longestWord(root, new StringBuilder(""));
        System.out.println(ans);


    }
}
