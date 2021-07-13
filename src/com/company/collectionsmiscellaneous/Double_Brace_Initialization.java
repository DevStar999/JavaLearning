package com.company.collectionsmiscellaneous;

import java.util.* ;

public class Double_Brace_Initialization {

	public static <T> void print_collection( Collection<T> col ) {
		System.out.println("The elements of the Collection are as follows :") ;
		for(T el : col) {
			System.out.print(el + " ") ;
		}
		System.out.println() ;
	}	
	
	public static void main(String[] args) {
        Set<String> sets = new HashSet<String>() { 
            { add("one") ; add("two") ; add("three") ; } 
        } ;
		
        print_collection( sets ) ;
	}

}
