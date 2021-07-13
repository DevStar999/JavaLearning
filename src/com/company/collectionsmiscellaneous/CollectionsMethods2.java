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
    }
}
