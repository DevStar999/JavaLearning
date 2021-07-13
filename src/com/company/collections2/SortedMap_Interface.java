package com.company.collections2;

import java.util.* ; 

public class SortedMap_Interface {
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
		SortedMap<Integer,String> smp1 = new TreeMap() ;
		SortedMap<Integer,String> smp2 = new TreeMap() ;
		for(int i=0 ; i<5 ; i++) {  smp1.put(i+10, "Map1_Value") ; smp2.put(i+25, "Map2_Value") ;  }
		smp1.put(3000, "Map1_Extra_Value") ; smp1.put(700, "Map1_Extra_Value") ; smp1.put(80, "Map1_Extra_Value") ;
		smp2.put(60, "Map2_Extra_Value") ;

		/** Creating SortedMap Objects : Instantiation **/
		SortedMap smpx1 = new TreeMap() ;
		SortedMap<Integer,String> smpx2 = new TreeMap() ; // Type-safe instantiation.
		
		/** Common SortedMap Interface Methods are follows **/
		/** Method Support From : Map **/
		/* (1) subMap(Object fromKey, Object toKey) - Returns a view of the portion of this Map whose 
			   keys range from 'fromKey'(inclusive) to 'toKey'(exclusive). 
		*/
		SortedMap<Integer,String> from11to14 = smp1.subMap(11, 15) ;

		/* (2) headMap(Object toKey) - Returns a view of the portion of this Map whose keys are strictly 
		 	   less than toKey. 
		*/
		SortedMap<Integer,String> lessThan17 = smp1.headMap(17) ;

		/* (3) tailMap(Object fromKey) - Returns a view of the portion of this Map whose keys are 
		 	   greater than or equal to fromKey. 
		*/
		SortedMap<Integer,String> from15onwards = smp1.tailMap(15) ;
		
		/* (4) firstKey() - Returns the first (lowest) key currently in this Map. */
		System.out.println("The lowest key in the SortedMap 'smp1' = " + smp1.firstKey()) ;
		
		/* (5) lastKey() - Returns the last (highest) key currently in this Map. */
		System.out.println("The highest key in the SortedMap 'smp1' = " + smp1.lastKey()) ;
		
		/* (6) comparator() - Returns the Comparator used to order the keys in this Map, or null if 
			   this Map uses the natural ordering of its keys. 
		*/
		Comparator comp = smp2.comparator() ;
		System.out.println("The comparator of the SortedMap 'smp2' = " + comp) ;
		
		/* (7) values​() - Returns a Collection view of the values contained in this map. */
		Collection vals = smp2.values() ; // Will allow duplicate values as well.
		System.out.println("The number of values in the SortedMap 'smp2' = " + vals) ;
	}

}
