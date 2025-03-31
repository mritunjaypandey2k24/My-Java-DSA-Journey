package com.mritunjay.Chap_36_Trie.CreatingTrie;

public class Classroom {

    static class Node{
        Node children[] = new Node[26];
        boolean eow = false; //End of word-eow

        Node(){
            for(int i=0; i<26; i++){
                children[i] = null;
            }
        }

        public Node root = new Node();
    }
}
