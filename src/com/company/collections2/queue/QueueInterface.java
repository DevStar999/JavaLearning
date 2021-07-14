package com.company.collections2.queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterface {
    public static void main(String[] args) {
        Queue<Integer> queue1 = new ArrayDeque<>();
        Queue<Integer> queue2 = new ArrayDeque<>();
        for (int i = 0; i < 10; i++) {
            queue1.add(i + 10);
            queue2.add(i + 50);
        }
        queue1.add(70);

        /** Creating Queue Objects : Instantiation **/
        Queue queue3 = new ArrayDeque(), queue4 = new PriorityQueue(), queue5 = new LinkedList();
        Queue<Integer> queue6 = new ArrayDeque<>(); // Type-safe instantiation.

        /** Common Queue Class Methods are follows (Excluding those which were mentioned before) **/
        /** Method Support From : Collection **/
		/* (1) peek() - This method is used to view the head of queue without removing it. 
			   It returns null if the queue is empty. 
		*/
        System.out.println("The element at the head of the Queue 'queue1' = " + queue1.peek());
		
		/* (2) element() - This method is similar to peek(). It throws NoSuchElementException 
			   when the queue is empty. 
		*/
        System.out.println("The element at the head of the Queue 'queue1' via .element() method = " + queue1.element());
	
		/* (3) poll() - This method removes and returns the head of the queue. 
			It returns null if the queue is empty. 
		*/
        System.out.println("The element at the head of the Queue 'queue2' just about to be removed = " + queue2.poll());
    }
}
