package com.company.inner_class;

interface Hello{
	void show() ;
}


public class Anonymous_Inner_Class_ex2 {

	public static void main(String[] args) {
	    /* 	An Anonymous Inner Class that implements Hello interface i.e. 
		 	as an implementer of the specified interface. 
	    */
	    Hello ob = new Hello() { 
	        public void show() { 
	            System.out.println("i am in anonymous class") ; 
	        } 
	    } ;		
		
	    ob.show() ; 
	}

}
