package com.company.rough;

import java.util.* ;
import java.math.* ;

public class rough25 {
	
	public static void print_vector( Vector<Integer> vec ){
		System.out.println("The elements of the vector are displayed as follows :") ;
		for(int i=0 ; i<vec.size() ; i++) {
			System.out.print( vec.elementAt(i) + " " ) ;
		}
		System.out.println() ;
	}
	
	public static void show_capacity( Vector<Integer> vec ) {
		System.out.println( "capacity = " + vec.capacity() );
	}

	public static void main(String[] args) {
		Vector<Integer> vec  = new Vector<Integer>(3) ;
		vec.addElement(12); vec.addElement(12); vec.addElement(12); vec.addElement(12); vec.addElement(12);
		vec.addElement(12); vec.addElement(12); vec.addElement(12); 		
		vec.addElement(12); vec.addElement(12); vec.addElement(12); vec.addElement(12); vec.addElement(12);
		vec.addElement(12); vec.addElement(12); vec.addElement(12); 		
		print_vector( vec ) ;
		show_capacity( vec ) ;
	}
	
}
