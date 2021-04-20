package com.company.java_collections_2;

import java.util.* ;

public class LinkedHashMap_Class {

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
		LinkedHashMap<Integer,String> lhmp1 = new LinkedHashMap() ;
		LinkedHashMap<Integer,String> lhmp2 = new LinkedHashMap() ;
		LinkedHashMap<Integer,String> fill_up = new LinkedHashMap() ;
		for(int i=0 ; i<5 ; i++) {  
			lhmp1.put(i+10, "Map1_Value") ; lhmp2.put(i+25, "Map2_Value") ;  
			fill_up.put(i+60, "FillUp_Value") ;
		}
		lhmp1.put(3000, "Map1_Extra_Value") ; lhmp1.put(700, "Map1_Extra_Value") ; 
		lhmp1.put(80, "Map1_Extra_Value") ;
		lhmp2.put(60, "Map2_Extra_Value") ;

		/** Constructors for LinkedHashMap Class **/
		/** Method Support From : Map, HashMap **/		
		/* (1) LinkedHashMap() - This is used to construct a default LinkedHashMap constructor. */
		LinkedHashMap<Integer,String> lhmpx1 = new LinkedHashMap() ;
		
		/* (2) LinkedHashMap(int capacity) - It is used to initialize a particular 
		 	   LinkedHashMap with a specified capacity. 
		*/
		LinkedHashMap<Integer,String> lhmpx2 = new LinkedHashMap(16) ;		
	
		/* (3) LinkedHashMap(Map m_a_p) - It is used to initialize a particular LinkedHashMap with 
			   the elements of the specified map. 
		*/
		LinkedHashMap<Integer,String> lhmpx3 = new LinkedHashMap(fill_up) ;
		
		/* (4) LinkedHashMap(int capacity, float fillRatio) - It is used to initialize both the capacity 
			   and fill ratio for a LinkedHashMap. 
		*/
		LinkedHashMap<Integer,String> lhmpx4 = new LinkedHashMap(16, (float)0.75) ;
		
		/* (5) LinkedHashMap(int capacity, float fillRatio, boolean Order) - This constructor is also used 
		 	   to initialize both the capacity and fill ratio for a LinkedHashMap along with whether 
		 	   to follow the insertion order or not. 
		*/
		LinkedHashMap<Integer,String> lhmpx5 = new LinkedHashMap(16, (float)0.75 , true) ;
		
		/** Common LinkedHashMap Class Methods are follows (Excluding those which were mentioned before) **/	
		/* (1) protected boolean removeEldestEntry(Map.Entry eldest) - The method is used to return true 
			   when the map removes its eldest entry from the map. 
		*/
        LinkedHashMap<Integer, String> li_hash_map =  
        new LinkedHashMap<Integer, String>() { 
            protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) { return size() > 10 ;  } 
        };	
        
        /* (2) getOrDefault​(Object key,Object defaultValue) - This method returns the value to which the 
         	   specified key is mapped, or defaultValue if this map contains no mapping for the key. 
        */
        lhmp2.getOrDefault(12, "Map1_Default_Value") ;
        
        /* (3) values​() - This method returns a Collection view of the values contained in this map. */
        Collection col = lhmp2.values() ;
	}

}
