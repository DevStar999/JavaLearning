package com.company.collections2.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapInterface {
    // Iterating over the map using 'for-each' and 'keySet'.
    public static <T1, T2> void printMap1(Map<T1, T2> map) {
        System.out.println("The elements of the map are as follows :");
        for (T1 el : map.keySet()) {
            System.out.println(el + " -> " + map.get(el));
        }
        System.out.println();
    }
	
    // Iterating over the map using 'for-each' and 'entrySet'.
    public static <T1, T2> void printMap2(Map<T1, T2> map) {
        System.out.println("The elements of the map are as follows :");
        for (Map.Entry<T1, T2> el : map.entrySet()) {
            System.out.println(el.getKey() + " -> " + el.getValue());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Map<Integer, String> map1 = new TreeMap();
        Map<Integer, String> map2 = new TreeMap();
        Map<Integer, String> map3 = new TreeMap();
        Map<Integer, String> useMap = new TreeMap();
        for (int i = 0; i < 5; i++) {
            map1.put(i + 10, "Map1_Value");
            map2.put(i + 25, "Map2_Value");
            useMap.put(i + 100, "UseMap_Value");
            map3.put(i + 400, "Map3_Value");
        }
        map1.put(3000, "Map1_Extra_Value");
        map1.put(700, "Map1_Extra_Value");
        map1.put(80, "Map1_Extra_Value");
        map2.put(60, "Map2_Extra_Value");

        /** Creating Map Objects : Instantiation **/
        Map map4 = new TreeMap(), map5 = new HashMap(), map6 = new Hashtable(), map7 = new LinkedHashMap();
        Map<Integer, String> map8 = new TreeMap(); // Type-safe instantiation.

        /** Common Map Interface Methods are follows **/
        /* (1) put(Object key, Object value) - This method is used to insert an entry in this map. */
        useMap.put(200, "UseMap_Value");

        /* (2) putAll(Map map) - This method is used to insert the specified map in this map. */
        map3.putAll(useMap);
		
		/* (3) remove(Object key) - This method is used to delete an entry for the specified key and
		 	   and returns the value of the key if present else returns null.
		*/
        map1.remove(3000);
		
		/* (4) get(Object key) - This method is used to return the value for the specified key 
		 	   and null if the key is not present. 
		*/
        System.out.println("The value corresponding the key '12' in the Map 'map1' = " + map1.get(12));

        /* (5) containsKey(Object key) - This method return 'true' if the specified key is in this map. */
        System.out.println("The key '14' is present in Map 'map1' : " + map1.containsKey(14));

        /* (6) containsValue(Object value) - This method return 'true' if the specified value is in this map. */
        System.out.println("The value \"Map1_Value\" is present in Map 'map1' : " +
                map1.containsValue("Map1_Value"));

        /* (7)  keySet() - This method is used to return the Set view containing all the keys. */
        Set keySetMap1 = map1.keySet();

        /* (8) entrySet() - This method is used to return the Set view containing all the keys and values. */
        Set<Map.Entry<Integer, String>> entrySetMap1 = map1.entrySet();
        Iterator iterator = entrySetMap1.iterator();
		/* 	Here, we are traversing over the entries of the Map 'map1' after collecting the entrySet in a Set
		 	using an iterator.
		 */
        System.out.println("\nThe elments of the Map traversed via Set view from entrySet() are as follows :");
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> el = (Map.Entry<Integer, String>) iterator.next();
            System.out.println(el.getKey() + " -> " + el.getValue());
        }
        System.out.println();
    }
}
