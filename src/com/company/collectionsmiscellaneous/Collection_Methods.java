package com.company.collectionsmiscellaneous;

import java.util.* ;

public class Collection_Methods {

	public static void print_list( List<Integer> l ) {
		System.out.println("The list is printed as follows :") ;
		for( Integer i : l ) {
			System.out.print( i + " " ) ;			
		}
		System.out.println() ;
	}
	
	public static void main(String[] args) {
		Integer values1[] = {23 , 45 , 63 , 41 , 5} ;
		List<Integer> l1 = Arrays.asList( values1 ) ;
		print_list( l1 ) ;
		
		List<Integer> rev = new ArrayList<Integer>(l1) ;
		Collections.reverse(rev) ;
		print_list( rev ) ;
		
		List<Integer> l1_copy = Arrays.asList( new Integer[5] ) ;
		Collections.copy(l1_copy, l1) ;
		print_list( l1_copy ) ;

		/*	The 'Collections.fill( collection , element )' will replace the every element of 'collection' with
 			'element' .
		*/
		Collections.fill( l1 , 100 ) ;
		print_list( l1 ) ;
		
		/* 	The 'Collections.addAll( collection , array )' will add all the elements in array to collections 
		  	at it's end.
		*/
		Integer values2[] = {27 , 42 , 67 , 44 , 5} ;
		ArrayList<Integer> alist = new ArrayList<Integer>( Arrays.asList(values1) ) ;
		Collections.addAll( alist , values2 ) ;
		print_list( alist ) ;
		
		/* 	The 'Collections.frequency( collection , object )' will give the frequency of the object 
			in the collection.
		*/
		System.out.println("The frequency of '44' in 'alist' = " + Collections.frequency( alist , 100 ) ) ;
		
		/* 	The 'Collections.disjoint( collection1 , collection2 )' will return 'true' if these two collections
			have nothing in common else it will return 'false'.
		*/
		if( Collections.disjoint( l1 , l1_copy ) ) {
			System.out.println("These two collections have nothing in commmon.") ;
		}
		else {
			System.out.println("These two collections must have something in commmon.") ;			
		}
	
		Collections.sort(alist) ;
		System.out.println("The ArrayList 'alist' is printed as follows :") ;
		for(int i=0 ; i<alist.size() ; i++) {
			System.out.print( alist.get(i) + " " ) ;
		}
		System.out.println( ) ;
	}

}
