package com.company.java_collections_2;

import java.util.* ; 
 
public class HashSet_Class {

	public static void main(String[] args) {
		HashSet<Integer> hs1 = new HashSet<Integer>() ;
		HashSet<Integer> hs2 = new HashSet<Integer>() ;
		List<Integer> lt = new ArrayList<Integer>() ;
		for(int i=0 ; i<10 ; i++) { hs1.add(i+50) ; hs2.add(i+300) ; lt.add(i+2000) ; } 
		hs1.add(12) ;			

		/** Constructors for HashSet Class **/
		/* (1) HashSet() - Default initial capacity is 16 and default load factor is 0.75. */
		HashSet<Integer> hsx1 = new HashSet<Integer>() ;
		
		/* (2) HashSet(int initialCapacity) - Default loadFactor of 0.75 */
		HashSet<Integer> hsx2 = new HashSet<Integer>(20) ;

		/* (3) HashSet(int initialCapacity, float loadFactor) - Initializes the HashSet with 
			   the specified values. 
		*/
		HashSet<Integer> hsx3 = new HashSet<Integer>(20,(float)0.75) ;
		
		/* (4) HashSet(Collection C) - This constructor is used when any conversion is needed from 
			   any Collection object to HashSet object. 
		*/
		HashSet<Integer> hsx4 = new HashSet<Integer>(lt) ;
		
		/** All methods of HashSet are mentioned previously. **/
		/** Method Support From : Collection, Set **/
	}

}
