package com.company.java_collections_2;

import java.util.* ;

public class ArrayList_Class {
	
	public class class_for_remove_range_method extends ArrayList<Integer>{ }
	
	public static void print_collection( Collection<Integer> col ) {
		System.out.println("The elements of the collection are as follows :") ;
		for(Integer el : col) {
			System.out.print(el + " ") ;
		}
		System.out.println() ;
	}

	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<>() ;
		ArrayList<Integer> l2 = new ArrayList<>() ;
		for(int i=0 ; i<10 ; i++) { l1.add(i+20) ; l2.add(i+300) ; }
		
		/** Constructors for ArrayList Class **/
		/* (1) */ ArrayList<Double> ls1 = new ArrayList<>() ;
		/* (2) */ ArrayList<Float> ls2 = new ArrayList<>(/* size of list */ 5) ;
		/* (3) */ ArrayList<Integer> ls3 = new ArrayList<>(/* Collection c */ l1) ;
		
		/** Common ArrayList Class Methods are follows (Excluding those which were mentioned before) **/
		/** Method Support From : Collection, List **/
		/* (1) retainAll(Collection c) - Retains only the elements in 'this' list that are contained
			   in the specified collection.
		*/
		ArrayList<Integer> ltemp = new ArrayList<>() ;
		for(int i=0 ; i<5 ; i++) { ltemp.add(i+20) ; }
		l1.retainAll(ltemp) ;
//		print_collection(l1) ;

		// Anonymous Inner Class initialization for ArrayList
		ArrayList<Integer> l3 = new ArrayList<>(){{
			add(17);
			add(23);
			add(5);
		}};
		System.out.println("l3 ArrayList is as follows :");
		for (Integer el: l3) {
			System.out.print(el + " ");
		}
		System.out.println();

		// Initialising an ArrayList using Arrays.asList()
		ArrayList<Integer> l4 = new ArrayList<>(Arrays.asList(2,5,6,234,623,63,1));
		System.out.println("l4 ArrayList is as follows :");
		for (Integer el: l4) {
			System.out.print(el + " ");
		}
		System.out.println();
	}

}
