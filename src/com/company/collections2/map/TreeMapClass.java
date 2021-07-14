package com.company.collections2.map;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapClass {
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
        TreeMap<Integer, String> treeMap1 = new TreeMap();
        TreeMap<Integer, String> treeMap2 = new TreeMap();
        TreeMap<Integer, String> fillUp = new TreeMap();
        SortedMap<Integer, String> sortedMap = new TreeMap();
        for (int i = 0; i < 5; i++) {
            treeMap1.put(i + 10, "Map1_Value");
            treeMap2.put(i + 25, "Map2_Value");
            fillUp.put(i + 60, "FillUp_Value");
            sortedMap.put(i + 400, "SortedMap_Value");
        }
        treeMap1.put(3000, "Map1_Extra_Value");
        treeMap1.put(700, "Map1_Extra_Value");
        treeMap1.put(80, "Map1_Extra_Value");
        treeMap2.put(60, "Map2_Extra_Value");

        /** Constructors for TreeMap Class **/
		/* (1) TreeMap() - Constructs an empty tree map that will be sorted by using the natural 
			   order of its keys. 
		*/
        TreeMap<Integer, String> treeMap3 = new TreeMap();
		
		/* (2) TreeMap(Comparator comp) - Constructs an empty tree-based map that will be sorted by using 
		 	   the Comparator comp. 
		*/
        TreeMap<Integer, String> treeMap4 = new TreeMap(((new TreeMap()).comparator()).reversed());
        // Created a TreeMap with Descending ordering of keys.
		
		/* (3) TreeMap(Map m) - Initializes a tree map with the entries from 'm', which will be sorted 
		       by using the natural order of the keys. 
		*/
        TreeMap<Integer, String> treeMap5 = new TreeMap(fillUp);
		
		/* (4) TreeMap(SortedMap sm) - Initializes a tree map with the entries from 'sm', which will be 
			   sorted in the same order as sm. 
		*/
        TreeMap<Integer, String> treeMap6 = new TreeMap(sortedMap);

        /** Common TreeMap Class Methods are follows (Excluding those which were mentioned before) **/
        /** Method Support From : Map, SortedMap, NavigableMap   **/
        /* (1) Object clone() - The method returns a shallow copy of this TreeMap. */
        TreeMap<Integer, String> treeMap1Copy = (TreeMap<Integer, String>) treeMap1.clone();
    }
}
