package com.company.phase4;

import java.util.* ;

interface FunctionalInterface_v1 { 
    // A single abstract function 
    void abstractFunction(int x) ; 
} 

public class Lambda_Expression_ex1 {

	public static void main(String[] args) {
		/** Module 1 **/
		/* 	Lambda expression to implement above functional interface. This interface by default
			implements abstractFuncion() 
        */
		FunctionalInterface_v1 fobj = (int x) -> System.out.println(5*x) ; 
  
        // This calls above lambda expression and prints 25. 
        fobj.abstractFunction(5); 
	
        /** Module 2 **/
        // Using Anonymous Inner Class with instance initializer block to populate the following ArrayList.
        ArrayList<Integer> lt = new ArrayList() { { add(1) ; add(2) ; add(3) ; add(4) ; } } ;
        
        System.out.println("\nThe elements of the ArrayList are printed as follows using Lambda Expression :") ;
        lt.forEach(val -> System.out.print(val + " ") ) ; // Using Lambda Expression in this line.
        
        System.out.println("\nPrinting only even valued elements from the ArrayList as follows :") ;
        lt.forEach(val -> {
	        	if( val%2 == 0 ) { 
	        		System.out.println(val) ;
	        	} 
        	} 
        ) ;        
	}

}
