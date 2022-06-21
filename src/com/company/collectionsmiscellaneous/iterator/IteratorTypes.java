package com.company.collectionsmiscellaneous.iterator;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.Vector;

public class IteratorTypes {
    public static void main(String[] args) {
		/*  There are 3 types of Iterators :
		 	(1) Enumeration (Only applicable to legacy collections i.e. Vectors, Stack and Hash-tables.)
			(2) Iterator (The universal iterator applicable for any collection.)
			(3) ListIterator (Only applicable for List collections.)
		*/

        // (1) Enumeration.
        Vector vector = new Vector();
        Enumeration enumeration1 = vector.elements(); // Enumeration for Vector.

        Hashtable<String, Integer> hashtable = new Hashtable<>();
        Enumeration<String> enumeration2 = hashtable.keys(); // Enumeration for Hash-table.

        // (2) Iterator (Universal Iterator for any collection).
        Set<Character> set = new HashSet<>();
        Iterator iterator = set.iterator(); // Iterator for Set 'set'.

        // (3) ListIterator.
        List<Double> list = new ArrayList<>();
        ListIterator listIterator = list.listIterator(); // ListIterator for List 'list' .
    }
}
