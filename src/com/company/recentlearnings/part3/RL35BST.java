package com.company.recentlearnings.part3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

@SuppressWarnings("DuplicatedCode")
public class RL35BST {
    /* Binary Search Tree - Basics */
    // Notes -> (1) The InOrder Traversal of a BST gives the nodes in a sorted sequence
    // (2) Properties of a BST are as follows -
    // a) For a node, both of it's sub-trees should also be a BST
    // b) The maximum value in the left sub-tree should be less than the value of the node &
    // the minimum value in the right sub-tree should be more than the value of the node

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

    public static Integer maxValInTree(Node root) {
        if (root == null) return null;
        List<Integer> values = new ArrayList<>() {{add(root.data);}};
        Integer leftMax = maxValInTree(root.left);
        Integer rightMax = maxValInTree(root.right);
        if (leftMax != null) values.add(leftMax);
        if (rightMax != null) values.add(rightMax);
        Collections.sort(values);
        return values.get(values.size()-1);
    }

    public static Integer minValInTree(Node root) {
        if (root == null) return null;
        List<Integer> values = new ArrayList<>() {{add(root.data);}};
        Integer leftMin = minValInTree(root.left);
        Integer rightMin = minValInTree(root.right);
        if (leftMin != null) values.add(leftMin);
        if (rightMin != null) values.add(rightMin);
        Collections.sort(values);
        return values.get(0);
    }

    // (1) [Most Intuitive] Method 1 to check if given BST is valid or not -> Here, we check if the value of the current
    // node is strictly greater then the max value from the left sub-tree and the value is strictly smaller then the
    // min value from the right sub-tree and then recursively check the same for the left and right sub-trees
    // Time Complexity -> O(n*n), Space Complexity -> O(n)
    // [Note - Generally, the space complexity of the recursive function is O(recursion depth). Here, the recursion
    // depth can go upto 'n' in the worst case which is that of a skewed BST thus Space Complexity -> O(n)]
    public static boolean checkValidBSTMethod1(Node root) {
        if (root == null) return true;

        Integer leftTreeMax = maxValInTree(root.left), rightTreeMin = minValInTree(root.right);
        if ((leftTreeMax != null && root.data <= leftTreeMax) || (rightTreeMin != null && root.data >= rightTreeMin)) {
            return false;
        }

        return (checkValidBSTMethod1(root.left) && checkValidBSTMethod1(root.right));
    }

    // (2) Method 2 to check if given BST is valid or not -> Here, we check if the value of the current node lies
    // within a specific range or not and then recursively check the same for the left sub-tree and the right sub-tree
    // Time Complexity -> O(n), Space Complexity -> O(n)
    public static boolean checkValidBSTMethod2(Node root, Integer start, Integer end) {
        if (root == null) return true;

        if ((start != null && root.data <= start) || (end != null && root.data >= end)) {
            return false;
        }

        return (checkValidBSTMethod2(root.left, start, root.data) && checkValidBSTMethod2(root.right, root.data, end));
    }

    // (3) [Intuitive, Best] Method 3 to check if given BST is valid or not -> Here, we check if the inorder traversal
    // of the given BST is correct or not with O(1) Space i.e. with constant space complexity
    // Time Complexity -> O(n), Space Complexity -> O(n)
    static Node prev = null;
    public static boolean checkValidBSTMethod3(Node root) {
        if (root == null) return true;

        if (!checkValidBSTMethod3(root.left)) return false;

        if (prev != null && root.data <= prev.data) return false;
        prev = root;

        return checkValidBSTMethod3(root.right);
    }

    // (4) Insert a value into the BST
    // [Note - If the value to be entered is already present, then do not modify the BST]
    // Time Complexity -> O(n), Space Complexity -> O(n)
    public static Node insertNodeInBST(Node root, int key) {
        if (root == null) return new Node(key);

        if (key < root.data) {
            root.left = insertNodeInBST(root.left, key);
        } else if (key > root.data) {
            root.right = insertNodeInBST(root.right, key);
        }

        return root;
    }

    // (5) Simple minimum value in a Binary Tree method
    /* Using the following simple version of min value in a BST, since we know that the given BST for this function
       call will not be an empty BST */
    public static int minValInTreeSimple(Node root) {
        if (root == null) return Integer.MAX_VALUE;

        return Math.min(root.data, Math.min(minValInTree(root.left), minValInTree(root.right)));
    }

    // (6) Delete a value into the BST
    // [Note - If the value is not present int the BST, ignore and return]
    // Time Complexity -> O(n), Space Complexity -> O(n)
    public static Node deleteNodeInBST(Node root, int key) {
        if (root == null) return null;

        if (key < root.data) {
            root.left = deleteNodeInBST(root.left, key);
        } else if (key > root.data) {
            root.right = deleteNodeInBST(root.right, key);
        } else { // key == root.val is true
            if (root.left == null && root.right == null) { // Current node has NO children
                return null;
            } else if (root.left != null && root.right == null) { // Current node has 1 child i.e. left child
                return root.left;
            } else if (root.left == null && root.right != null) { // Current node has 1 child i.e. right child
                return root.right;
            } else { // Current node has both children
                int subValue = minValInTreeSimple(root.right); // Inorder Successor for current node value
                root.data = subValue; // Replacing with current node value, so as to delete key
                root.right = deleteNodeInBST(root.right, subValue); // Now, recursing to delete the subValue
            }
        }

        return root;
    }

    // (7) Method to convert a sorted array into a balanced BST
    public static Node convertToBST(int[] arr, int start, int end) {
        if (start > end) return null;

        int mid = start + (end - start) / 2;
        Node root = new Node(arr[mid]);
        root.left = convertToBST(arr, start, mid-1);
        root.right = convertToBST(arr, mid+1, end);

        return root;
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("/Users/development/Devwork/Java/IdeaProjects/JavaLearning/src/com/" +
                "company/recentlearnings/bst_input1.txt"));

        input = new Scanner(System.in);
        Node root = createTree();

        System.out.println("The InOrder traversal of the tree is as follows - ");
        inOrderTraversal(root);
        System.out.println();

        // Check if the given BST is valid or not with Method 1
        boolean check1 = checkValidBSTMethod1(root);
        System.out.print("As per the Method 1 to check valid BST, ");
        if (check1) {
            System.out.println("the given tree IS a BST");
        } else {
            System.out.println("the given tree is NOT a BST");
        }

        // Check if the given BST is valid or not with Method 2
        boolean check2 = checkValidBSTMethod2(root, null, null);
        System.out.print("As per the Method 2 to check valid BST, ");
        if (check2) {
            System.out.println("the given tree IS a BST");
        } else {
            System.out.println("the given tree is NOT a BST");
        }

        // Check if the given BST is valid or not with Method 3
        boolean check3 = checkValidBSTMethod3(root);
        System.out.print("As per the Method 3 to check valid BST, ");
        if (check3) {
            System.out.println("the given tree IS a BST");
        } else {
            System.out.println("the given tree is NOT a BST");
        }

        // Insert a value into the BST
        int insertionValue = 8;
        root = insertNodeInBST(root, insertionValue);
        System.out.println("The InOrder traversal of the tree is as follows - ");
        inOrderTraversal(root);
        System.out.println();

        // Delete a value from the BST
        int deletionValue = 8;
        root = deleteNodeInBST(root, deletionValue);
        System.out.println("The InOrder traversal of the tree is as follows - ");
        inOrderTraversal(root);
        System.out.println();

        // Converting a sorted array into a BST
        int[] sortedArray = {1, 2, 4, 7, 10};
        int n = sortedArray.length, start = 0, end = n-1;
        Node rootBST = convertToBST(sortedArray, start, end);
        System.out.println("The InOrder traversal of the newly generated BST from the Sorted Array is as follows - ");
        inOrderTraversal(rootBST);
        System.out.println();
    }
}
