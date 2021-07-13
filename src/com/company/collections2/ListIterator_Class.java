package com.company.collections2;

import java.util.* ;

public class ListIterator_Class {

	public static void main(String[] args) {
		List<Integer> lt = new ArrayList<Integer>() ;
		for(int i=0 ; i<10 ; i++) { lt.add(i) ; }
	
		// Creating a ListIterator for the above List as follows.
		ListIterator<Integer> lit = lt.listIterator( lt.size() ) ; 
		// Currently iterator is pointing at the end of the list(just after the last element).
				
		/** Additional methods of 'ListIterator' class apart from the methods in 'Iterator' class i.e.
				[i] hasNext() 
				[ii] next() 
				[iii] remove()
				[iv] equals() 
		**/
		/* 	(1) hasPrevious() - Returns 'true' if the iteration has more elements while traversing
		 						from the back of the list or-else 'false'.
			(2) previous() - Returns the previous element in the iteration else throws an exception.
		*/
		System.out.println("The elements of the List 'lt' are as follows (in reverse order) :") ;
		while( lit.hasPrevious() ) {
			System.out.print( lit.previous() + " " ) ;
		} System.out.println() ;
		
		/* 	(3) add() - Inserts the specified element into the list (optional operation). The element is 
		 				inserted immediately before the element that would be returned by 'next()', if any, and 
		 				after the element that would be returned by 'previous()', if any. 
		*/
		lit.add(-1) ;
		
		// Checking the successful insertion of '-1' in the list as follows via printing the List.
		lit = lt.listIterator() ;
		System.out.println("The elements of the List 'lt' are as follows (in reverse order) :") ;
		while( lit.hasNext() ) {
			System.out.print( lit.next() + " " ) ;
		} System.out.println() ;		
	}
		
}
