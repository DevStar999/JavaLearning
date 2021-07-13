package com.company.collections2;

import java.util.* ;

public class HashMap_Class {

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
		HashMap<Integer,String> hmp1 = new HashMap() ;
		HashMap<Integer,String> hmp2 = new HashMap() ;
		HashMap<Integer,String> fill_up = new HashMap() ;
		for(int i=0 ; i<5 ; i++) {  
			hmp1.put(i+10, "Map1_Value") ; hmp2.put(i+25, "Map2_Value") ;  
			fill_up.put(i+60, "FillUp_Value") ;
		}
		hmp1.put(3000, "Map1_Extra_Value") ; hmp1.put(700, "Map1_Extra_Value") ; hmp1.put(80, "Map1_Extra_Value") ;
		hmp2.put(60, "Map2_Extra_Value") ;

		/** Constructors for HashMap Class **/
		/* (1) HashMap() - It is the default constructor which creates an instance of HashMap 
		 	   with initial capacity 16 and load factor 0.75. 
		*/
		HashMap<Integer,String> hmpx1 = new HashMap() ;		
		
		/* (2) HashMap(int initial_capacity) - It creates a HashMap instance with specified initial 
			   capacity and load factor 0.75. 
		*/
		HashMap<Integer,String> hmpx2 = new HashMap(16) ;
		
		/* (3) HashMap(int initial_capacity, float loadFactor) - It creates a HashMap instance with 
		 	   specified initial capacity and specified load factor. 
		*/
		HashMap<Integer,String> hmpx3 = new HashMap(16,(float)0.75) ;
		
		/* (4) HashMap(Map map) - It creates instance of HashMapwith same mappings as specified map. */
		HashMap<Integer,String> hmpx4 = new HashMap(fill_up) ;
		
		/** Common HashMap Class Methods are follows (Excluding those which were mentioned before) **/
		/** Method Support From : Map **/
		/* (1) clone() - It is used to return a shallow copy of the mentioned hash map. */
		HashMap<Integer,String> hmp1_copy = (HashMap<Integer,String>)hmp1.clone() ;
		
		/* (2) values() - It is used to return a Collection view of the values in the HashMap. */
		Collection col = hmp2.values() ;
	}

}
