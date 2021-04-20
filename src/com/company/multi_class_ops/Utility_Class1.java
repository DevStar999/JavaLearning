package com.company.multi_class_ops;

public class Utility_Class1 {	
	private String var_name ;
	
	// Constructors.
	public Utility_Class1(){}
	
	public Utility_Class1(String name) {
		var_name = name ;
	}

	// Other Methods.
	public void set_name(String name) {
		var_name = name ;
	}

	public String get_name() {
		return var_name ;
	}
	
	public void greet() {
		System.out.println("Hello " + get_name() + " !!") ;
	}
	
	public void print1() {
		System.out.println("This is the function of Utility_Class1");
	}
	
}
