package com.company.collectionsmiscellaneous.legacy;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class HashtableClass {
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
        Hashtable<Integer, String> hashtable1 = new Hashtable();
        Hashtable<Integer, String> hashtable2 = new Hashtable();
        Map<Integer, String> fillUp = new TreeMap();
        for (int i = 0; i < 5; i++) {
            hashtable1.put(i + 10, "Map1_Value");
            hashtable2.put(i + 25, "Map2_Value");
            fillUp.put(i + 60, "FillUp_Value");
        }
        hashtable1.put(3000, "Map1_Extra_Value");
        hashtable1.put(700, "Map1_Extra_Value");
        hashtable1.put(80, "Map1_Extra_Value");
        hashtable2.put(60, "Map2_Extra_Value");

        /** Constructors for Hashtable Class **/
        /* (1) Hashtable() - This is the default constructor. */
        Hashtable<Integer, String> hashtable3 = new Hashtable();

        /* (2) Hashtable(int size) - This creates a hash table that has initial size specified by size. */
        Hashtable<Integer, String> hashtable4 = new Hashtable(16);
		
		/* (3) Hashtable(int size, float fillRatio) - This version creates a hash table that has initial 
		 	   size specified by size and fill ratio specified by fillRatio. 
		 	   [ Fill Ratio : Basically it determines how full hash table can be before it is resized upward.
		 	   and its Value lie between 0.0 to 1.0 ] 
		*/
        Hashtable<Integer, String> hashtable5 = new Hashtable(16, (float) 0.75);

        /* (4) Hashtable(Map m) - This creates a hash table that is initialized with the elements in 'm'. */
        Hashtable<Integer, String> hashtable6 = new Hashtable(fillUp);

        /** Common Hashtable Class Methods are follows (Excluding those which were mentioned before) **/
        /** Method Support From : Map **/
        /* (1) clone() - Used to create a shallow copy of this Hashtable. */
        Hashtable<Integer, String> hashtable1Copy = (Hashtable<Integer, String>) hashtable1.clone();

        /* (2) elements() - Returns an enumeration of the values obtained in hash table. */
        Enumeration enumeration1 = hashtable1.elements();

        /* (3) equals(Object ob) - Used to compare specified object with this Map for equality. */
        System.out.println("The Hashtables 'hashtable1' and 'hashtable2' are equal : " + hashtable1.equals(hashtable2));

        /* (4) keys() - Used to get enumeration of the keys contained in the Hashtable. */
        Enumeration enumerationKeys = hashtable1.keys();

        /* (5) toString() - Returns the string equivalent of a Hashtable. */
        System.out.println("The string equivalent of Hashtable 'hashtable1' = " + hashtable1.toString());

        /* (6) values() - Used to get a Collection view of the values contained in this Hashtable. */
        Collection collection = hashtable1.values();
    }
}
