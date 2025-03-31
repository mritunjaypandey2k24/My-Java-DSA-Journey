package com.mritunjay.Chap_36_Trie.InsertInTrie;

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

    public static void insert(String word){  //TC=O(L) L:length of largest word

        Node curr = root;
        for(int level =0; level<word.length(); level++){
            int idx = word.charAt(level) - 'a';

            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }

            curr = curr.children[idx];

        }
        curr.eow = true;
    }

    public static void main(String [] args){
        String [] words = {"the","a","there","their","any","thee"};

        //create trie for words array
        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }
    }
}
