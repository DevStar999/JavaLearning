package com.company.collections2;

import java.util.* ;

public class NavigableSet_Interface {
	
	public static void main(String[] args) {
		NavigableSet<Integer> ns1 = new TreeSet<Integer>() ;
		NavigableSet<Integer> ns2 = new TreeSet<Integer>() ;
		for(int i=0 ; i<10 ; i++) { ns1.add(i+50) ; ns2.add(i+300) ; } 
		ns1.add(12) ;		
		
		/** Iterators for navigation in the NavigableSet . **/
		Iterator forward_iterator = ns1.iterator() ; // For forward iteration.
		Iterator reverse_iterator = ns1.descendingIterator() ; // For backward iteration.
		
		/** Common Navigable Set Interface Methods are follows (Excluding previous Methods) **/
		/** Method Support From : Collection, Set, SortedSet **/
		/* (1) lower(Object e) - Returns the greatest element in this set which is less than the given 
			   element or NULL if there is no such element. 
		*/
		System.out.println("The value of the element in 'ns1' just less than 54 = " + ns1.lower(54)) ;
		
		/* (2) floor(Object e ) - Returns the greatest element in this set which is less than or equal 
			   to given element or NULL if there is no such element. 
		*/
		System.out.println("The value of the element in 'ns1' less than or equal to 54 = " + ns1.floor(54)) ;		
	
		/* (3) ceiling(Object e) - Returns the least element in this set which is greater than or equal 
			   to given element or NULL if there is no such element. 
		*/
		System.out.println("The value of the element in 'ns1' equal to 54 or just greater than = " 
		+ ns1.ceiling(54)) ;				
		
		/* (4) higher(Object e) - Returns the least element in this set which is greater than the 
			   given element or NULL if there is no such element. 
		*/
		System.out.println("The value of the element in 'ns1' just greater than 54 = " + ns1.higher(54)) ;
		
		/* (5) pollFirst() - Retrieve and remove the first least element or return null if 
			   there is no such element. 
		*/
		System.out.println("The least element in 'ns1' which is about to be removed = " + ns1.pollFirst()) ;
	
		/* (6) pollLast() - Retrieve and remove the last highest element ot return null if 
			   there is no such element. 
		*/
		System.out.println("The highest element in 'ns1' which is about to be removed = " + ns1.pollLast()) ;	
	}

}
