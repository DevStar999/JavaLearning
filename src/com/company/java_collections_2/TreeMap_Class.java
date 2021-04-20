package com.company.java_collections_2;

import java.util.* ;

public class TreeMap_Class {

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
		TreeMap<Integer,String> tmp1 = new TreeMap() ;
		TreeMap<Integer,String> tmp2 = new TreeMap() ;
		TreeMap<Integer,String> fill_up = new TreeMap() ;
		SortedMap<Integer,String> smp = new TreeMap() ;
		for(int i=0 ; i<5 ; i++) {  
			tmp1.put(i+10, "Map1_Value") ; tmp2.put(i+25, "Map2_Value") ;  
			fill_up.put(i+60, "FillUp_Value") ; smp.put(i+400, "SortedMap_Value") ;
		}
		tmp1.put(3000, "Map1_Extra_Value") ; tmp1.put(700, "Map1_Extra_Value") ; tmp1.put(80, "Map1_Extra_Value") ;
		tmp2.put(60, "Map2_Extra_Value") ;

		/** Constructors for TreeMap Class **/
		/* (1) TreeMap() - Constructs an empty tree map that will be sorted by using the natural 
			   order of its keys. 
		*/
		TreeMap<Integer,String> tmpx1 = new TreeMap() ;
		
		/* (2) TreeMap(Comparator comp) - Constructs an empty tree-based map that will be sorted by using 
		 	   the Comparator comp. 
		*/
		TreeMap<Integer,String> tmpx2 = new TreeMap( ((new TreeMap()).comparator()).reversed() ) ;
		// Created a TreeMap with Descending ordering of keys.
		
		/* (3) TreeMap(Map m) - Initializes a tree map with the entries from 'm', which will be sorted 
		       by using the natural order of the keys. 
		*/
		TreeMap<Integer,String> tmpx3 = new TreeMap(fill_up) ;
		
		/* (4) TreeMap(SortedMap sm) - Initializes a tree map with the entries from 'sm', which will be 
			   sorted in the same order as sm. 
		*/
		TreeMap<Integer,String> tmpx4 = new TreeMap(smp) ;
		
		/** Common TreeMap Class Methods are follows (Excluding those which were mentioned before) **/
		/** Method Support From : Map, SortedMap, NavigableMap   **/
		/* (1) Object clone() - The method returns a shallow copy of this TreeMap. */
		TreeMap<Integer,String> tmp1_copy = (TreeMap<Integer,String>)tmp1.clone() ;
	}

}
