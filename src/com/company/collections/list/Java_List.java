package com.company.collections.list;

import java.util.* ;

public class Java_List {

	public static void main(String[] args) {
		String words1[] = {"duck", "luck", "boy" , "girl"} ;
		List<String> l1 = new ArrayList<String>( Arrays.asList(words1) ) ; 		
//		for(String str: words1) { l1.add(str) ; }
	
		System.out.println("The elements of the list are as follows :") ;
		for(int i=0 ; i<l1.size() ; i++) {
			System.out.print( l1.get(i) + " " ) ;
		}
		
		String words2[] = {"duck", "luck"} ;
		List<String> l2 = new ArrayList<String>() ; 		
		for(String str: words2) { l2.add(str) ; }		
		
		make_unique(l1,l2) ;
		
		System.out.println("\nThe elements of the list 'l1' not in 'l2' are as follows :") ;
		for(int i=0 ; i<l1.size() ; i++) {
			System.out.print( l1.get(i) + " " ) ;			
		}
	}

	public static void make_unique(List<String> l1 , List<String> l2) {
		Iterator<String> it = l1.iterator() ;
		while( it.hasNext() ) {
			if( l2.contains( it.next() ) ) {
				it.remove() ;
			}
		}
	}
	
}
