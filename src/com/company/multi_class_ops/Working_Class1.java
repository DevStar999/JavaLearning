package com.company.multi_class_ops;

import java.util.* ;
import com.company.phase1.Switch_Case ; // Importing specifically the class - Switch_Case from the package - phase1.
//This can be done as follows too :
/*
import phase1.* ; // Importing all classes from package - phase1.
*/
public class Working_Class1 {
	
	public static void main(String[] args){
		Scanner input =  new Scanner(System.in) ;
		
		UtilityClass1 ob = new UtilityClass1() ;
		// Always initialize the class object with new and the class name followed by brackets.
		ob.print1() ;
		
		Switch_Case sw_ob = new Switch_Case() ; 
		// Switch_Case class is from another package. However, is it has been imported for use(using line 4).  
		sw_ob.simple_message() ;
		
		/*
		System.out.print("Enter your name here : ") ;
		String temp = input.nextLine() ;
		ob.set_name(temp) ;
		ob.greet() ; 
		*/
		
		UtilityClass1 ob1 = new UtilityClass1("Meet Mehta") ;
		ob1.greet() ;
	}

}
