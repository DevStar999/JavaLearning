package com.company.collections.commonmethods;

import java.util.ArrayList;
import java.util.List;

public class CollectionsCommonMethods1 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        List<Integer> list4 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list1.add(i);
            list2.add(i + 10);
            list3.add(i + 200);
            list4.add(3000 + i);
        }

        /** Common Collecion's Methods are follows (Part 1) **/
        /* (1.a) add(int val) - Appends the specified element to the end of this list.  */
        list1.add(11);
		/* (1.b) add(int index , Object ob) - Inserts the specified element at the 
				 specified position in this list. Shifts the element currently 
				 at that position(if any) and any subsequent elements to the 
				 right (adds one to their indices). 
		*/
        list1.add(list1.size(), 100); // Range of Index - [0 , collection.size()].

		/* (2.a) addAll(Collection c) - Appends all of the elements in the specified collection to the end of
		   		 this list, in the order that they are returned by the specified collection's 
		   		 iterator. 
		*/
        list2.addAll(list3);
		/* (2.b) addAll(int index, Collection c) - Inserts all of the elements in the specified collection into 
		    	 this list at the specified position. Shifts the element currently at 
		    	 that position (if any) and any subsequent elements to the right (increases their indices).
		*/
        list2.addAll(3, list3);

        /* (3) size() - Returns the number of elements in this list. */
        System.out.println("The number of elements in the list 'list2' = " + list2.size());

        /* (4) clear() - Removes all of the elements from this list. */
        list4.clear();

        /* (5) isEmpty() - Returns 'true' if there are no elements in the list. */
        System.out.println("The list 'list4' is empty : " + list4.isEmpty());
    }
}
