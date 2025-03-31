package com.mritunjay.Chap_36_Trie.HomeworkProblem.GroupAnagramsTogether.Tries;
import java.util.*;
public class Classroom {

    static class TrieNode{

        TrieNode [] children;
        boolean isEnd;
        List<String> data;

        public TrieNode(){
            children = new TrieNode[26];
            isEnd = false;
            data = new ArrayList<>();
        }
    }

    public static TrieNode root;
    public static List<List<String>> ans;

    public static List<List<String >> groupAnagrams(String [] str){

        root = new TrieNode();
        ans = new ArrayList<>();

        //Build Trie for each String
        for(String word : str){
            build(word);
        }

        //DFS to collect all groups
        dfs(root);

        return ans;


    }

    public static void build(String str){
        TrieNode temp = root;

        char [] word = str.toCharArray();
        Arrays.sort(word);

        for(char c: word){
            int index = c-'a';
            if(temp.children[index] == null){
                temp.children[index] = new TrieNode();
            }
            temp = temp.children[index];
        }
        temp.isEnd = true; //mark the last sorted character as true
        temp.data.add(str); // added the original string to end of the sorted character path
    }

    public static void dfs(TrieNode rt){
        if(rt == null){
            return;
        }

        if(rt.isEnd && !rt.data.isEmpty()){
            ans.add(new ArrayList<>(rt.data));
        }

        for(int i=0; i<26; i++){
            if(rt.children[i] != null){
                dfs(rt.children[i]);
            }
        }
    }

    public static void main(String [] args){

        String [] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }


}
