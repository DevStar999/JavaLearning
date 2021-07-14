package com.company.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class ListInterface {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list1.add(i + 5);
        }
        list1.add(9);

        /** Creating List Objects : Instantiation **/
        List list2 = new ArrayList(), list3 = new LinkedList(), list4 = new Stack(), list5 = new Vector();
        List<Character> list6 = new ArrayList<>(); // Type-safe instantiation.

        /** Common List Interface Methods are follows (Excluding those from Collection's Common Methods) **/
        /** Method Support From : Collection **/
        // (I) Positional Access.
        /* (1) get(int index) - This method returns element at the specified index. */
        System.out.println("The element in 'list1' at index 1 = " + list1.get(1));
		
		/* (2) set(int index, Object new_value) - This method replaces element at given index with new element. 
			   This function returns the element which was just replaced by new element. 
		*/
        list1.set(3, 100);

        // (II) Search.
		/* (1) indexOf(Object ob) - This method returns first occurrence of given element or -1 if 
			   element is not present in list. 
		*/
        System.out.println("The 1st occurrence of '9' in 'list1' is at index = " + list1.indexOf(9));
		
		/* (2) lastIndexOf(Object ob) - This method returns the last occurrence of given element or -1 if 
			   element is not present in list. 
		*/
        System.out.println("The last occurrence of '9' in 'list1' is at index = " + list1.lastIndexOf(9));

        // (III) Iteration - A ListIterator object is used to iterate over a list elements.
        ListIterator<Integer> listIterator = list1.listIterator();

        // (IV) Range-View.
		/* (1) subList(int start, int end) - This method returns List view of specified List 
		       between start(inclusive) and end(exclusive). 
		*/
        List<Integer> subList1 = list1.subList(2, 5); // It will return the sublist from index 2 to 4(both inclusive).
    }
}
