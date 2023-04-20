package com.company.aftergapinterviewprep;

import java.io.FileNotFoundException;

/* Implementation of 'Trie' Data Structure (Most commonly used implementation, preferred) */
@SuppressWarnings("DuplicatedCode")
public class RecentLearnings23 {
    static class TrieNode {
        static final int MAX_SIZE = 26;
        TrieNode[] children;
        int endOfWord;

        public TrieNode() {
            children = new TrieNode[MAX_SIZE];
            endOfWord = 0;
        }
    }

    // Method to insert string into TrieNode
    static void insert(TrieNode root, String key) {
        TrieNode curNode = root;
        for (int i=0; i<key.length(); i++) {
            char ch = key.charAt(i);
            if (curNode.children[ch - 'a'] == null) {
                TrieNode child = new TrieNode();
                curNode.children[ch - 'a'] = child;
            }
            curNode = curNode.children[ch - 'a'];
        }
        curNode.endOfWord++;
    }

    // Method to use Trie data structure and search the given string
    static boolean search(TrieNode root, String key) {
        TrieNode curNode = root;
        for (int i=0; i<key.length(); i++) {
            char ch = key.charAt(i);
            if (curNode.children[ch - 'a'] == null) {
                return false;
            }
            curNode = curNode.children[ch - 'a'];
        }
        return (curNode.endOfWord > 0);
    }

    public static void main(String[] args) throws FileNotFoundException {
        TrieNode root = new TrieNode();

        // Input keys (use only 'a' through 'z' and lower case)
        String[] words = {"the", "a", "there", "answer", "any", "by", "bye", "their"};
        String[] queries = {"there", "hello", "any"};

        // Inserting the words in the Trie via 'root'
        for (String word: words) {
            insert(root, word);
        }

        // Querying if given words exist in the Trie or not as follows
        for (String query: queries) {
            if (search(root, query)) {
                System.out.println("YES, the word = \"" + query + "\", is present in the Trie");
            } else {
                System.out.println("NO, the word = \"" + query + "\", is NOT present in the Trie");
            }
        }
    }
}
