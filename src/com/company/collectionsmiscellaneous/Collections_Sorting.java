package com.company.collectionsmiscellaneous;

import java.util.* ;

public class Collections_Sorting {
	
	public static <T> void print_collection( Collection<T> col ) {
		System.out.println("The elements of the Collection are as follows :") ;
		for(T el : col) {
			System.out.print(el + " ") ;
		}
		System.out.println() ;
	}	
	
	public static void main(String[] args) {
		ArrayList<Integer> lt1 = new ArrayList<>() ;
		ArrayList<Integer> lt2 = new ArrayList<>() ;
		for(int i=0 ; i<10 ; i++) { lt1.add(i+10) ; lt2.add(i+55) ; }
		
		System.out.println("After sorting in ascending order in 'lt1'") ;
		Collections.sort(lt1) ;
		print_collection( lt1 ) ;

		System.out.println("\nAfter sorting in descending order in 'lt1'") ;
		Collections.sort(lt1, Collections.reverseOrder()) ;
		print_collection( lt1 ) ;
	}
	
}
