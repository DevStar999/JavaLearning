package com.company.collections.set;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class LinkedHashSetClass {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet1 = new LinkedHashSet<>();
        LinkedHashSet<Integer> linkedHashSet2 = new LinkedHashSet<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            linkedHashSet1.add(i + 50);
            linkedHashSet2.add(i + 300);
            list.add(i + 2000);
        }
        linkedHashSet1.add(12);

        /** Constructors for LinkedHashSet Class **/
        /** Method Support From : Set, HashSet **/
        /* (1) LinkedHashSet() - This constructor is used to create a default HashSet. */
        LinkedHashSet<Integer> linkedHashSet3 = new LinkedHashSet<>();
		
		/* (2) LinkedHashSet(Collection c) - Used in initializing the HashSet with the elements of 
		 	   the collection c. 
		*/
        LinkedHashSet<Integer> linkedHashSet4 = new LinkedHashSet<>(list);
	
		/* (3) LinkedHashSet(int size) - Used to initialize the size of the LinkedHashSet with the 
			   integer mentioned in the parameter. 
		*/
        LinkedHashSet<Integer> linkedHashSet5 = new LinkedHashSet<>(20);
		
		/* (4) LinkedHashSet(int capacity, float fillRatio) - Can be used to initialize both the capacity 
			   and the fill ratio, also called the load capacity of the LinkedHashSet with the arguments 
			   mentioned in the parameter. When the number of elements exceeds the capacity of the hash 
			   set is multiplied with the fill ratio thus expanding the capacity of the LinkedHashSet. 
		*/
        LinkedHashSet<Integer> linkedHashSet6 = new LinkedHashSet<>(20, (float) 0.75);

        /** All methods of LinkedHashSet are mentioned previously. **/
    }
}
