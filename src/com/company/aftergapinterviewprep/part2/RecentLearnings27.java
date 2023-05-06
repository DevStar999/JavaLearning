package com.company.aftergapinterviewprep.part2;

import java.io.FileNotFoundException;

class Node {
    int data;
    Node next;

    public Node() {}
    public Node(int data) { this.data = data; }
    public Node(int data, Node next) { this.data = data; this.next = next; }
}

@SuppressWarnings("DuplicatedCode")
public class RecentLearnings27 {
    /* LinkedList - Basics, Part 1 */
    // Notes -> (1) As per convention, the 1st node in the LinkedList is called 'head'

    public static void traverse(Node head) {
        System.out.println("The traversal of a linked list is as follows - ");
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public static int getSizeOfLinkedList(Node head) {
        int ans = 0;
        Node cur = head;
        while (cur != null) {
            ans++;
            cur = cur.next;
        }
        return ans;
    }

    public static Node insertAtBeginning(Node head, int value) {
        Node toAdd = new Node(value);
        toAdd.next = head;
        head = toAdd;
        return head;
    }

    public static Node insertAtEnd(Node head, int value) {
        Node toAdd = new Node(value);
        if (head == null) return toAdd; // Case of an empty LinkedList

        Node prev = null, cur = head;
        while (cur != null) {
            prev = cur;
            cur = cur.next;
        }
        prev.next = toAdd;

        return head;
    }

    // This insert at given index method uses the above methods as sub-routines
    // Assuming the given LinkedList is of size 'n'
    // In-case, the given index (0-based indexing) is >= n, we insert the element at the end of the LinkedList
    // Time -> O(n)
    public static Node insertAtGivenIndexMethod1(Node head, int value, int index) {
        if (index == 0) { // Case 1 - Insert at the start (index == 0)
            return insertAtBeginning(head, value);
        }
        int n = getSizeOfLinkedList(head);
        if (index >= n) { // Case 2 - Insert at the end (index >= n)
            return insertAtEnd(head, value);
        }

        // Case 3 - Insert in the middle (index in range [1, n-1])
        Node toAdd = new Node(value);
        Node prev = head;
        for (int i=0; i<index-1; i++) {
            prev = prev.next;
        }
        toAdd.next = prev.next;
        prev.next = toAdd;

        return head;
    }

    // This insert at given index method does all the handling of the cases by itself
    public static Node insertAtGivenIndexMethod2(Node head, int value, int index) {
        Node toAdd = new Node(value);
        if (index == 0) {
            toAdd.next = head;
            head = toAdd;
            return head;
        }

        Node prev = head;
        for (int i=0; i<index-1 && prev.next != null; i++) {
            prev = prev.next;
        }
        if (prev.next == null) {
            prev.next = toAdd;
        } else {
            toAdd.next = prev.next;
            prev.next = toAdd;
        }

        return head;
    }

    // Method to get the exact middle 'Node' of a LinkedList
    // If the given LinkedList is of even size, then there will 2 middle nodes, so consider the 1st middle
    // node as the middle and return it
    public static Node getMiddleNode(Node head) {
        if (head == null) return null; // We were given an empty LinkedList

        Node slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // Now, if fast.next == null then, given LinkedList is of odd size
        // else it is of even size

        return slow;
    }

    public static Node insertAtMid(Node head, int value) {
        if (head == null) return new Node(value); // Base case - If given an empty LinkedList

        Node mid = getMiddleNode(head);

        Node toAdd = new Node(value);
        toAdd.next = mid.next;
        mid.next = toAdd;

        return head;
    }

    public static Node deleteNodeByGivenNode(Node head, Node toDelete) {
        Node prev = null, cur = head;
        while (cur != null) {
            if (cur == toDelete) break;

            prev = cur;
            cur = cur.next;
        }
        if (cur == null) { // Then 'toDelete' node was not found in the given LinkedList
            return head;
        }

        if (prev == null) { // The 'toDelete' node is the 'head' node itself
            head = cur.next;
        } else {
            prev.next = cur.next;
        }

        return head;
    }

    // Here, we will delete only the first occurrence of the 'value'
    public static Node deleteNodeByGivenValue(Node head, int value) {
        Node prev = null, cur = head;
        while (cur != null) {
            if (cur.data == value) break;

            prev = cur;
            cur = cur.next;
        }
        if (cur == null) { // Then 'toDelete' node was not found in the given LinkedList
            return head;
        }

        if (prev == null) { // The 'toDelete' node is the 'head' node itself
            head = cur.next;
        } else {
            prev.next = cur.next;
        }

        return head;
    }

    // The index is 0-based
    public static Node deleteNodeByGivenIndex(Node head, int index) {
        Node prev = null, cur = head;
        while (index > 0) {
            prev = cur;
            cur = cur.next;
            index--;
        }
        if (prev == null) {
            head = cur.next;
        } else {
            prev.next = cur.next;
        }

        return head;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Node n1 = new Node(10);
        Node n2 = new Node(15);
        Node n3 = new Node(20);
        Node head1 = n1;
        head1.next = n2;
        n2.next = n3;
        n3.next = null;

        // Traversing the LinkedList as follows
        traverse(head1);

        // Getting the size of the LinkedList
        int currentSize = getSizeOfLinkedList(head1);
        System.out.println("Current Size of the given LinkedList = " + currentSize);

        // Inserting a value '18' at index 2 (0-based indexing) in the LinkedList
        int value1 = 18, index1 = 100;
        head1 = insertAtGivenIndexMethod2(head1, value1, index1);
        traverse(head1);

        // Inserting a value '25' at the middle of the LinkedList
        int value2 = 25;
        head1 = insertAtMid(head1, value2);
        traverse(head1);
    }
}
