package com.company.collectionsmiscellaneous;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsMethods2 {
    public static <T> void print_collection(Collection<T> col) {
        System.out.println("The elements of the Collection are as follows :");
        for (T el : col) {
            System.out.print(el + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        /* Collections.reverse(collection) - Reverses the order of the elements in the specified list. This method
           runs in linear time.
        */
        ArrayList<Integer> listReverse = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listReverse.add(i + 10);
        }
        System.out.println("Before Reversing");
        print_collection(listReverse);

        Collections.reverse(listReverse);
        System.out.println("\nAfter Reversing");
        print_collection(listReverse);

        /* Collections.shuffle(collection) - Randomly permutes the specified list using a default source of randomness.
           All permutations occur with approximately equal likelihood.
        */
        ArrayList<Integer> listShuffle = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listShuffle.add(i + 10);
        }

        System.out.println("Before Shuffling");
        print_collection(listShuffle);

        Collections.shuffle(listShuffle);
        System.out.println("\nAfter Shuffling");
        print_collection(listShuffle);

        /* (i) Collections.sort(collection) - Sorts the specified list into ascending order, according to the natural 
           ordering of its elements. All elements in the list must implement the Comparable interface. Furthermore, 
           all elements in the list must be mutually comparable (that is, e1.compareTo(e2) must not throw a 
           ClassCastException for any elements e1 and e2 in the list). This sort is guaranteed to be stable: equal 
           elements will not be reordered as a result of the sort.
           (ii) Collections.reverseOrder() - Returns a comparator that imposes the reverse of the natural ordering on a 
           collection of objects that implement the Comparable interface.
        */
        ArrayList<Integer> listSortedAscending = new ArrayList<>();
        ArrayList<Integer> listSortedDescending = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listSortedAscending.add(i + 10);
            listSortedDescending.add(i + 55);
        }

        System.out.println("After sorting in ascending order in 'listSortedAscending'");
        Collections.sort(listSortedAscending);
        print_collection(listSortedAscending);

        System.out.println("\nAfter sorting in descending order in 'lt1'");
        Collections.sort(listSortedDescending, Collections.reverseOrder());
        print_collection(listSortedDescending);
    }
}
