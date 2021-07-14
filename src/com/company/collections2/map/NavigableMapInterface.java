package com.company.collections2.map;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapInterface {
    public static <T1, T2> void printMap1(Map<T1, T2> map) {
        System.out.println("The elements of the map are as follows :");
        for (T1 el : map.keySet()) {
            System.out.println(el + " -> " + map.get(el));
        }
        System.out.println();
    }

    public static <T1, T2> void printMap2(Map<T1, T2> map) {
        System.out.println("The elements of the map are as follows :");
        for (Map.Entry<T1, T2> el : map.entrySet()) {
            System.out.println(el.getKey() + " -> " + el.getValue());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        NavigableMap<Integer, String> NavigableMap1 = new TreeMap();
        NavigableMap<Integer, String> NavigableMap2 = new TreeMap();
        for (int i = 0; i < 5; i++) {
            NavigableMap1.put(i + 10, "Map1_Value");
            NavigableMap2.put(i + 25, "Map2_Value");
        }
        NavigableMap1.put(3000, "Map1_Extra_Value");
        NavigableMap1.put(700, "Map1_Extra_Value");
        NavigableMap1.put(80, "Map1_Extra_Value");
        NavigableMap2.put(60, "Map2_Extra_Value");

        /** Creating SortedMap Objects : Instantiation **/
        NavigableMap NavigableMap3 = new TreeMap();
        NavigableMap<Integer, String> NavigableMap4 = new TreeMap(); // Type-safe instantiation.

        /** Common NavigableMap Interface Methods are follows **/
        /** Method Support From : Map, SortedMap **/
		/* (1) lowerKey(Object key) - Returns the greatest key strictly less than the given key, or 
		 	   if there is no such key. 
		*/
        System.out.println("The highest value key strictly less '14' in the NavigableMap 'NavigableMap1' = " +
                NavigableMap1.lowerKey(14));
		
		/* (2) floorKey(Object key) - Returns the greatest key less than or equal to the given key, or 
			   if there is no such key. 
		*/
        System.out.println("The highest value key less than or equal to '14' in the NavigableMap 'NavigableMap1' = " +
                NavigableMap1.floorKey(14));
		
		/* (3) ceilingKey(Object key) - Returns the least key greater than or equal to the given key, or 
			   if there is no such key. 
		*/
        System.out.println("The lowest value key equal to or greater than '14' in the NavigableMap 'NavigableMap1' = " +
                NavigableMap1.ceilingKey(14));		
		
		/* (4) higherKey(Object key) - Returns the least key strictly greater than the given key, or if 
			   there is no such key. 
		*/
        System.out.println("The lowest value key greater than '14' in the NavigableMap 'NavigableMap1' = " +
                NavigableMap1.higherKey(14));

		/* Note : For the above 4 methods the corresponding ".---Entry()" methods will give the complete
		  		  entry in the map i.e. the key-value pair for the obtained key from the specified key.	
		*/
		
		/* (5) descendingMap() - Returns a reverse order view of the mappings contained in this map and the 
		 	   comparator for this map is reversed too.
		*/
        NavigableMap<Integer, String> NavigableMap2Reverse = NavigableMap2.descendingMap();
    }
}
