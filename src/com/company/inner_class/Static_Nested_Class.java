package com.company.inner_class;

// Outer class 
class OuterClass {  
	
	// Static member 
	static int outer_x = 10 ; 
   
	// Instance(non-static) member 
	int outer_y = 20 ; 
   
	// Private member 
	private static int outer_private = 30 ; 
   
	// Static Nested Class 
	static class StaticNestedClass { 
		void display() { 
         // Can access static member of outer class 
         System.out.println("outer_x = " + outer_x) ; 
           
         // Can access private static member of outer class 
         System.out.println("outer_private = " + outer_private) ; 
           
         // The following statement will give compilation error, 
         // as static nested class cannot directly access non-static members 
         // System.out.println("outer_y = " + outer_y); 
		} 
	} 
	
} 


public class Static_Nested_Class {

	public static void main(String[] args) {
        // Accessing a Static Nested Class 
        OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass() ; 
        nestedObject.display() ; 
	}

}
