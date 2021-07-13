package com.company.collectionsmiscellaneous;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class DoubleBraceInitialization {
    public static <T> void printCollection(Collection<T> col) {
        System.out.println("The elements of the Collection are as follows :");
        for (T el : col) {
            System.out.print(el + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Set<String> sets = new HashSet<>() {
            {
                add("one");
                add("two");
                add("three");
            }
        };

        printCollection(sets);
    }
}
