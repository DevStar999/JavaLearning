package com.company.java_collections_2;

import java.util.* ;

public class Map_Interface {

	// Iterating over the map using 'for-each' and 'keySet'.
	public static <T1,T2> void print_map1( Map<T1,T2> mp ) {
		System.out.println("The elements of the map are as follows :") ;
		for(T1 el : mp.keySet()) {
			System.out.println(el + " -> " + mp.get(el)) ;
		}
		System.out.println() ;
	}
	
	// Iterating over the map using 'for-each' and 'entrySet'.
	public static <T1,T2> void print_map2( Map<T1,T2> mp ) {
		System.out.println("The elements of the map are as follows :") ;
		for(Map.Entry<T1, T2> el : mp.entrySet()) {
			System.out.println( el.getKey() +  " -> " + el.getValue() ) ;
		}
		System.out.println() ;
	}
	
	public static void main(String[] args) {
		Map<Integer,String> mp1 = new TreeMap() ;
		Map<Integer,String> mp2 = new TreeMap() ;
		Map<Integer,String> mp3 = new TreeMap() ;
		Map<Integer,String> use_map = new TreeMap() ;
		for(int i=0 ; i<5 ; i++) { 
			mp1.put(i+10, "Map1_Value") ; mp2.put(i+25, "Map2_Value") ; use_map.put(i+100, "UseMap_Value") ; 
			mp3.put(i+400, "Map3_Value") ;
		}
		mp1.put(3000, "Map1_Extra_Value") ; mp1.put(700, "Map1_Extra_Value") ; mp1.put(80, "Map1_Extra_Value") ;
		mp2.put(60, "Map2_Extra_Value") ;
		
		/** Creating Map Objects : Instantiation **/
		Map mpx1 = new TreeMap() , mpx2 = new HashMap() , mpx3 = new Hashtable() , mpx4 = new LinkedHashMap() ;
		Map<Integer,String> mpx5 = new TreeMap() ; // Type-safe instantiation.
		
		/** Common Map Interface Methods are follows **/
		/* (1) put(Object key, Object value) - This method is used to insert an entry in this map. */
		use_map.put(200, "UseMap_Value") ;
		
		/* (2) putAll(Map map) - This method is used to insert the specified map in this map. */
		mp3.putAll(use_map) ;
		
		/* (3) remove(Object key) - This method is used to delete an entry for the specified key and
		 	   and returns the value of the key if present else returns null.
		*/
		mp1.remove(3000) ;
		
		/* (4) get(Object key) - This method is used to return the value for the specified key 
		 	   and null if the key is not present. 
		*/
		System.out.println("The value corresponding the key '12' in the Map 'mp1' = " + mp1.get(12)) ;
		
		/* (5) containsKey(Object key) - This method return 'true' if the specified key is in this map. */
		System.out.println("The key '14' is present in Map 'mp1' : " + mp1.containsKey(14)) ;

		/* (6) containsValue(Object value) - This method return 'true' if the specified value is in this map. */
		System.out.println("The value \"Map1_Value\" is present in Map 'mp1' : " + 
		mp1.containsValue("Map1_Value")) ;		
		
		/* (7)  keySet() - This method is used to return the Set view containing all the keys. */
		Set keySet_mp1 = mp1.keySet() ;

		/* (8) entrySet() - This method is used to return the Set view containing all the keys and values. */
		Set< Map.Entry<Integer,String> > entrySet_mp1 = mp1.entrySet() ;
		Iterator it = entrySet_mp1.iterator() ;
		/* 	Here, we are traversing over the entries of the Map 'mp1' after collecting the entrySet in a Set
		 	using an iterator.
		 */
		System.out.println("\nThe elments of the Map traversed via Set view from entrySet() are as follows :") ;
		while( it.hasNext() ) {
			Map.Entry<Integer,String> el = (Map.Entry<Integer,String>)it.next() ;
			System.out.println( el.getKey() + " -> " + el.getValue() ) ;
		}
		System.out.println() ;
	}

}
