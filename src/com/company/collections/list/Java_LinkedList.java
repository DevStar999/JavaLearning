package com.company.collections.list;

import java.util.* ;

public class Java_LinkedList {

	public static void main(String[] args) {
		String words1[] = {"apples" , "bat" , "cat" , "duck" , "elegent"} ;
		List<String> l1 = new LinkedList<String>() ;
		for(String str : words1) {
			l1.add(str) ;
		}
		
		String words2[] = {"xenon" , "radon" , "krypton" , "duck" , "bat"} ;
		List<String> l2 = new LinkedList<String>() ;
		for(String str : words2) {
			l2.add(str) ;
		}
		
		l1.addAll(l2) ;
		l2 = null ;
		
		print_list(l1) ;
		remove_from_list(l1, 3, 5) ;
		print_list(l1) ;
		reverse_list(l1) ;
	}
	
	public static void print_list(List<String> l1) {
		for(String str:l1) {
			System.out.print(str + " ") ;
		}
		System.out.println() ;
	}

	public static void remove_from_list(List<String> l, int start , int end) {
		(l.subList(start, end)).clear() ;
	}

	public static void reverse_list(List<String> l) {
		ListIterator<String> lit = l.listIterator(l.size()) ;
		while( lit.hasPrevious() ) {
			System.out.print(lit.previous() + " ") ;		
		}
		System.out.println() ;
	}
}
