package com.company.aftergapinterviewprep.part2;

import java.io.FileNotFoundException;

@SuppressWarnings("DuplicatedCode")
public class RecentLearnings27a {
    /* LinkedList - Basics, Part 2 */

    public static void traverse(Node head) {
        System.out.println("The traversal of a linked list is as follows - ");
        Node cur = head;
        while (cur != null) {
            if (cur.next != null) {
                System.out.print(cur.val + " -> ");
            } else {
                System.out.print(cur.val);
            }
            cur = cur.next;
        }
        System.out.println();
    }

    public static void main(String[] args) throws FileNotFoundException {
        Node n1 = new Node(10);
        Node n2 = new Node(15);
        Node n3 = new Node(20);
        Node head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = null;

        traverse(head);
    }
}
