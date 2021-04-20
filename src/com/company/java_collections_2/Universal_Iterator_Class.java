package com.company.java_collections_2;

import java.util.* ;

public class Universal_Iterator_Class {

	public static void main(String[] args) {
		List<Integer> lt = new ArrayList<Integer>() ;
		for(int i=0 ; i<10 ; i++) { lt.add(i) ; }
		
		// Instantiating the Universal 'Iterator' for the above List.
		Iterator it1 = lt.iterator() ;
		
		/** Commonly used methods of 'Iterator' class. **/
		/* 	(1) hasNext() - Returns 'true' if the iteration has more elements or-else 'false'.
			(2) next() - Returns the next element in the iteration else throws an exception.
		*/
		System.out.println("The elements of the List 'lt' are as follows :") ;
		while( it1.hasNext() ) {
			System.out.print( it1.next() + " " ) ;
		} System.out.println() ;
		
		/* (3) 	remove() - 	Removes from the underlying collection, the last element returned by 'this' 
							iterator (optional operation). This method can be called
							only once per call to next() method. 
		*/
		it1.remove() ; // Removing the element '9' from the List.
		
		/* (4) 	equals() - 	Indicates whether given object is equal to 'this' one and returns 'true' 
		 					or 'false' accordingly. 
		 */
		it1 = lt.iterator() ;
		System.out.println("Iterator pointing at 0 : " + it1.next().equals(0)) ;
	}	
	
}
