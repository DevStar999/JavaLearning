package com.company.collectionsmiscellaneous.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UniversalIteratorClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        // Instantiating the Universal 'Iterator' for the above List.
        Iterator iterator = list.iterator();

        /** Commonly used methods of 'Iterator' class. **/
		/* 	(1) hasNext() - Returns 'true' if the iteration has more elements or-else 'false'.
			(2) next() - Returns the next element in the iteration else throws an exception.
		*/
        System.out.println("The elements of the List 'list' are as follows :");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
		
		/* (3) 	remove() - 	Removes from the underlying collection, the last element returned by 'this' 
							iterator (optional operation). This method can be called
							only once per call to next() method. 
		*/
        iterator.remove(); // Removing the element '9' from the List.
		
		/* (4) 	equals() - 	Indicates whether given object is equal to 'this' one and returns 'true' 
		 					or 'false' accordingly. 
		 */
        iterator = list.iterator();
        System.out.println("Iterator pointing at 0 : " + iterator.next().equals(0));
    }
}
