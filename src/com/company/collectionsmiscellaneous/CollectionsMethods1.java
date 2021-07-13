package com.company.collectionsmiscellaneous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsMethods1 {
    public static void printList(List<Integer> list) {
        System.out.println("The list is printed as follows :");
        for (Integer i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer values1[] = {23, 45, 63, 41, 5};
        List<Integer> l1 = Arrays.asList(values1);
        printList(l1);

        List<Integer> rev = new ArrayList<>(l1);
        Collections.reverse(rev);
        printList(rev);

        List<Integer> l1Copy = Arrays.asList(new Integer[5]);
        Collections.copy(l1Copy, l1);
        printList(l1Copy);

		/*	The 'Collections.fill(collection, element)' will replace the every element of 'collection' with
 			'element'.
		*/
        Collections.fill(l1, 100);
        printList(l1);
		
		/* 	The 'Collections.addAll(collection, array)' will add all the elements in array to collections
		  	at it's end.
		*/
        Integer values2[] = {27, 42, 67, 44, 5};
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(values1));
        Collections.addAll(arrayList, values2);
        printList(arrayList);
		
		/* 	The 'Collections.frequency(collection, object)' will give the frequency of the object
			in the collection.
		*/
        System.out.println("The frequency of '44' in 'arrayList' = " + Collections.frequency(arrayList, 100));
		
		/* 	The 'Collections.disjoint(collection1, collection2)' will return 'true' if these two collections
			have nothing in common else it will return 'false'.
		*/
        if (Collections.disjoint(l1, l1Copy)) {
            System.out.println("These two collections have nothing in common.");
        } else {
            System.out.println("These two collections must have something in common.");
        }

        Collections.sort(arrayList);
        System.out.println("The ArrayList 'arrayList' is printed as follows :");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();
    }
}