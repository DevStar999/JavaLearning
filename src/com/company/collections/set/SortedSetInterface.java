package com.company.collections.set;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

class TheComparator<T extends Comparable<T>> implements Comparator<T> {
    public int compare(T ob1, T ob2) {
        return ob2.compareTo(ob1);
    }
}

public class SortedSetInterface {
    public static <T> void printSet(Set<T> set) {
        for (T el : set) {
            System.out.print(el + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SortedSet<Integer> sortedSet1 = new TreeSet<>();
        SortedSet<Integer> sortedSet2 = new TreeSet<Integer>(new TheComparator());
        SortedSet<Integer> sortedSet3 = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            sortedSet1.add(i + 50);
            sortedSet2.add(i + 20);
            sortedSet3.add(i + 300);
        }
        sortedSet1.add(12);

        /** Creating SortedSet Objects : Instantiation **/
        SortedSet sortedSet4 = new TreeSet();
        SortedSet<Integer> sortedSet5 = new TreeSet(); // Type-safe instantiation.

        /** Common SortedSet Interface Methods are follows (Excluding previous Methods) **/
        /** Method Support From : Collection, Set **/
		/* (1) comparator() - Returns the comparator used to order the elements in this set, 
			   or null if this set uses the natural ordering of its elements. 
		*/
        Comparator comp = sortedSet2.comparator(), compReversed = comp.reversed();
		/* Note - We can easily use the reverse comparator for changing the ordering of the elements using
		 		  the reversed() function of the comparator.
		*/

        /* (2) first() - Returns the first (lowest) element currently in this set. */
        System.out.println("The lowest element in the Set 'sortedSet1' = " + sortedSet1.first());

        /* (3) last() - Returns the last (highest) element currently in this set. */
        System.out.println("The highest element in the Set 'sortedSet1' = " + sortedSet1.last());
		
		/* (4) headSet(Object ob) - Returns a view of the portion of this set whose elements are strictly 
			   less than ob. 
		*/
        SortedSet<Integer> before304 = sortedSet3.headSet(304);
        System.out.println("\nThe elements in 'sortedSet3' before the value 304 are as follows :");
        printSet(before304);

		/* (5) tailSet(Object ob) - Returns a view of the portion of this set whose elements are 
			   greater than or equal to ob.
		*/
        SortedSet<Integer> from304 = sortedSet3.tailSet(304);
        System.out.println("\nThe elements in 'sortedSet3' from the value 304 are as follows :");
        printSet(from304);	
		
		/* (6) subSet(Object from, Object to) - Returns a view of the portion of this set whose elements 
			   range from 'from'(inclusive) to 'to'(exclusive).
		*/
        SortedSet<Integer> from304to308 = sortedSet3.subSet(304, 308);
        System.out.println("\nThe elements in 'sortedSet3' from the value 304(inclusive) to 308(exclusive) "
                + "are as follows :");
        printSet(from304to308);
    }
}
