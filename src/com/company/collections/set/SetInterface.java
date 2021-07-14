package com.company.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {
    public static <T> void printSet(Set<T> set) {
        for (T el : set) {
            System.out.print(el + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new TreeSet<>();
        Set<Integer> setA = new TreeSet<>();
        Set<Integer> setB = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            set1.add(i + 50);
            setA.add(i + 20);
            setB.add(i + 25);
        }
        set1.add(12);

        /** Creating Set Objects : Instantiation **/
        Set set2 = new TreeSet(), set3 = new LinkedHashSet(), set4 = new HashSet();
        Set<Character> set5 = new TreeSet<>(); // Type-safe instantiation.


        /** Basic Set Operations **/
        /** Method Support From : Collection **/
        /* (1) Union - Using addAll() method */
        Set<Integer> union = new TreeSet<>(setA);
        union.addAll(setB);
        System.out.println("The elements in the union of 'setA' and 'setB' are follows :");
        printSet(union);

        /* (2) Intersection - Using retainAll() method */
        Set<Integer> intersection = new TreeSet<>(setA);
        intersection.retainAll(setB);
        System.out.println("\nThe elements in the intersection of 'setA' and 'setB' are follows :");
        printSet(intersection);

        /* (3) Difference - Using removeAll() method */
        Set<Integer> difference = new TreeSet<>(setA);
        difference.removeAll(setB);
        System.out.println("\nThe elements in the difference of 'setA' and 'setB' i.e (setA-setB) are follows :");
        printSet(difference);
    }
}
