package com.company.collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetClass {
    public static void main(String[] args) {
        HashSet<Integer> hashSet1 = new HashSet<>();
        HashSet<Integer> hashSet2 = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            hashSet1.add(i + 50);
            hashSet2.add(i + 300);
            list.add(i + 2000);
        }
        hashSet1.add(12);

        /** Constructors for HashSet Class **/
        /* (1) HashSet() - Default initial capacity is 16 and default load factor is 0.75. */
        HashSet<Integer> hashSet3 = new HashSet<>();

        /* (2) HashSet(int initialCapacity) - Default loadFactor of 0.75 */
        HashSet<Integer> hashSet4 = new HashSet<>(20);

		/* (3) HashSet(int initialCapacity, float loadFactor) - Initializes the HashSet with 
			   the specified values. 
		*/
        HashSet<Integer> hashSet5 = new HashSet<>(20, (float) 0.75);
		
		/* (4) HashSet(Collection C) - This constructor is used when any conversion is needed from 
			   any Collection object to HashSet object. 
		*/
        HashSet<Integer> hashSet6 = new HashSet<>(list);

        /** All methods of HashSet are mentioned previously. **/
        /** Method Support From : Collection, Set **/
    }
}
