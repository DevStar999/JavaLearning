package com.company.java_collections_2;

import java.util.* ;
import java.io.* ;

public class Collections_Common_Methods2 {

	public static void print_collection( Collection<Integer> col ) {
		if( col.size() == 0 ) { System.out.println("The list is empty.") ; return ; }
		System.out.println("The elements of the collection are as follows :") ;
		for(Integer el : col) {
			System.out.print(el + " ") ;
		}
		System.out.println() ;
	}
	
	public static void main(String[] args) {
		List<Integer> lt1 = new ArrayList<Integer>() ;
		List<Integer> lt2 = new ArrayList<Integer>() ;
		List<Integer> lt3 = new ArrayList<Integer>() ;
		List<Integer> lt4 = new ArrayList<Integer>() ;
		for(int i=0 ; i<10 ; i++) { lt1.add(i) ; lt2.add(i+10) ; lt3.add(i+200) ; lt4.add(3000+i) ; }
		
		/** Common Collecion's Methods are follows (Part 2) **/
		/* (1) contains(Object ob) - Returns true if this list contains the specified element. */
		lt1.contains(7) ;
		
		/* (2.a) remove(Object ob) - Removes the 1st occurrence of the specified element from this list, 
				 if it is present. 
		*/
		lt2.remove( new Integer(14) ) ; // Removing by value.
		/* (2.b) remove(int index) - Removes the element at the specified position in this list. 
		 		 Shifts any subsequent elements to the left (subtracts one from their indices).
		*/
		lt1.remove(5) ; // Removing by index.

		/* (3) removeAll() - Removes from this list all of its elements that are contained in 
		 	   the specified collection. 
		*/
		lt4.removeAll(lt4) ; // Removing all it's elements from 'lt4'. 
		
		/* (4) equals() - Returns 'true' if the 2 specified collections are equal. */
		System.out.println( "The collections 'lt3' and 'lt4' are equal : " + lt4.equals(lt3) ) ;
		
		/* (5.a) toArray() - Returns an array containing all of the elements in this list in proper sequence. */
		Object[] arr1 = lt3.toArray() ;
		Integer[] arr2 = new Integer[lt2.size()] ;
		/* (5.b) T[] toArray(T[]) - Returns an array containing all of the elements in this list in 
				 proper sequence, the runtime type of the returned array is that of the specified array. 
		*/
		arr2 = lt3.toArray(arr2) ;
	}

}
