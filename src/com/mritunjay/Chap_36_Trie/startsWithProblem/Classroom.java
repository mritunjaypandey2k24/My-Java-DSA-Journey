package com.mritunjay.Chap_36_Trie.startsWithProblem;

public class Classroom {

    static class Node {
        Node[] children = new Node[26];
        boolean eow = false; //end of word

        Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static boolean search(String key){
        Node curr = root;
        for(int level =0; level<key.length(); level++){
            int idx = key.charAt(level) - 'a';

            if(curr.children[idx] == null){
                return false;
            }

            curr = curr.children[idx];

        }
        return curr.eow == true;
    }

    public static void insert(String word){  //TC=O(L) L:length of largest word

        Node curr = root;
        for(int level =0; level<word.length(); level++){
            int idx = word.charAt(level) - 'a';

            if(curr.children[idx] == null){
                curr.children[idx] = new Classroom.Node();
            }

            curr = curr.children[idx];

        }
        curr.eow = true;
    }

    public static boolean startsWith(String prefix){

        Node curr = root;

        for(int i=0; i<prefix.length(); i++){
            int idx = prefix.charAt(i)-'a';

            if(curr.children[idx]== null){
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    public static void main(String [] args){
        String [] words = {"apple","app","mango","man","woman"};

        //create trie for words array
        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }

        System.out.println(startsWith("man"));
        System.out.println(startsWith("mang"));


        System.out.println(search("appl"));


        System.out.println(startsWith("wom"));
    }
}
