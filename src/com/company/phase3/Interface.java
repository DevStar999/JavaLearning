package com.company.phase3;

// A simple interface. 
interface in1 { 
	// The following field is public, static and final. 
	final int a = 10 ; 

	// The following method is public and abstract.  
	void display() ; 
} 

// A class that implements interface. 
public class Interface implements in1{
	 // Implementing the capabilities of interface. 
	 public void display() { 
	     System.out.println("display() method is called") ; 
	 } 

	 // Driver Code 
	 public static void main (String[] args) { 
	     Interface obj = new Interface() ;
		 obj.display() ; 
	     System.out.println(a) ; 
	 } 
}
