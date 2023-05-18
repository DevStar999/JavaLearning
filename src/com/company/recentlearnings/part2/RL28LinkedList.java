package com.company.recentlearnings.part2;

import java.io.FileNotFoundException;

class Node {
    int data;
    Node next;

    public Node() {}
    public Node(int data) { this.data = data; }
    public Node(int data, Node next) { this.data = data; this.next = next; }
}

@SuppressWarnings("DuplicatedCode")
public class RL28LinkedList {
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

    public static boolean detectLoop(Node head){
        boolean ans = false;
        Node slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                ans = true;
                break;
            }
        }
        return ans;
    }

    // This method is same as 'detectLoop' method, only difference is here we return the meeting node or return null
    public static Node meetPointInCycledLinkedList(Node head) {
        Node meetPoint = null;
        Node slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                meetPoint = slow;
                break;
            }
        }
        return meetPoint;
    }

    // This method will return null if there is no cycle in the given LinkedList
    public static Node findFirstNodeOfCycleInLinkedList(Node head) {
        Node meet = meetPointInCycledLinkedList(head);
        Node cur = head;
        // The idea is to iterate from the head and the meet point and at the point where these two meet, that is the
        // node which is the first node of the cycle in the LinkedList (This approach has a prove on why this works)
        while (cur != meet) {
            cur = cur.next;
            meet = meet.next;
        }
        return cur;
        // The code to remove cycle is also very similar to this, we just need the node previous to the 'ans' for the
        // 'meet' node and remove it's link to the 'ans' node
    }

    public static Node reverseGivenLinkedList(Node head) {
        if (head == null || head.next == null) return head; // For LinkedList of size 0 or 1

        Node prev = null, cur = head;
        while (cur != null) {
            Node nextNode = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nextNode;
        }

        return prev;
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
