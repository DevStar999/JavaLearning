package com.company.java_collections_2;

import java.util.* ;

// Example Class for use in Priority Queue. 
class ExampleClass{
	private Integer field1 ;
	private Integer field2 ;
	
	public Integer getField1() { return field1 ; }
	public void setField1(Integer field1) { this.field1 = field1 ; }
	
	public Integer getField2() { return field2 ; }
	public void setField2(Integer field2) { this.field2 = field2 ; }
}

// Comparator Class for ExampleClass.
class ExampleClassComparator implements Comparator<ExampleClass>{
	public int compare(ExampleClass ob1, ExampleClass ob2) {
		if( ( ob1.getField1() ).compareTo( ob2.getField1() ) == 0 ) {
			return ( ob1.getField2() ).compareTo( ob2.getField2() ) ;
		}
		return ( ob1.getField1() ).compareTo( ob2.getField1() ) ;
	}
}

// Generic Comparator Class for Ascending Ordering of values.
// (Note - This is the default comparator for the PriorityQueue Object.)
class AscendingOrder<T extends Comparable<T>> implements Comparator<T>{
	public int compare(T ob1, T ob2) {
		return ob1.compareTo(ob2) ;
	}
}

// Generic Comparator Class for Descending Ordering of values.
class DescendingOrder<T extends Comparable<T>> implements Comparator<T>{
	public int compare(T ob1, T ob2) {
		return (-1) * ob1.compareTo(ob2) ;
	}
}

// Main Class for the file.
public class PriorityQueue_Class {

	public static <T> void print_pq( Queue<T> pq ) {
		Queue<T> pq_copy = new PriorityQueue<T>(pq) ;
		while( pq_copy.size() > 0 ) {
			System.out.print( pq_copy.peek() + " " ) ;
			pq_copy.poll() ;
		}
		System.out.println() ;
	}
	
	public static void main(String[] args) {
		PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>() ;
		PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>() ;	
		List<Integer> lt = new ArrayList<Integer>() ;
		SortedSet<Integer> ss = new TreeSet<Integer>() ;
		for(int i=0 ; i<10 ; i++) { pq1.add(i*10) ; pq2.add(i+40) ; lt.add(i+200) ; ss.add(i+4000) ; }
		pq1.add(-1) ; pq1.add(22) ; pq1.add(35) ; pq1.add(2000) ;
		pq2.add(-3) ; pq2.add(19) ; pq2.add(41) ; pq2.add(2020) ;
		
		/** Constructors for PriorityQueue Class **/
		/* (1) PriorityQueue() - Creates a PriorityQueue with the default initial capacity (11) that 
			   orders its elements according to their natural ordering. 
		*/
		PriorityQueue<Integer> pqx1 = new PriorityQueue<Integer>() ;		
		
		/* (2) PriorityQueue(Collection c) - Creates a PriorityQueue containing the elements in the 
			   specified collection. 
		*/
		PriorityQueue<Integer> pqx2 = new PriorityQueue<Integer>(lt) ;		
		
		/* (3) PriorityQueue(int initialCapacity) - Creates a PriorityQueue with the specified initial 
			   capacity that orders its elements according to their natural ordering. 
		*/
		PriorityQueue<Integer> pqx3 = new PriorityQueue<Integer>(10) ;		
		
		/* (4) PriorityQueue(Comparator comparator) - Creates a PriorityQueue that orders its elements 
		   	   according to the specified comparator. 
		*/
		PriorityQueue<Integer> pqx4 = new PriorityQueue<Integer>(new DescendingOrder()) ;		
		/* PriorityQueue<Integer> pqx4 = 
				new PriorityQueue<Integer>( (new PriorityQueue()).comparator().reversed() ) ;
		*/ // Trick to use in-built comparator for descending ordering.
		
		/* (5) PriorityQueue(int initialCapacity, Comparator comparator) - Creates a PriorityQueue with 
			   the specified initial capacity that orders its elements according to the specified comparator. 
		*/
		PriorityQueue<Integer> pqx5 = new PriorityQueue<Integer>(10, new DescendingOrder()) ;
		
		/* (6) PriorityQueue(PriorityQueue pq) - Creates a PriorityQueue containing the elements in the 
			   specified priority queue. 
		*/
		PriorityQueue<Integer> pqx6 = new PriorityQueue<Integer>(pq2) ;		
	
		/* (7) PriorityQueue(SortedSet ss) - Creates a PriorityQueue containing the elements in the specified 
		 	   sorted set. 
		*/
		PriorityQueue<Integer> pqx7 = new PriorityQueue<Integer>(ss) ;
		
		/** Common PriorityQueue Class Methods are follows (Excluding those which were mentioned before) **/
		/** Method Support From : Collection, Queue   **/
		/* (1) Comparator comparator() - The method is used to return the comparator that can be used to 
			   order the elements of the queue. 
		*/
		Comparator comp = pqx7.comparator().reversed() ;
		// Note : As done above we can use the in-built comparator for descending ordering.
	}

}
