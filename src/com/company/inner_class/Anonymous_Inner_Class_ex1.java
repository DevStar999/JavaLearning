package com.company.inner_class;

class Utility { 
	void show() { 
		System.out.println("Inside show() method of super class") ; 
	} 
} 


public class Anonymous_Inner_Class_ex1 {

	//  An Anonymous Inner Class with 'Test_Utility' as base class i.e. a subclass of specified type. 	
	static Utility ob = new Utility() { 
       void show() { 
           super.show() ; 
           System.out.println("Inside show() Test class") ; 
       } 
	} ; 
	
	public static void main(String[] args) {
		ob.show() ;
	}	
	
}
