package com.company.inner_class;

class Outer_v2 { 
    void outerMethod() { 
    	int val = 100 ; // Non-final local variable.
        System.out.println("inside outerMethod") ; 
        // Inner class is local to outerMethod() 
        class Inner { 
            void innerMethod() { 
                System.out.println("inside innerMethod and val = " + val) ;
                // Using non-final local variable as above. (Allowed since JDK 1.8)
                // Else, only final local variables were allowed to be accessed.
            } 
        } 
        Inner ob = new Inner() ; 
        ob.innerMethod() ; 
    } 
} 


public class Method_Local_Inner_Class {

	public static void main(String[] args) {
		Outer_v2 ob = new Outer_v2() ;
		ob.outerMethod() ;
	}

}
