package com.company.collectionsmiscellaneous.legacy;

import java.util.* ;

public class Stack_Class {

	public static void main(String[] args) {
		 // The following is the only default constructor which creates an empty stack. 
		Stack<Integer> sk = new Stack<Integer>() ;
		
		/** Common Stack Class Methods are follows **/
		/** Method Support From : Collection, List   **/		
		/* (1) Object push(Object element) - Pushes an element on the top of the stack. */
		sk.push(20) ; sk.push(19) ; sk.push(18) ; sk.push(17) ; sk.push(16) ; sk.push(100) ;
		
		/* (2) Object pop() - Removes and returns the top element of the stack. An �EmptyStackException� 
			   exception is thrown if we call pop() when the invoking stack is empty. 
		*/
		sk.pop() ;
		
		/* (3) Object peek() - Returns the element on the top of the stack, but does not remove it. */
		System.out.println("The element currently at the top of the stack 'sk' = " + sk.peek()) ;
		
		/* (4) boolean empty() - Returns 'true' if nothing is on the top of the stack. Else, returns 'false'. */
		System.out.println("Currently, the stack 'sk' is empty : " + sk.empty()) ;
		
		/* (5) int search(Object element) - It determines whether an object exists in the stack. 
			   If the element is found, it returns the position of the element from the top of the stack. 
			   Else, it returns -1.[ Note : it return 1 for top and son on after that. ]
		*/
		System.out.println("The distance of '19' from the top in the stack 'sk' = " + sk.search(19));
	}

}
