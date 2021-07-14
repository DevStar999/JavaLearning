package com.company.collections.set;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetInterface {
    public static void main(String[] args) {
        NavigableSet<Integer> navigableSet1 = new TreeSet<>();
        NavigableSet<Integer> navigableSet2 = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            navigableSet1.add(i + 50);
            navigableSet2.add(i + 300);
        }
        navigableSet1.add(12);

        /** Iterators for navigation in the NavigableSet . **/
        Iterator forwardIterator = navigableSet1.iterator(); // For forward iteration.
        Iterator reverseIterator = navigableSet1.descendingIterator(); // For backward iteration.

        /** Common Navigable Set Interface Methods are follows (Excluding previous Methods) **/
        /** Method Support From : Collection, Set, SortedSet **/
		/* (1) lower(Object e) - Returns the greatest element in this set which is less than the given 
			   element or NULL if there is no such element. 
		*/
        System.out.println("The value of the element in 'navigableSet1' just less than 54 = "
                + navigableSet1.lower(54));
		
		/* (2) floor(Object e) - Returns the greatest element in this set which is less than or equal
			   to given element or NULL if there is no such element. 
		*/
        System.out.println("The value of the element in 'navigableSet1' less than or equal to 54 = "
                + navigableSet1.floor(54));
	
		/* (3) ceiling(Object e) - Returns the least element in this set which is greater than or equal 
			   to given element or NULL if there is no such element. 
		*/
        System.out.println("The value of the element in 'navigableSet1' equal to 54 or just greater than = "
                + navigableSet1.ceiling(54));
		
		/* (4) higher(Object e) - Returns the least element in this set which is greater than the 
			   given element or NULL if there is no such element. 
		*/
        System.out.println("The value of the element in 'navigableSet1' just greater than 54 = "
                + navigableSet1.higher(54));
		
		/* (5) pollFirst() - Retrieve and remove the first least element or return null if 
			   there is no such element. 
		*/
        System.out.println("The least element in 'navigableSet1' which is about to be removed = "
                + navigableSet1.pollFirst());
	
		/* (6) pollLast() - Retrieve and remove the last highest element ot return null if 
			   there is no such element. 
		*/
        System.out.println("The highest element in 'navigableSet1' which is about to be removed = "
                + navigableSet1.pollLast());
    }
}
