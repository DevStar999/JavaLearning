package com.company.collections.set;

import java.util.* ;

public class Set_Interface {

	public static <T> void print_set( Set<T> s ) {
		for(T el : s) { System.out.print(el + " ") ; }
		System.out.println() ;
	}

	public static void main(String[] args) {
		Set<Integer> se1 = new TreeSet<Integer>() ;
		Set<Integer> a = new TreeSet<Integer>() ;
		Set<Integer> b = new TreeSet<Integer>() ;
		for(int i=0 ; i<10 ; i++) { se1.add(i+50) ; a.add(i+20) ; b.add(i+25) ; } 
		se1.add(12) ;

		/** Creating Set Objects : Instantiation **/
		Set sx1 = new TreeSet() , sx2 = new LinkedHashSet() , sx3 = new HashSet() ;
		Set<Character> sx4 = new TreeSet<Character>() ; // Type-safe instantiation.		

	
		/** Basic Set Operations **/
		/** Method Support From : Collection **/
		/* (1) Union - Using addAll() method */
		Set<Integer> union = new TreeSet<Integer>(a) ;
		union.addAll(b) ;
		System.out.println("The elements in the union of 'a' and 'b' are follows :") ; 
		print_set(union) ;
		
		/* (2) Intersection - Using retainAll() method */
		Set<Integer> intersection = new TreeSet<Integer>(a) ;
		intersection.retainAll(b) ;
		System.out.println("\nThe elements in the intersection of 'a' and 'b' are follows :") ; 
		print_set(intersection) ;	
		
		/* (3) Difference - Using removeAll() method */
		Set<Integer> difference = new TreeSet<Integer>(a) ;
		difference.removeAll(b) ;
		System.out.println("\nThe elements in the difference of 'a' and 'b' i.e (a-b) are follows :") ; 
		print_set(difference) ;			
	}	
	
}
