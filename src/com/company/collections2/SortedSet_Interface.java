package com.company.collections2;

import java.util.* ; 

class The_Comparator<T extends Comparable<T>> implements Comparator<T> { 
    public int compare(T ob1, T ob2) { 
        return ob2.compareTo(ob1) ; 
    } 
}

public class SortedSet_Interface {

	public static <T> void print_set( Set<T> s ) {
		for(T el : s) { System.out.print(el + " ") ; }
		System.out.println() ;
	}	
	
	public static void main(String[] args) {
		SortedSet<Integer> ss1 = new TreeSet<Integer>() ;
		SortedSet<Integer> ss2 = new TreeSet<Integer>( new The_Comparator() ) ;
		SortedSet<Integer> ss3 = new TreeSet<Integer>() ;
		for(int i=0 ; i<10 ; i++) { ss1.add(i+50) ; ss2.add(i+20) ; ss3.add(i+300) ; } 
		ss1.add(12) ;		
		
		/** Creating SortedSet Objects : Instantiation **/
		SortedSet ssx1 = new TreeSet() ;
		SortedSet<Integer> ssx2 = new TreeSet() ; // Type-safe instantiation.		
		
		/** Common SortedSet Interface Methods are follows (Excluding previous Methods) **/
		/** Method Support From : Collection, Set **/
		/* (1) comparator() - Returns the comparator used to order the elements in this set, 
			   or null if this set uses the natural ordering of its elements. 
		*/
		Comparator comp = ss2.comparator() , comp_rev = comp.reversed() ;
		/* Note - We can easily use the reverse comparator for changing the ordering of the elements using
		 		  the reversed() function of the comparator.
		*/

		/* (2) first() - Returns the first (lowest) element currently in this set. */
		System.out.println("The lowest element in the Set 'ss1' = " + ss1.first()) ;

		/* (3) last() - Returns the last (highest) element currently in this set. */
		System.out.println("The highest element in the Set 'ss1' = " + ss1.last()) ;
		
		/* (4) headSet(Object ob) - Returns a view of the portion of this set whose elements are strictly 
			   less than ob. 
		*/
		SortedSet<Integer> before304 = ss3.headSet(304) ;
		System.out.println("\nThe elements in 'ss3' before the value 304 are as follows :") ;
		print_set( before304 ) ;

		/* (5) tailSet(Object ob) - Returns a view of the portion of this set whose elements are 
			   greater than or equal to ob.
		*/
		SortedSet<Integer> from304 = ss3.tailSet(304) ;
		System.out.println("\nThe elements in 'ss3' from the value 304 are as follows :") ;
		print_set( from304 ) ;	
		
		/* (6) subSet(Object from, Object to) - Returns a view of the portion of this set whose elements 
			   range from 'from'(inclusive) to 'to'(exclusive).
		*/
		SortedSet<Integer> from304to308 = ss3.subSet(304,308) ;
		System.out.println("\nThe elements in 'ss3' from the value 304(inclusive) to 308(exclusive) "
						   + "are as follows :") ;
		print_set( from304to308 ) ;			
	}

}
