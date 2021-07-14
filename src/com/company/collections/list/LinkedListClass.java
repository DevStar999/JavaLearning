package com.company.collections.list;

import java.util.LinkedList;

public class LinkedListClass {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            linkedList1.add(i);
        }
        linkedList1.add(5);
        linkedList1.addLast(5);
        linkedList1.addFirst(5);

        /** Constructors for LinkedList Class **/
        /** Method Support From : Collection, List **/
        /* (1) LinkedList() - Used to create an empty linked list. */
        LinkedList<Integer> linkedList2 = new LinkedList<>();
		
		/* (2) LinkedList(Collection c) - Used to create a ordered list which contains all 
			   the elements of a specified collection, as returned by the collection’s iterator.
		*/
        LinkedList<Integer> linkedList3 = new LinkedList<>(linkedList1);

        /** Common LinkedList Class Methods are follows (Excluding those which were mentioned before) **/
        /* (1) addFirst(Object ob) - This method inserts the specified element at the beginning of this list. */
        linkedList1.addFirst(100);

        /* (2) addLast(Object ob) - This method appends the specified element to the end of this list. */
        linkedList1.addLast(3000);

        /* (3) clone() - This method returns a shallow copy of this LinkedList. */
        LinkedList<Integer> linkedList1Copy = (LinkedList<Integer>) linkedList1.clone();

        /* (4) getFirst() - This method returns the first element in this list. */
        System.out.println("The first element of the LinkedList 'linkedList1' = " + linkedList1.getFirst());

        /* (5) getLast() - This method returns the last element in this list. */
        System.out.println("The last element of the LinkedList 'linkedList1' = " + linkedList1.getLast());

        /* (6) removeFirst() - This method removes and returns the first element from this list. */
        linkedList1.removeFirst();

        /* (7) removeLast() - This method removes and returns the last element from this list. */
        linkedList1.removeLast();
		
		/* (8) removeFirstOccurrence(Object ob) - This method removes the first occurrence of the
			   specified element in this list (when traversing the list from head to tail). 
		*/
        linkedList1.removeFirstOccurrence(5);

		/* (9) removeLastOccurrence(Object ob) - This method removes the last occurrence of the
		   specified element in this list (when traversing the list from head to tail). 
		*/
        linkedList1.removeLastOccurrence(5);
    }
}
