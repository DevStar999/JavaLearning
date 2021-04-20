package com.company.java_collections_3;

import java.util.* ;

public class Collections_Swapping {

	public static <T> void print_collection( Collection<T> col ) {
		System.out.println("The elements of the Collection are as follows :") ;
		for(T el : col) {
			System.out.print(el + " ") ;
		}
		System.out.println() ;
	}	
	
	public static void main(String[] args) {
		ArrayList<Integer> lt = new ArrayList<Integer>() ;
		for(int i=0 ; i<10 ; i++) { lt.add(i+10) ; }
		
		System.out.println("Before Swapping at indices 1 and 3 in the Collection 'lt'") ;
		print_collection( lt ) ;

		Collections.swap(lt, 1, 3) ;
		System.out.println("\nAfter Swapping at indices 1 and 3 in the Collection 'lt'") ;
		print_collection( lt ) ;	
	}
	
}
