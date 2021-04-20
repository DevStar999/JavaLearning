package com.company.java_collections_2;

import java.util.* ;

public class NavigableMap_Interface {

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
		NavigableMap<Integer,String> nmp1 = new TreeMap() ;
		NavigableMap<Integer,String> nmp2 = new TreeMap() ;
		for(int i=0 ; i<5 ; i++) {  nmp1.put(i+10, "Map1_Value") ; nmp2.put(i+25, "Map2_Value") ;  }
		nmp1.put(3000, "Map1_Extra_Value") ; nmp1.put(700, "Map1_Extra_Value") ; nmp1.put(80, "Map1_Extra_Value") ;
		nmp2.put(60, "Map2_Extra_Value") ;

		/** Creating SortedMap Objects : Instantiation **/
		NavigableMap nmpx1 = new TreeMap() ;
		NavigableMap<Integer,String> nmpx2 = new TreeMap() ; // Type-safe instantiation.
		
		/** Common NavigableMap Interface Methods are follows **/
		/** Method Support From : Map, SortedMap **/
		/* (1) lowerKey(Object key) - Returns the greatest key strictly less than the given key, or 
		 	   if there is no such key. 
		*/
		System.out.println("The highest value key strictly less '14' in the NavigableMap 'nmp1' = " + 
		nmp1.lowerKey(14)) ;
		
		/* (2) floorKey(Object key) - Returns the greatest key less than or equal to the given key, or 
			   if there is no such key. 
		*/
		System.out.println("The highest value key less than or equal to '14' in the NavigableMap 'nmp1' = " + 
		nmp1.floorKey(14)) ;
		
		/* (3) ceilingKey(Object key) - Returns the least key greater than or equal to the given key, or 
			   if there is no such key. 
		*/
		System.out.println("The lowest value key equal to or greater than '14' in the NavigableMap 'nmp1' = " + 
		nmp1.ceilingKey(14)) ;		
		
		/* (4) higherKey(Object key) - Returns the least key strictly greater than the given key, or if 
			   there is no such key. 
		*/
		System.out.println("The lowest value key greater than '14' in the NavigableMap 'nmp1' = " + 
		nmp1.higherKey(14)) ;

		/* Note : For the above 4 methods the corresponding ".---Entry()" methods will give the complete
		  		  entry in the map i.e. the key-value pair for the obtained key from the specified key.	
		*/
		
		/* (5) descendingMap() - Returns a reverse order view of the mappings contained in this map and the 
		 	   comparator for this map is reversed too.
		*/
		NavigableMap<Integer,String> nmp2_rev = nmp2.descendingMap() ;
	}

}
