package com.company.collections2.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class HashMapClass {
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
        HashMap<Integer, String> hashMap1 = new HashMap();
        HashMap<Integer, String> hashMap2 = new HashMap();
        HashMap<Integer, String> fillUp = new HashMap();
        for (int i = 0; i < 5; i++) {
            hashMap1.put(i + 10, "Map1_Value");
            hashMap2.put(i + 25, "Map2_Value");
            fillUp.put(i + 60, "FillUp_Value");
        }
        hashMap1.put(3000, "Map1_Extra_Value");
        hashMap1.put(700, "Map1_Extra_Value");
        hashMap1.put(80, "Map1_Extra_Value");
        hashMap2.put(60, "Map2_Extra_Value");

        /** Constructors for HashMap Class **/
		/* (1) HashMap() - It is the default constructor which creates an instance of HashMap 
		 	   with initial capacity 16 and load factor 0.75. 
		*/
        HashMap<Integer, String> hashMap3 = new HashMap();		
		
		/* (2) HashMap(int initial_capacity) - It creates a HashMap instance with specified initial 
			   capacity and load factor 0.75. 
		*/
        HashMap<Integer, String> hashMap4 = new HashMap(16);
		
		/* (3) HashMap(int initial_capacity, float loadFactor) - It creates a HashMap instance with 
		 	   specified initial capacity and specified load factor. 
		*/
        HashMap<Integer, String> hashMap5 = new HashMap(16, (float) 0.75);

        /* (4) HashMap(Map map) - It creates instance of HashMap with same mappings as specified map. */
        HashMap<Integer, String> hashMap6 = new HashMap(fillUp);

        /** Common HashMap Class Methods are follows (Excluding those which were mentioned before) **/
        /** Method Support From : Map **/
        /* (1) clone() - It is used to return a shallow copy of the mentioned hash map. */
        HashMap<Integer, String> hashMap1Copy = (HashMap<Integer, String>) hashMap1.clone();

        /* (2) values() - It is used to return a Collection view of the values in the HashMap. */
        Collection collection = hashMap2.values();
    }
}
