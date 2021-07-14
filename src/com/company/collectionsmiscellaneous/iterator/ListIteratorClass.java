package com.company.collectionsmiscellaneous.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        // Creating a ListIterator for the above List as follows.
        ListIterator<Integer> listIterator = list.listIterator(list.size());
        // Currently iterator is pointing at the end of the list(just after the last element).

        /** Additional methods of 'ListIterator' class apart from the methods in 'Iterator' class i.e.
         [i] hasNext()
         [ii] next()
         [iii] remove()
         [iv] equals()
         **/
		/* 	(1) hasPrevious() - Returns 'true' if the iteration has more elements while traversing
		 						from the back of the list or-else 'false'.
			(2) previous() - Returns the previous element in the iteration else throws an exception.
		*/
        System.out.println("The elements of the List 'list' are as follows (in reverse order) :");
        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + " ");
        }
        System.out.println();
		
		/* 	(3) add() - Inserts the specified element into the list (optional operation). The element is 
		 				inserted immediately before the element that would be returned by 'next()', if any, and 
		 				after the element that would be returned by 'previous()', if any. 
		*/
        listIterator.add(-1);

        // Checking the successful insertion of '-1' in the list as follows via printing the List.
        listIterator = list.listIterator();
        System.out.println("The elements of the List 'list' are as follows (in reverse order) :");
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
        }
        System.out.println();
    }
}
