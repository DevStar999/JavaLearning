package com.company.collections2.map;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapInterface {
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
        SortedMap<Integer, String> sortedMap1 = new TreeMap();
        SortedMap<Integer, String> sortedMap2 = new TreeMap();
        for (int i = 0; i < 5; i++) {
            sortedMap1.put(i + 10, "Map1_Value");
            sortedMap2.put(i + 25, "Map2_Value");
        }
        sortedMap1.put(3000, "Map1_Extra_Value");
        sortedMap1.put(700, "Map1_Extra_Value");
        sortedMap1.put(80, "Map1_Extra_Value");
        sortedMap2.put(60, "Map2_Extra_Value");

        /** Creating SortedMap Objects : Instantiation **/
        SortedMap sortedMap3 = new TreeMap();
        SortedMap<Integer, String> sortedMap4 = new TreeMap(); // Type-safe instantiation.

        /** Common SortedMap Interface Methods are follows **/
        /** Method Support From : Map **/
		/* (1) subMap(Object fromKey, Object toKey) - Returns a view of the portion of this Map whose 
			   keys range from 'fromKey'(inclusive) to 'toKey'(exclusive). 
		*/
        SortedMap<Integer, String> from11to14 = sortedMap1.subMap(11, 15);

		/* (2) headMap(Object toKey) - Returns a view of the portion of this Map whose keys are strictly 
		 	   less than toKey. 
		*/
        SortedMap<Integer, String> lessThan17 = sortedMap1.headMap(17);

		/* (3) tailMap(Object fromKey) - Returns a view of the portion of this Map whose keys are 
		 	   greater than or equal to fromKey. 
		*/
        SortedMap<Integer, String> from15onwards = sortedMap1.tailMap(15);

        /* (4) firstKey() - Returns the first (lowest) key currently in this Map. */
        System.out.println("The lowest key in the SortedMap 'sortedMap1' = " + sortedMap1.firstKey());

        /* (5) lastKey() - Returns the last (highest) key currently in this Map. */
        System.out.println("The highest key in the SortedMap 'sortedMap1' = " + sortedMap1.lastKey());
		
		/* (6) comparator() - Returns the Comparator used to order the keys in this Map, or null if 
			   this Map uses the natural ordering of its keys. 
		*/
        Comparator comp = sortedMap2.comparator();
        System.out.println("The comparator of the SortedMap 'sortedMap2' = " + comp);

        /* (7) values() - Returns a Collection view of the values contained in this map. */
        Collection vals = sortedMap2.values(); // Will allow duplicate values as well.
        System.out.println("The number of values in the SortedMap 'sortedMap2' = " + vals);
    }
}
