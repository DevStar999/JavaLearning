package com.company.collections2.queue;

import java.util.* ;

public class PriorityQueue_DS {

	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<String>() ;
		
		// Adding elements to the queue.
		pq.offer("first") ; pq.offer("second") ; pq.offer("third") ;
		System.out.printf("%s ", pq) ;
		
		// Peeking at the front element of the queue.
		System.out.printf("TOP = %s\n", pq.peek()) ;
		
		// Removing an element from the queue.
		pq.poll() ;
		System.out.printf("%s ", pq) ;				
	}

}
