package com.company.inheritance_p1;

// Super-Class.
class one { 
    public void print_one() { 
        System.out.println("Method of class 'one'") ; 
    } 
} 
  
// Sub-Class for class 'one'.
class two extends one { 
    public void print_two() { 
        System.out.println("Method of class 'two'") ; 
    } 
}

public class Simple_Example {

	public static void main(String[] args) {
		two twoObject = new two() ;
		// Object of class 'two' inheriting the properties of class 'one' namely it's method 'print_one()'.
		twoObject.print_one() ;
		twoObject.print_two() ;
		
		Protected_Keyword_ip1 obj = new Protected_Keyword_ip1() ;
		// Since, access modifier for this method is 'protected' it is accessible within the same package. 
		obj.display_pkip1() ;
	}

}
