package com.company.collections.commonmethods;

import java.util.ArrayList;
import java.util.List;

public class CollectionsCommonMethods2 {
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

        /** Common Collecion's Methods are follows (Part 2) **/
        /* (1) contains(Object ob) - Returns true if this list contains the specified element. */
        list1.contains(7);
		
		/* (2.a) remove(Object ob) - Removes the 1st occurrence of the specified element from this list, 
				 if it is present. 
		*/
        list2.remove(14); // Removing by value.
		/* (2.b) remove(int index) - Removes the element at the specified position in this list. 
		 		 Shifts any subsequent elements to the left (subtracts one from their indices).
		*/
        list1.remove(5); // Removing by index.

		/* (3) removeAll() - Removes from this list all of its elements that are contained in 
		 	   the specified collection. 
		*/
        list4.removeAll(list4); // Removing all it's elements from 'list4'.

        /* (4) equals() - Returns 'true' if the 2 specified collections are equal. */
        System.out.println("The collections 'list3' and 'list4' are equal : " + list4.equals(list3));

        /* (5.a) toArray() - Returns an array containing all of the elements in this list in proper sequence. */
        Object[] arr1 = list3.toArray();
        Integer[] arr2 = new Integer[list2.size()];
		/* (5.b) T[] toArray(T[]) - Returns an array containing all of the elements in this list in 
				 proper sequence, the runtime type of the returned array is that of the specified array. 
		*/
        arr2 = list3.toArray(arr2);
    }
}
