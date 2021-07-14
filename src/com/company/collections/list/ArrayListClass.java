package com.company.collections.list;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList1.add(i + 20);
            arrayList2.add(i + 300);
        }

        /** Constructors for ArrayList Class **/
        /* (1) */
        ArrayList<Double> arrayList3 = new ArrayList<>();
        /* (2) */
        ArrayList<Float> arrayList4 = new ArrayList<>(/* size of list */ 5);
        /* (3) */
        ArrayList<Integer> arrayList5 = new ArrayList<>(/* Collection c */ arrayList1);

        /** Common ArrayList Class Methods are follows (Excluding those which were mentioned before) **/
        /** Method Support From : Collection, List **/
		/* (1) retainAll(Collection c) - Retains only the elements in 'this' list that are contained
			   in the specified collection.
		*/
        ArrayList<Integer> arrayListTemp = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayListTemp.add(i + 20);
        }
        arrayList1.retainAll(arrayListTemp);

        // Anonymous Inner Class initialization (also called Double Brace initialization) for ArrayList
        ArrayList<Integer> arrayList6 = new ArrayList<>() {{
            add(17);
            add(23);
            add(5);
        }};
        System.out.println("arrayList6 ArrayList is as follows :");
        arrayList6.forEach(element -> System.out.print(element + " "));
        System.out.println();

        // Initialising an ArrayList using Arrays.asList()
        ArrayList<Integer> arrayList7 = new ArrayList<>(Arrays.asList(2, 5, 6, 234, 623, 63, 1));
        System.out.println("arrayList7 ArrayList is as follows :");
        arrayList7.forEach(element -> System.out.print(element + " "));
        System.out.println();
    }
}
