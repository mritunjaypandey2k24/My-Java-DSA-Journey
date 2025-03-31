package com.mritunjay.Chap_36_Trie.HomeworkProblem.LongestWordInDictionary;

public class Classroom {

    static class Node{
        char data;
        String word; // to store the word at end node
        Node [] children;
        boolean isEnd;

        public Node(char data){
            this.data = data;
            this.word = null;
            this.isEnd = false;
            children = new Node [26];

        }
    }

    public static Node root = new Node('/');
    public static String ans = "";

    public static void insert(String word){

        Node curr = root;

        for(int i=0; i<word.length(); i++){
            int index = word.charAt(i)-'a';

            if(curr.children[index] == null){
                curr.children[index] = new Node(word.charAt(i));
            }
            curr = curr.children[index];
        }
        curr.isEnd = true;
        curr.word = word;  //storing the original word at last node
    }

    public static void dfs(Node node){
        if (node == null){
            return;
        }

        if(node.word!= null){
            if((node.word.length() > ans.length()) || (node.word.length()== ans.length() && node.word.compareTo(ans)<0)){
                ans = node.word;
            }
        }

        for(Node child: node.children){
            if(child != null && child.word != null){
                dfs(child);
            }
        }
    }

    public static String longestWord(String [] words){

        for(String word: words){
            insert(word);
        }

        dfs(root);

        return ans;
    }

    public static void main(String [] args){
//        String [] word = {"w","wo","wor","worl","world"};
//        System.out.println(longestWord(word));

        String [] word2 = {"a","ap","app","appl","apple","apply","banana"};
        System.out.println(longestWord(word2));
    }


}
