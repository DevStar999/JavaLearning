package com.company.java_collections;

import java.util.* ;

public class Stack_DS {
	public static void print_stack(Stack<Integer> stk) {
		if( stk.isEmpty() ) {
			System.out.println("The stack is empty") ;
		}
		else {
			System.out.printf("%s TOP\n", stk) ;
		}
	}
	
	public static void main(String[] args) {
		Stack<Integer> stk = new Stack<Integer>() ;
		
		// Adding elements to the stack.
		stk.push(1) ; print_stack(stk) ;
		stk.push(2) ; print_stack(stk) ;
		stk.push(3) ; print_stack(stk) ;

		// Removing elements from the stack.
		stk.pop() ; print_stack(stk) ;
		stk.pop() ; print_stack(stk) ;
		stk.pop() ; print_stack(stk) ;	
	}

}
