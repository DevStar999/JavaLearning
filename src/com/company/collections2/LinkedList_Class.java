package com.company.collections2;

import java.util.* ;

public class LinkedList_Class {

	public static void main(String[] args) {
		LinkedList<Integer> lt1 = new LinkedList<Integer>() ;
		for(int i=0 ; i<10 ; i++) { lt1.add(i) ; }
		lt1.add(5) ; lt1.addLast(5) ; lt1.addFirst(5) ;

		/** Constructors for LinkedList Class **/
		/** Method Support From : Collection, List **/
		/* (1) LinkedList() - Used to create an empty linked list. */
		LinkedList<Integer> ls1 = new LinkedList<Integer>() ;
		
		/* (2) LinkedList(Collection c) - Used to create a ordered list which contains all 
			   the elements of a specified collection, as returned by the collection’s iterator.
		*/
		LinkedList<Integer> ls2 = new LinkedList<Integer>(lt1) ;
		
		/** Common LinkedList Class Methods are follows (Excluding those which were mentioned before) **/
		/* (1) addFirst​(Object ob) - This method inserts the specified element at the beginning of this list. */
		lt1.addFirst(100) ;
		
		/* (2) addLast​(Object ob) - This method appends the specified element to the end of this list. */
		lt1.addLast(3000) ;
		
		/* (3) clone​() - This method returns a shallow copy of this LinkedList. */
		LinkedList<Integer> lt1_copy = (LinkedList<Integer>)lt1.clone() ;
		
		/* (4) getFirst​() - This method returns the first element in this list. */
		System.out.println("The first element of the LinkedList 'lt1' = " + lt1.getFirst()) ;
		
		/* (5) getLast​() - This method returns the last element in this list. */
		System.out.println("The last element of the LinkedList 'lt1' = " + lt1.getLast()) ;
		
		/* (6) removeFirst​() - This method removes and returns the first element from this list. */
		lt1.removeFirst() ;

		/* (7) removeLast​() - This method removes and returns the last element from this list. */
		lt1.removeLast() ;
		
		/* (8) removeFirstOccurrence​(Object ob) - This method removes the first occurrence of the 
			   specified element in this list (when traversing the list from head to tail). 
		*/
		lt1.removeFirstOccurrence(5) ;

		/* (9) removeLastOccurrence​(Object ob) - This method removes the last occurrence of the 
		   specified element in this list (when traversing the list from head to tail). 
		*/
		lt1.removeLastOccurrence(5) ; 
	}

}
