package com.company.aftergapinterviewprep.part3;

import java.io.FileNotFoundException;
import java.util.Scanner;

class Node {
    int data;
    Node left, right;
    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

@SuppressWarnings("DuplicatedCode")
public class RL31BTAndBSTPart1 {
    /* Binary Tree and Binary Search Tree - Basics, Part 1 */
    // Resources -> https://www.youtube.com/watch?v=QhIM-G7FAow&list=PLUcsbZa0qzu0g_LceXxWu6ICc2o8SiAhJ&index=1
    // Notes -> (1) A tree with each node having at most 2 children is Binary Tree
    // (2) Maximum number of nodes at level 'i' = (2 ^ i) [The first level at which the root is placed is level 0]
    // (3) Maximum number of nodes in a tree with height 'h' = (2 ^ h) - 1
    // (4) If we consider a Binary Tree with 0 based indexing then, for any node 'i' it's
    // left child = 2 * i + 1, right child = 2 * i + 2

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

    public static void preOrderTraversal(Node root) {
        if (root == null) return;

        System.out.print(root.data + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public static void postOrderTraversal(Node root) {
        if (root == null) return;

        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) throws FileNotFoundException {
        input = new Scanner(System.in);
        Node root = createTree();

        System.out.println("The InOrder traversal of the tree is as follows - ");
        inOrderTraversal(root);
        System.out.println();

        System.out.println("The PreOrder traversal of the tree is as follows - ");
        preOrderTraversal(root);
        System.out.println();

        System.out.println("The PostOrder traversal of the tree is as follows - ");
        postOrderTraversal(root);
        System.out.println();
    }
}
