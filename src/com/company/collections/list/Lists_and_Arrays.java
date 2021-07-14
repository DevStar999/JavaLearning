package com.company.collections.list;

import java.util.* ;

public class Lists_and_Arrays {

	public static void main(String[] args) {
		String words[] = {"one", "two", "three", "four"} ;
		LinkedList<String> l = new LinkedList<String>( Arrays.asList(words) ) ;
		
		l.add("last_element") ;
		l.addFirst("first_element") ;
		
		System.out.println("The list is printed as follows :") ;
		for(String str:l) {
			System.out.print(str + " ") ;
		}
		System.out.println() ;
		
		words = l.toArray( new String[l.size()] ) ;
		System.out.println("The array is printed as follows :") ;
		for(String str:words) {
			System.out.print(str + " ") ;
		}
		System.out.println() ;
	}

}
