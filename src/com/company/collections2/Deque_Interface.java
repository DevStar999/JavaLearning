package com.company.collections2;

import java.util.* ;

public class Deque_Interface {

	public static void main(String[] args) {
		Deque<Integer> dq1 = new ArrayDeque<Integer>() ;
		Deque<Integer> dq2 = new ArrayDeque<Integer>() ;
		for(int i=0 ; i<10 ; i++) { dq1.add(i+10) ; dq2.add(i+50) ; }
		dq1.add(70) ;
		
		/** Creating Queue Objects : Instantiation **/
		Deque dqx1 = new ArrayDeque() , dqx2 = new LinkedList() ;
		Deque<Integer> dqx3 = new ArrayDeque<Integer>() ; // Type-safe instantiation.		
		
		/** Common Deque Class Methods are follows (Excluding those which were mentioned before) **/
		/** Method Support From : Collection, Queue **/
		/* (1) addFirst(Object ob) - Adds an element to the head. */
		dq1.addFirst(24) ;
		
		/* (2) addLast(Object ob)[ Same as add() method ] - Adds an element to the tail. */
		dq1.addLast(38) ;
		
		/* (3) offer(Object ob) - Adds an element to the tail and returns a boolean to explain if the 
			   insertion was successful. 
		*/
		System.out.println("The insertion of 56 at the end of the Deque 'dq1' is successful = " + dq1.offer(56)) ;
		
		/* (4) offerFirst(Object ob) - Adds an element to the head and returns a boolean to explain 
			   if the insertion was successful. 
		*/
		System.out.println("The insertion of 56 at the start of the Deque 'dq1' is successful = " + 
		dq1.offerFirst(56)) ;
		
		/* (5) offerLast(Object ob)[ Same as offer() method ] - Adds an element to the tail and returns 
		       a boolean to explain if the insertion was successful. 
		*/
		System.out.println("The insertion of 56 at the end of the Deque 'dq1' is successful = " + 
		dq1.offerLast(56)) ;
		
		/* (6) descendingIterator() - Returns an iterator that has the reverse order for this Deque. */
		Iterator dec_it = dq1.descendingIterator() ;
		
		/* (7) push(Object ob)[ Same as addFirst() ] - Adds an element to the head. */
		dq2.push(67) ;
		
		/* (8) pop() - Removes an element from the head and returns it. */
		System.out.println("The element from the head of the Deque 'dq2' = " + dq2.pop()) ;

		/* (9) removeFirst() - Removes the element at the head. */
		System.out.println("The element at the head of the Deque 'dq2' just about to be removed = " + 
		dq2.removeFirst()) ;

		/* (10) removeLast() - Removes the element at the tail. */
		System.out.println("The element at the tail of the Deque 'dq2' just about to be removed = " + 
		dq2.removeLast()) ;		
	}

}
