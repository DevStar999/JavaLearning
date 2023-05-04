package com.company.aftergapinterviewprep;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

@SuppressWarnings("DuplicatedCode")
public class RecentLearnings32 {
    /* Binary Tree and Binary Search Tree - Basics, Part 2 */

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

    public static int heightOfTree(Node root) {
        if (root == null) return 0;

        return 1 + Math.max(heightOfTree(root.left), heightOfTree(root.right));
    }

    public static int sizeOfTree(Node root) {
        if (root == null) return 0;

        return 1 + sizeOfTree(root.left) + sizeOfTree(root.right);
    }

    public static int minimumValueInTree(Node root) {
        if (root == null) return Integer.MAX_VALUE;

        return Math.min(root.data, Math.min(minimumValueInTree(root.left), minimumValueInTree(root.right)));
    }

    public static int maximumValueInTree(Node root) {
        if (root == null) return Integer.MIN_VALUE;

        return Math.max(root.data, Math.max(maximumValueInTree(root.left), maximumValueInTree(root.right)));
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("/Users/development/Devwork/Java/IdeaProjects/JavaLearning/src/com/" +
                "company/aftergapinterviewprep/binary_tree_input1.txt"));

        input = new Scanner(System.in);
        Node root = createTree();

        System.out.println("The InOrder traversal of the tree is as follows - ");
        inOrderTraversal(root);
        System.out.println();

        int treeHeight = heightOfTree(root);
        System.out.println("The height 'h' of the given tree = " + treeHeight);

        int treeSize = sizeOfTree(root); // Size i.e. the total number of nodes in the tree
        System.out.println("The size of the given tree = " + treeSize);

        int minVal = minimumValueInTree(root);
        System.out.println("The minimum value in the given tree = " + minVal);

        int maxVal = maximumValueInTree(root);
        System.out.println("The maximum value in the given tree = " + maxVal);
    }
}
