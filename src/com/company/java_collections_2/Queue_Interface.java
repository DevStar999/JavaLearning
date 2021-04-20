package com.company.java_collections_2;

import java.util.* ;

public class Queue_Interface {

	public static void main(String[] args) {
		Queue<Integer> qu1 = new ArrayDeque<Integer>() ;
		Queue<Integer> qu2 = new ArrayDeque<Integer>() ;
		for(int i=0 ; i<10 ; i++) { qu1.add(i+10) ; qu2.add(i+50) ; }
		qu1.add(70) ;
		
		/** Creating Queue Objects : Instantiation **/
		Queue qux1 = new ArrayDeque() , qux2 = new PriorityQueue() , qux3 = new LinkedList() ;
		Queue<Integer> qux4 = new ArrayDeque<Integer>() ; // Type-safe instantiation.
		
		/** Common Queue Class Methods are follows (Excluding those which were mentioned before) **/
		/** Method Support From : Collection **/
		/* (1) peek() - This method is used to view the head of queue without removing it. 
			   It returns null if the queue is empty. 
		*/
		System.out.println("The element at the head of the Queue 'qu1' = " + qu1.peek()) ;
		
		/* (2) element() - This method is similar to peek(). It throws NoSuchElementException 
			   when the queue is empty. 
		*/
		System.out.println("The element at the head of the Queue 'qu1' via .element() method = " + qu1.element()) ;		
	
		/* (3) poll() - This method removes and returns the head of the queue. 
			It returns null if the queue is empty. 
		*/
		System.out.println("The element at the head of the Queue 'qu2' just about to be removed = " + qu2.poll()) ;
	}

}
