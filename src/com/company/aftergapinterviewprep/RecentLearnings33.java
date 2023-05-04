package com.company.aftergapinterviewprep;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeMap;

@SuppressWarnings("DuplicatedCode")
public class RecentLearnings33 {
    /* Binary Tree and Binary Search Tree - Level Order Traversal, Left-View, Right-View, Top-View & Bottom-View */

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

    // Here, we print the Level Order Traversal of a Binary Tree in a single line
    public static void levelOrderTraversal(Node root) {
        System.out.println("The Level Order Traversal of the given binary tree is as follows (In a single line) - ");

        Queue<Node> q = new ArrayDeque<Node>();
        q.add(root);
        while (q.size() > 0) {
            Node head = q.poll();
            System.out.print(head.data + " ");
            if (head.left != null) {
                q.add(head.left);
            }
            if (head.right != null) {
                q.add(head.right);
            }
        }
        System.out.println();
    }

    // Here, we print the Level Order Traversal of a Binary Tree with each level nodes printed on a different line
    public static void levelOrderTraversalDifferentLevels(Node root) {
        System.out.println("The Level Order Traversal of the given binary tree is as " +
                "follows (In multiple lines, level-wise) - ");

        Queue<Node> q = new ArrayDeque<Node>();
        Queue<Node> nextLevel = new ArrayDeque<Node>();
        q.add(root);
        while (q.size() > 0 || nextLevel.size() > 0) {
            if (q.size() == 0) {
                System.out.println();
                while (nextLevel.size() > 0) {
                    q.add(nextLevel.poll());
                }
                continue;
            }

            Node head = q.poll();
            System.out.print(head.data + " ");
            if (head.left != null) {
                nextLevel.add(head.left);
            }
            if (head.right != null) {
                nextLevel.add(head.right);
            }
        }
        System.out.println();
    }

    // The order of elements from top to bottom when looking at the tree from the Left side
    public static void leftViewOfATree(Node root, int currentLevel, Map<Integer, Node> leftMostNodePerLevel) {
        if (root == null) return;

        if (!leftMostNodePerLevel.containsKey(currentLevel)) {
            leftMostNodePerLevel.put(currentLevel, root);
        }
        leftViewOfATree(root.left, currentLevel + 1, leftMostNodePerLevel);
        leftViewOfATree(root.right, currentLevel + 1, leftMostNodePerLevel);
    }

    // The order of elements from top to bottom when looking at the tree from the Right side
    public static void rightViewOfATree(Node root, int currentLevel, Map<Integer, Node> rightMostNodePerLevel) {
        if (root == null) return;

        rightMostNodePerLevel.put(currentLevel, root);
        rightViewOfATree(root.left, currentLevel + 1, rightMostNodePerLevel);
        rightViewOfATree(root.right, currentLevel + 1, rightMostNodePerLevel);
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("/Users/development/Devwork/Java/IdeaProjects/JavaLearning/src/com/" +
                "company/aftergapinterviewprep/binary_tree_input1.txt"));

        input = new Scanner(System.in);
        Node root = createTree();

        System.out.println("The InOrder traversal of the tree is as follows - ");
        inOrderTraversal(root);
        System.out.println();

        // Level Order Traversal (Printed in a single line)
        levelOrderTraversal(root);

        // Level Order Traversal (Printed over multiple lines)
        levelOrderTraversalDifferentLevels(root);

        // Left View of a Binary Tree
        Map<Integer, Node> leftMostNodePerLevel = new HashMap<>();
        leftViewOfATree(root, 0, leftMostNodePerLevel);
        int[] leftView = new int[leftMostNodePerLevel.size()];
        for (Map.Entry<Integer, Node> element: leftMostNodePerLevel.entrySet()) {
            leftView[element.getKey()] = element.getValue().data;
        }
        System.out.println("The Left-View of the given binary tree is as follows - ");
        for (int element: leftView) {
            System.out.print(element + " ");
        }
        System.out.println();

        // Right View of a Binary Tree
        Map<Integer, Node> rightMostNodePerLevel = new HashMap<>();
        rightViewOfATree(root, 0, rightMostNodePerLevel);
        int[] rightView = new int[rightMostNodePerLevel.size()];
        for (Map.Entry<Integer, Node> element: rightMostNodePerLevel.entrySet()) {
            rightView[element.getKey()] = element.getValue().data;
        }
        System.out.println("The Right-View of the given binary tree is as follows - ");
        for (int element: rightView) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
