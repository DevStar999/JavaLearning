package com.company.java_collections;

import java.util.* ;

public class Set_DS {

	public static void main(String[] args) {
		String words[] = {"one", "two", "three", "four", "two"} ;
		List<String> l = Arrays.asList(words) ;
		
		System.out.printf("%s ", l) ;
		System.out.println() ;
		
		Set<String> s = new HashSet<String>(l) ;

		System.out.printf("%s ", s) ;
		System.out.println() ;		
	}

}
