package com.company.collections2.queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.SortedSet;
import java.util.TreeSet;

public class ArrayDequeClass {
    public static <T> void printDQ(Queue<T> dq) {
        for (T el : dq) {
            System.out.print(el + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque1 = new ArrayDeque<>();
        ArrayDeque<Integer> arrayDeque2 = new ArrayDeque<>();
        List<Integer> list = new ArrayList<>();
        SortedSet<Integer> sortedSet = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            arrayDeque1.add(i + 10);
            arrayDeque2.add(i + 40);
            list.add(i + 200);
            sortedSet.add(i + 4000);
        }
        arrayDeque1.add(11);
        arrayDeque1.add(12);
        arrayDeque1.add(11);
        arrayDeque1.add(12);

        /** Constructors for ArrayDeque Class **/
		/* (1) ArrayDeque() - Used to create an empty ArrayDeque and by default holds an initial
			   capacity to hold 16 elements. 
		*/
        ArrayDeque<Integer> arrayDeque3 = new ArrayDeque<>();
		
		/* (2) ArrayDeque(Collection c) - Used to create an ArrayDeque containing all the elements same 
		 	   as that of the specified collection.
		*/
        ArrayDeque<Integer> arrayDeque4 = new ArrayDeque<>(list);
		
		/* (3) ArrayDeque(int capacity) - Used to create an empty ArrayDeque that has the capacity 
			   to contain a specified number of elements. 
		*/
        ArrayDeque<Integer> arrayDeque5 = new ArrayDeque<>(10);

        /** Common ArrayDeque Class Methods are follows (Excluding those which were mentioned before) **/
        /** Method Support From : Collection, Queue, Deque **/
        /* (1) clone() - This method return a shallow copy this Deque. */
        ArrayDeque<Integer> arrayDeque1Copy = arrayDeque1.clone();

        /* (2) getFirst() - The method returns first element of the Deque. */
        System.out.println("The element at the head of the Deque 'arrayDeque1' = " + arrayDeque1.getFirst());

        /* (3) getLast() - The method returns last element of the Deque. */
        System.out.println("The element at the tail of the Deque 'arrayDeque1' = " + arrayDeque1.getLast());
		
		/* (4) removeFirstOccurrence(Object ob) - The method removes the element where it first 
			   occur in the Deque. 
		*/
        arrayDeque1.removeFirstOccurrence(11);
		
		/* (5) removeLastOccurrence(Object ob) - The method removes the element where it last 
			   occur in the Deque. 
		*/
        arrayDeque1.removeLastOccurrence(11);
    }
}
