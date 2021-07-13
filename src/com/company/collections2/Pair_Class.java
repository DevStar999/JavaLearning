package com.company.collections2;

import javafx.util.* ;

public class Pair_Class {

	public static void main(String[] args) {
		Pair<Integer,String> p1 = new Pair(10,"p1_string") ;
		Pair<Integer,String> p2 = new Pair(10,"p2_string") ;
		
		/** Methods for Pair Class are as follows **/
		/* (1) Pair (K key, V value) [ Constructor ] - Creates a new pair */
		Pair<Integer,String> temp = new Pair(10,"temp_string") ;		

		/* (2) equals() - It is used to compare two pair objects. It does a deep comparison, i.e., 
		 	   it compares on the basic of the values (<Key, Value>) which are stored in the pair objects. 
		*/
		System.out.println("The Pair objects 'p1' and 'p2' are equal :" + p1.equals(p2)) ;
		
		/* (3) getKey() - It returns key for the pair. */
		System.out.println("The key of 'p1' = " + p1.getKey()) ;
		
		/* (4) getValue() - It returns value for the pair. */
		System.out.println("The value of 'p1' = " + p1.getValue()) ;
		
		/* (5)  toString() - This method will return the String representation of the Pair. */
		System.out.println("The String representation of 'p1' : " + p1.toString()) ;
	}

}
