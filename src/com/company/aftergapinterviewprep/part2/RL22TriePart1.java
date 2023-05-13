package com.company.aftergapinterviewprep.part2;

import java.io.FileNotFoundException;

/* Implementation of 'Trie' Data Structure (Generalised, less preferred) */
// Check out the Trie code in the file RL23TriePart2.java file
// Notes - (1) A Trie is also called as a 'Prefix Tree'
// (2) It is an extremely useful data structure for solving String related problems and sometimes it also comes in handy
// for bit related questions
class TrieNode {
    // For simplicity or depending on the question we can change the value of MAX_SIZE to 26 for
    // English alphabet characters
    static final int MAX_SIZE = 256; // Since, there are 256 ASCII Values
    TrieNode[] children;
    // For simplicity or depending on the question we can keep the following variable as boolean, and it's 'true' value
    // would have represented the end of a word
    int endOfWord; // We are using an integer here to store the word count of a certain word

    public TrieNode() {
        children = new TrieNode[MAX_SIZE];
        endOfWord = 0;
    }
}

public class RL22TriePart1 {
    // Method to insert string into TrieNode
    static void insert(TrieNode root, String key) {
        TrieNode curNode = root;
        for (int i=0; i<key.length(); i++) {
            char ch = key.charAt(i);
            if (curNode.children[(int) ch] == null) {
                TrieNode child = new TrieNode();
                curNode.children[(int) ch] = child;
            }
            curNode = curNode.children[(int) ch];
        }
        curNode.endOfWord++;
    }

    // Method to use Trie data structure and search the given string
    static boolean search(TrieNode root, String key) {
        TrieNode curNode = root;
        for (int i=0; i<key.length(); i++) {
            char ch = key.charAt(i);
            if (curNode.children[(int) ch] == null) {
                return false;
            }
            curNode = curNode.children[(int) ch];
        }
        return (curNode.endOfWord > 0);
    }

    // Method to delete a word from Trie if it exists
    static void delete(TrieNode root, String key) {
        TrieNode curNode = root;
        for (int i=0; i<key.length(); i++) {
            char ch = key.charAt(i);
            if (curNode.children[(int) ch] == null) {
                return;
            }
            curNode = curNode.children[(int) ch];
        }
        curNode.endOfWord--;
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

        // Deleting a word from the Trie
        String wordToBeRemoved = "there";
        delete(root, wordToBeRemoved);
        if (search(root, wordToBeRemoved)) {
            System.out.println("The word = \"" + wordToBeRemoved + "\", has been successfully removed");
        } else {
            System.out.println("The word = " + wordToBeRemoved + ", has NOT been removed");
        }
    }
}
