package com.company.collections.set;

import java.util.* ;

public class LinkedHashSet_Class {

	public static void main(String[] args) {
		LinkedHashSet<Integer> lhs1 = new LinkedHashSet<Integer>() ;
		LinkedHashSet<Integer> lhs2 = new LinkedHashSet<Integer>() ;
		List<Integer> lt = new ArrayList<Integer>() ;
		for(int i=0 ; i<10 ; i++) { lhs1.add(i+50) ; lhs2.add(i+300) ; lt.add(i+2000) ; } 
		lhs1.add(12) ;			

		/** Constructors for LinkedHashSet Class **/
		/** Method Support From : Set, HashSet **/
		/* (1) LinkedHashSet() - This constructor is used to create a default HashSet. */
		LinkedHashSet<Integer> lhsx1 = new LinkedHashSet<Integer>() ;
		
		/* (2) LinkedHashSet(Collection c) - Used in initializing the HashSet with the elements of 
		 	   the collection c. 
		*/
		LinkedHashSet<Integer> lhsx2 = new LinkedHashSet<Integer>(lt) ;
	
		/* (3) LinkedHashSet(int size) - Used to initialize the size of the LinkedHashSet with the 
			   integer mentioned in the parameter. 
		*/
		LinkedHashSet<Integer> lhsx3 = new LinkedHashSet<Integer>(20) ;
		
		/* (4) LinkedHashSet(int capacity, float fillRatio) - Can be used to initialize both the capacity 
			   and the fill ratio, also called the load capacity of the LinkedHashSet with the arguments 
			   mentioned in the parameter. When the number of elements exceeds the capacity of the hash 
			   set is multiplied with the fill ratio thus expanding the capacity of the LinkedHashSet. 
		*/
		LinkedHashSet<Integer> lhsx4 = new LinkedHashSet<Integer>(20,(float)0.75) ;
		
		/** All methods of LinkedHashSet are mentioned previously. **/
	}

}
