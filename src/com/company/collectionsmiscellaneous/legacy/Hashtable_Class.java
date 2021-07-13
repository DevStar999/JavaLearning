package com.company.collectionsmiscellaneous.legacy;

import java.util.* ;

public class Hashtable_Class {

	public static <T1,T2> void print_map1( Map<T1,T2> mp ) {
		System.out.println("The elements of the map are as follows :") ;
		for(T1 el : mp.keySet()) {
			System.out.println(el + " -> " + mp.get(el)) ;
		}
		System.out.println() ;
	}
	
	public static <T1,T2> void print_map2( Map<T1,T2> mp ) {
		System.out.println("The elements of the map are as follows :") ;
		for(Map.Entry<T1, T2> el : mp.entrySet()) {
			System.out.println( el.getKey() +  " -> " + el.getValue() ) ;
		}
		System.out.println() ;
	}		
	
	public static void main(String[] args) {
		Hashtable<Integer,String> ht1 = new Hashtable() ;
		Hashtable<Integer,String> ht2 = new Hashtable() ;
		Map<Integer,String> fill_up = new TreeMap() ;
		for(int i=0 ; i<5 ; i++) {  
			ht1.put(i+10, "Map1_Value") ; ht2.put(i+25, "Map2_Value") ;  
			fill_up.put(i+60, "FillUp_Value") ;
		}
		ht1.put(3000, "Map1_Extra_Value") ; ht1.put(700, "Map1_Extra_Value") ; ht1.put(80, "Map1_Extra_Value") ;
		ht2.put(60, "Map2_Extra_Value") ;		
		
		/** Constructors for Hashtable Class **/
		/* (1) Hashtable() - This is the default constructor. */
		Hashtable<Integer,String> htx1 = new Hashtable() ;
	
		/* (2) Hashtable(int size) - This creates a hash table that has initial size specified by size. */
		Hashtable<Integer,String> htx2 = new Hashtable(16) ;
		
		/* (3) Hashtable(int size, float fillRatio) - This version creates a hash table that has initial 
		 	   size specified by size and fill ratio specified by fillRatio. 
		 	   [ Fill Ratio : Basically it determines how full hash table can be before it is resized upward.
		 	   and its Value lie between 0.0 to 1.0 ] 
		*/
		Hashtable<Integer,String> htx3 = new Hashtable(16, (float)0.75) ;
		
		/* (4) Hashtable(Map m) - This creates a hash table that is initialized with the elements in 'm'. */
		Hashtable<Integer,String> htx4 = new Hashtable(fill_up) ;
		
		/** Common Hashtable Class Methods are follows (Excluding those which were mentioned before) **/
		/** Method Support From : Map **/
		/* (1) clone() - Used to create a shallow copy of this Hashtable. */
		Hashtable<Integer,String> ht1_copy = (Hashtable<Integer,String>)ht1.clone() ;
		
		/* (2) elements() - Returns an enumeration of the values obtained in hash table. */
		Enumeration enum1 = ht1.elements() ;
		
		/* (3) equals(Object ob) - Used to compare specified object with this Map for equality. */
		System.out.println("The Hashtables 'ht1' and 'ht2' are equal : " + ht1.equals(ht2)) ;
		
		/* (4) keys() - Used to get enumeration of the keys contained in the Hashtable. */
		Enumeration enum_keys = ht1.keys() ;
		
		/* (5) toString() - Returns the string equivalent of a Hashtable. */
		System.out.println("The string equivalent of Hashtable 'ht1' = " + ht1.toString()) ;
		
		/* (6) values() - Used to get a Collection view of the values contained in this Hashtable. */
		Collection col = ht1.values() ;
	}

}
