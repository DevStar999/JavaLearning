package com.company.phase4;

import java.util.* ; 

interface FunctionalInterface_v2{
	int operation(int a, int b) ;
}

interface FunctionalInterface_show{
	void abstractFunction(int val) ;
}


public class Lambda_Expression_ex2 {

	public static void main(String[] args) {
		/* 	Implementing the single abstract method i.e operation() of the functional interface 
		 	i.e. FunctionalInterface_v2 to do addition as follows. 
		*/
		FunctionalInterface_v2 add = (int a, int b) -> a + b ;
		// FunctionalInterface_v2 add = (int a, int b) -> { a += b ; return a ; } ; // Same as above.
		
		/* 	Implementing the single abstract method i.e operation() of the functional interface 
	 		i.e. FunctionalInterface_v2 to do multiplication as follows. 
		*/
		FunctionalInterface_v2 multiply = (int a, int b) -> (a * b) ;
		
		/* 	Implementing the single abstract method i.e abstractFunction() of the functional interface 
 			i.e. FunctionalInterface_show to display the value of the variable as follows. 
		*/		
		FunctionalInterface_show display = ob -> System.out.println(ob) ;
		
		int val1 = add.operation(4, 5) , val2 = multiply.operation(6, 7) ;
		System.out.print("Addition(4, 5) = " ) ;
		display.abstractFunction(val1) ;

		System.out.print("Multiplication(6, 7) = " ) ;
		display.abstractFunction(val2) ;		
	}

}
