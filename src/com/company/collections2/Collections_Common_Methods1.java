package com.company.collections2;

import java.util.* ;

public class Collections_Common_Methods1 {
	
	public static void print_collection( Collection<Integer> col ) {
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
		
		/** Common Collecion's Methods are follows (Part 1) **/
		/* (1.a) add(int val) - Appends the specified element to the end of this list.  */
		lt1.add(11) ;
		/* (1.b) add(int index , Object ob) - Inserts the specified element at the 
				 specified position in this list. Shifts the element currently 
				 at that position(if any) and any subsequent elements to the 
				 right (adds one to their indices). 
		*/
		lt1.add(lt1.size() , 100) ; // Range of Index - [0 , collection.size()].

		/* (2.a) addAll(Collection c) - Appends all of the elements in the specified collection to the end of
		   		 this list, in the order that they are returned by the specified collection's 
		   		 iterator. 
		*/
		lt2.addAll(lt3) ;
		/* (2.b) addAll(int index, Collection c) - Inserts all of the elements in the specified collection into 
		    	 this list at the specified position. Shifts the element currently at 
		    	 that position (if any) and any subsequent elements to the right (increases their indices).
		*/
		lt2.addAll(3, lt3) ;

		/* (3) size() - Returns the number of elements in this list. */
		System.out.println("The number of elements in the list 'lt2' = " + lt2.size()) ;
		
		/* (4) clear() - Removes all of the elements from this list. */
		lt4.clear() ;
		
		/* (5) isEmpty() - Returns 'true' if there are no elements in the list. */
		System.out.println("The list 'lt4' is empty : " + lt4.isEmpty()) ;
	}

}
