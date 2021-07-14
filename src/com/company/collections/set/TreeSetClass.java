package com.company.collections.set;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

class DescComparator<T extends Comparable<T>> implements Comparator<T> {
    public int compare(T ob1, T ob2) {
        return ob2.compareTo(ob1);
    }
}

public class TreeSetClass {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet1 = new TreeSet<>();
        TreeSet<Integer> treeSet2 = new TreeSet<>();
        List<Integer> list = new ArrayList<>();
        SortedSet<Integer> sortedSet = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            treeSet1.add(i + 50);
            treeSet2.add(i + 300);
            list.add(2000 + i);
            sortedSet.add(550 + i);
        }
        treeSet1.add(12);

        /** Constructors for TreeSet Class **/
		/* (1) TreeSet() - This will create empty TreeSet object in which elements will get 
			   stored in default natural sorting order. 
		*/
        TreeSet<Integer> treeSet3 = new TreeSet<>();

		/* (2) TreeSet(Comparator comp) - This constructor is used when external specification of 
			   sorting order of elements is needed. 
		*/
        TreeSet<Integer> treeSet4 = new TreeSet<Integer>(new DescComparator());
		
		/* (3) TreeSet(Collection col) - This constructor is used when any conversion is needed from 
			   any Collection object to TreeSet object. 
		*/
        TreeSet<Integer> treeSet5 = new TreeSet<>(list);

        /* (4) TreeSet(SortedSet s) - This constructor is used to convert SortedSet object to TreeSet Object. */
        TreeSet<Integer> treeSet6 = new TreeSet<>(sortedSet);

        /** Common TreeSet Class Methods are follows (Excluding those which were mentioned before) **/
        /** Method Support From : Collection, Set, SortedSet, NavigableSet   **/
		/* (1) clone() - The method is used to return a shallow copy of the set, which is just 
			   a simple copied set. 
		*/
        TreeSet<Integer> cloneTreeSet1 = (TreeSet<Integer>) treeSet1.clone();

        /* (2) descendingSet() - This method returns a reverse order view of the elements contained in this set. */
        TreeSet<Integer> reversedTreeSet2 = (TreeSet<Integer>) treeSet2.descendingSet();
		
		/* (3) descendingIterator() - This method returns an iterator over the elements in this set
			   in descending order. 
		*/
        Iterator reverseIterator = treeSet1.descendingIterator();
    }
}
