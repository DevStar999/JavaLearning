package com.company.java_collections_2;

import java.util.* ;

public class List_Interface {

	public static void print_collection( Collection<Integer> col ) {
		System.out.println("The elements of the collection are as follows :") ;
		for(Integer el : col) {
			System.out.print(el + " ") ;
		}
		System.out.println() ;
	}

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<Integer>() ;
		for(int i=0 ; i<10 ; i++) { l1.add(i+5) ; }
		l1.add(9) ;
		
		/** Creating List Objects : Instantiation **/
		List ls2 = new ArrayList() , ls3 = new LinkedList() , ls4 = new Stack() , ls5 = new Vector() ;
		List<Character> ls6 = new ArrayList<Character>() ; // Type-safe instantiation.
		
		/** Common List Interface Methods are follows (Excluding those from Collection's Common Methods) **/
		/** Method Support From : Collection **/
		// (I) Positional Access.
		/* (1) get(int index) - This method returns element at the specified index. */
		System.out.println("The element in 'l1' at index 1 = " + l1.get(1)) ;
		
		/* (2) set(int index, Object new_value) - This method replaces element at given index with new element. 
			   This function returns the element which was just replaced by new element. 
		*/ 
		l1.set(3, 100) ;
		
		// (II) Search.
		/* (1) indexOf(Object ob) - This method returns first occurrence of given element or -1 if 
			   element is not present in list. 
		*/
		System.out.println("The 1st occurrence of '9' in 'l1' is at index = " + l1.indexOf(9)) ;
		
		/* (2) lastIndexOf(Object ob) - This method returns the last occurrence of given element or -1 if 
			   element is not present in list. 
		*/
		System.out.println("The last occurrence of '9' in 'l1' is at index = " + l1.lastIndexOf(9)) ;	
		
		// (III) Iteration - A ListIterator object is used to iterate over a list elements. 
		ListIterator<Integer> lit = l1.listIterator() ;
		
		// (IV) Range-View.
		/* (1) subList(int start, int end) - This method returns List view of specified List 
		       between start(inclusive) and end(exclusive). 
		*/
		List<Integer> sub_l1 = l1.subList(2,5) ; // It will return the sublist from index 2 to 4(both inclusive).
	}	
	
}
