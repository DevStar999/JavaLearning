package com.company.collectionsmiscellaneous.iterator;

import java.util.* ; 

public class Iterator_Types {

	public static void main(String[] args) {
		/**  There are 3 types of Iterators :
		 	(1) Enumeration (Only applicable to legacy collections i.e. Vectors and Hash-tables.)
			(2) Iterator (The universal iterator applicable for any collection.)
			(3) ListIterator (Only applicable for List collections.)
		**/
		
		// (1) Enumeration.
		Vector vec = new Vector() ;
		Enumeration e1 = vec.elements() ; // Enumeration for Vector.
		
		Hashtable<String,Integer> ht = new Hashtable<String,Integer>() ;
		Enumeration<String> e2 = ht.keys() ; // Enumeration for Hash-table.
		
		// (2) Iterator (Universal Iterator for any collection).
		Set<Character> s = new HashSet<Character>() ;
		Iterator it1 = s.iterator() ; // Iterator for Set 's'.
		
		// (3) ListIterator.
		List<Double> lt = new ArrayList<Double>() ;
		ListIterator lit = lt.listIterator() ; // ListIterator for List 'lt' .
	}

}
