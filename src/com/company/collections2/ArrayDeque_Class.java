package com.company.collections2;

import java.util.* ; 

public class ArrayDeque_Class {

	public static <T> void print_dq( Queue<T> dq ) {
		Queue<T> dq_copy = new ArrayDeque<T>(dq) ;
		for(T el: dq) { System.out.print( el + " " ) ; }
		System.out.println() ;
	}
	
	public static void main(String[] args) {
		ArrayDeque<Integer> dq1 = new ArrayDeque<Integer>() ;
		ArrayDeque<Integer> dq2 = new ArrayDeque<Integer>() ;	
		List<Integer> lt = new ArrayList<Integer>() ;
		SortedSet<Integer> ss = new TreeSet<Integer>() ;
		for(int i=0 ; i<10 ; i++) { dq1.add(i+10) ; dq2.add(i+40) ; lt.add(i+200) ; ss.add(i+4000) ; }
		dq1.add(11) ; dq1.add(12) ; dq1.add(11) ; dq1.add(12) ;   

		/** Constructors for ArrayDeque Class **/
		/* (1) ArrayDeque() - Used to create an empty ArrayDeque and by default holds an initial 
			   capacity to hold 16 elements. 
		*/
		ArrayDeque<Integer> dqx1 = new ArrayDeque<Integer>() ;
		
		/* (2) ArrayDeque(Collection c) - Used to create an ArrayDeque containing all the elements same 
		 	   as that of the specified collection.
		*/
		ArrayDeque<Integer> dqx2 = new ArrayDeque<Integer>(lt) ;
		
		/* (3) ArrayDeque(int capacity) - Used to create an empty ArrayDeque that has the capacity 
			   to contain a specified number of elements. 
		*/
		ArrayDeque<Integer> dqx3 = new ArrayDeque<Integer>(10) ;		
	
		/** Common ArrayDeque Class Methods are follows (Excluding those which were mentioned before) **/
		/** Method Support From : Collection, Queue, Deque **/
		/* (1) clone() - This method return a shallow copy this Deque. */
		ArrayDeque<Integer> dq1_copy = (ArrayDeque<Integer>)dq1.clone() ;		
		
		/* (2) getFirst() - The method returns first element of the Deque. */
		System.out.println("The element at the head of the Deque 'dq1' = " + dq1.getFirst()) ;

		/* (3) getLast() - The method returns last element of the Deque. */
		System.out.println("The element at the tail of the Deque 'dq1' = " + dq1.getLast()) ;
		
		/* (4) removeFirstOccurrence(Object ob) - The method removes the element where it first 
			   occur in the Deque. 
		*/
		dq1.removeFirstOccurrence(11) ;
		
		/* (5) removeLastOccurrence(Object ob) - The method removes the element where it last 
			   occur in the Deque. 
		*/
		dq1.removeLastOccurrence(11) ;
	}

}
