package com.company.collectionsmiscellaneous.legacy;

import java.util.Stack;

public class StackClass {
    public static void printStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            System.out.println("The stack is empty");
        } else {
            System.out.printf("%s TOP\n", stack);
        }
    }

    public static void main(String[] args) {
        // The following is the only default constructor which creates an empty stack.
        Stack<Integer> stack1 = new Stack<>();

        /** Common Stack Class Methods are follows **/
        /* (1) Object push(Object element) - Pushes an element on the top of the stack. */
        stack1.push(20);
        stack1.push(19);
        stack1.push(18);
        stack1.push(17);
        stack1.push(16);
        stack1.push(100);
		
		/* (2) Object pop() - Removes and returns the top element of the stack. An �EmptyStackException� 
			   exception is thrown if we call pop() when the invoking stack is empty. 
		*/
        stack1.pop();

        /* (3) Object peek() - Returns the element on the top of the stack, but does not remove it. */
        System.out.println("The element currently at the top of the stack 'stack1' = " + stack1.peek());

        /* (4) boolean empty() - Returns 'true' if nothing is on the top of the stack. Else, returns 'false'. */
        System.out.println("Currently, the stack 'stack1' is empty : " + stack1.empty());
		
		/* (5) int search(Object element) - It determines whether an object exists in the stack. 
			   If the element is found, it returns the position of the element from the top of the stack. 
			   Else, it returns -1.[ Note : it return 1 for top and son on after that. ]
		*/
        System.out.println("The distance of '19' from the top in the stack 'stack1' = " + stack1.search(19));

        /* (6) Checking order in which elements are inserted and removed from a Stack */
        Stack<Integer> stack2 = new Stack<>();

        // Adding elements to the stack.
        stack2.push(1);
        printStack(stack2);
        stack2.push(2);
        printStack(stack2);
        stack2.push(3);
        printStack(stack2);

        // Removing elements from the stack.
        stack2.pop();
        printStack(stack2);
        stack2.pop();
        printStack(stack2);
        stack2.pop();
        printStack(stack2);
    }
}
