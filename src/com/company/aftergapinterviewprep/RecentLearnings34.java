package com.company.aftergapinterviewprep;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

@SuppressWarnings("DuplicatedCode")
public class RecentLearnings34 {
    /* Binary Tree - Miscellaneous [Lowest Common Ancestor, Time to Burn a Tree] */

    private static Scanner input;

    public static Node createTree() {
        Node root;
        System.out.println("Enter 'data' value - ");
        int data = input.nextInt();

        if (data == -1) return null; // We will input the data as -1, when we want to
        root = new Node(data);

        System.out.println("Enter left for " + data);
        root.left = createTree();

        System.out.println("Enter right for " + data);
        root.right = createTree();

        return root;
    }

    public static void inOrderTraversal(Node root) {
        if (root == null) return;

        inOrderTraversal(root.left);
        System.out.print(root.data + " ");
        inOrderTraversal(root.right);
    }

    // Time Complexity -> O(N), Space Complexity -> O(N)
    // [Note - Generally, the space complexity of the recursive function is O(recursion depth). Here, the recursion
    // depth can go upto 'n' in the worst case which is that of a skewed BST thus Space Complexity -> O(n)]
    public static Node lowestCommonAncestor(Node root, Node a, Node b) {
        if (root == null) return null;

        // Case 1
        if (root == a || root == b) { // The root element itself is either 'a' or 'b', then clearly the 'root' is the LCA
            return root;
        }

        Node left = lowestCommonAncestor(root.left, a, b);
        Node right = lowestCommonAncestor(root.right, a, b);

        // Case 2 - Meaning both 'a' and 'b' are not present in the tree
        if (left == null && right == null) {
            return null;
        }

        // Case 3 - Both 'a' and 'b' are in either the left sub-tree or the right sub-tree
        if (left == null) { // Both 'a' and 'b' are in the right sub-tree
            return right;
        }
        if (right == null) { // Both 'a' and 'b' are in the left sub-tree
            return left;
        }

        // Case 4 - 'a' is in the left sub-tree and 'b' is in the right sub-tree or vice-versa
        return root;
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("/Users/development/Devwork/Java/IdeaProjects/JavaLearning/src/com/" +
                "company/aftergapinterviewprep/binary_tree_input1.txt"));

        input = new Scanner(System.in);
        Node root = createTree();

        System.out.println("The InOrder traversal of the tree is as follows - ");
        inOrderTraversal(root);
        System.out.println();

        // The method for Lowest Common Ancestor has been test on LeetCode and GFG
    }
}
