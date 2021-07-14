package com.company.collections.set;

import java.util.* ; 

class Desc_Comparator<T extends Comparable<T>> implements Comparator<T> { 
    public int compare(T ob1, T ob2) { 
        return ob2.compareTo(ob1) ; 
    } 
}

public class TreeSet_Class {

	public static void main(String[] args) {
		TreeSet<Integer> ts1 = new TreeSet<Integer>() ;
		TreeSet<Integer> ts2 = new TreeSet<Integer>() ;
		List<Integer> lt = new ArrayList<Integer>() ;
		SortedSet<Integer> ss = new TreeSet<Integer>() ;
		for(int i=0 ; i<10 ; i++) { ts1.add(i+50) ; ts2.add(i+300) ; lt.add(2000+i) ; ss.add(550+i) ; } 
		ts1.add(12) ;		
		
		/** Constructors for TreeSet Class **/
		/* (1) TreeSet() - This will create empty TreeSet object in which elements will get 
			   stored in default natural sorting order. 
		*/
		TreeSet<Integer> tsx1 = new TreeSet<Integer>() ;

		/* (2) TreeSet(Comparator comp) - This constructor is used when external specification of 
			   sorting order of elements is needed. 
		*/
		TreeSet<Integer> tsx2 = new TreeSet<Integer>( new Desc_Comparator() ) ;
		
		/* (3) TreeSet(Collection col) - This constructor is used when any conversion is needed from 
			   any Collection object to TreeSet object. 
		*/
		TreeSet<Integer> tsx3 = new TreeSet<Integer>(lt) ;
		
		/* (4) TreeSet(SortedSet s) - This constructor is used to convert SortedSet object to TreeSet Object. */
		TreeSet<Integer> tsx4 = new TreeSet<Integer>(ss) ;
		
		/** Common TreeSet Class Methods are follows (Excluding those which were mentioned before) **/
		/** Method Support From : Collection, Set, SortedSet, NavigableSet   **/
		/* (1) clone() - The method is used to return a shallow copy of the set, which is just 
			   a simple copied set. 
		*/
		TreeSet<Integer> clone_ts1 = (TreeSet<Integer>)ts1.clone() ;
		
		/* (2) descendingSet​() - This method returns a reverse order view of the elements contained in this set. */
		TreeSet<Integer> rev_ts2 = (TreeSet<Integer>)ts2.descendingSet() ;
		
		/* (3) descendingIterator​() - This method returns an iterator over the elements in this set 
			   in descending order. 
		*/
		Iterator reverse_iterator = ts1.descendingIterator() ;
	}

}
