package com.company.collections2.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class DequeInterface {
    public static void main(String[] args) {
        Deque<Integer> deque1 = new ArrayDeque<>();
        Deque<Integer> deque2 = new ArrayDeque<>();
        for (int i = 0; i < 10; i++) {
            deque1.add(i + 10);
            deque2.add(i + 50);
        }
        deque1.add(70);

        /** Creating Queue Objects : Instantiation **/
        Deque deque3 = new ArrayDeque(), deque4 = new LinkedList();
        Deque<Integer> deque5 = new ArrayDeque<>(); // Type-safe instantiation.

        /** Common Deque Class Methods are follows (Excluding those which were mentioned before) **/
        /** Method Support From : Collection, Queue **/
        /* (1) addFirst(Object ob) - Adds an element to the head. */
        deque1.addFirst(24);

        /* (2) addLast(Object ob)[ Same as add() method ] - Adds an element to the tail. */
        deque1.addLast(38);
		
		/* (3) offer(Object ob) - Adds an element to the tail and returns a boolean to explain if the 
			   insertion was successful. 
		*/
        System.out.println("The insertion of 56 at the end of the Deque 'deque1' is successful = " +
                deque1.offer(56));
		
		/* (4) offerFirst(Object ob) - Adds an element to the head and returns a boolean to explain 
			   if the insertion was successful. 
		*/
        System.out.println("The insertion of 56 at the start of the Deque 'deque1' is successful = " +
                deque1.offerFirst(56));
		
		/* (5) offerLast(Object ob)[ Same as offer() method ] - Adds an element to the tail and returns 
		       a boolean to explain if the insertion was successful. 
		*/
        System.out.println("The insertion of 56 at the end of the Deque 'deque1' is successful = " +
                deque1.offerLast(56));

        /* (6) descendingIterator() - Returns an iterator that has the reverse order for this Deque. */
        Iterator descendingIterator = deque1.descendingIterator();

        /* (7) push(Object ob)[ Same as addFirst() ] - Adds an element to the head. */
        deque2.push(67);

        /* (8) pop() - Removes an element from the head and returns it. */
        System.out.println("The element from the head of the Deque 'deque2' = " + deque2.pop());

        /* (9) removeFirst() - Removes the element at the head. */
        System.out.println("The element at the head of the Deque 'deque2' just about to be removed = " +
                deque2.removeFirst());

        /* (10) removeLast() - Removes the element at the tail. */
        System.out.println("The element at the tail of the Deque 'deque2' just about to be removed = " +
                deque2.removeLast());
    }
}
