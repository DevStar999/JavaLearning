package com.company.java_collections_2;

import java.util.* ;

public class Vector_Class {
	
	public static void print_vector( Vector<Integer> vec ) {
		System.out.println("The elements of the Vector are as follows : ") ;
		for(int i=0 ; i<vec.size() ; i++) {
			System.out.print( vec.get(i) + " ") ;
		}
		System.out.println() ;
	}

	public static void main(String[] args) {
		ArrayList<Integer> lt1 = new ArrayList<Integer>() ;
		Vector<Integer> vec1 = new Vector<Integer>() ;
		Vector<Integer> vec2 = new Vector<Integer>() ;
		for(int i=0 ; i<10 ; i++) { vec1.add(i) ; lt1.add(i+10) ; vec2.add(i+50) ; }
		
		/** Constructors for Vector Class **/
		/* (1) Vector() - Creates a default vector of initial capacity is 10. */
		Vector<Integer> vt1 = new Vector<Integer>() ;
		
		/* (2) Vector(int size) - Creates a vector whose initial capacity is specified by size. */
		Vector<Integer> vt2 = new Vector<Integer>(10) ;
		
		/* (3) Vector(int size, int incr) - Creates a vector whose initial capacity is specified 
			   by size and increment is specified by incr. It specifies the number of elements to 
			   allocate each time that a vector is resized upward. 
		*/
		Vector<Integer> vt3 = new Vector<Integer>(20,2) ;		
	
		/* (4) Vector(Collection c) - Creates a vector that contains the elements of collection c. */
		Vector<Integer> vt4 = new Vector<Integer>(lt1) ;
		
		/** Common Vector Class Methods are follows (Excluding those which were mentioned before) **/
		/** Method Support From : Collection, List   **/
		/* (1) clone() - This method returns a shallow copy of this vector. */
		Vector<Integer> vec1_copy = (Vector<Integer>)vec1.clone() ;

		/* (2) toString() - The 'toString()' method is used to return a string representation 
			   of this Vector, containing the String representation of each element. 
		*/
		System.out.println("The string representation of 'vec1' is as follows :\n" + vec1.toString()) ;
		
		/* (3) setSize(int newSize) - This method sets the size. */
		vt1.setSize(7) ;
				
		/* (4) retainAll(Collection c) - This method retains only the elements in this Vector that are 
			   contained in the specified Collection. 
		*/
		vec1_copy.retainAll(vec1) ;
		
		/* (5) int capacity() - This method returns the current capacity of this vector. */
		System.out.println("The capacity of 'vec2' = " + vec2.capacity()) ;
	}

}
