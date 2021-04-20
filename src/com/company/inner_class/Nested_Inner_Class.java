package com.company.inner_class;

class Outer_v1 { 
	private Integer field1 ;
	
	class Inner { 
		public void show() { 
	        field1 = 10 ;
			System.out.println("In a nested class method") ; 
	    }  
	}

	public Integer getField1() { return field1 ; }
	public void setField1(Integer field1) { this.field1 = field1 ; } 
} 

public class Nested_Inner_Class {

	public static void main(String[] args) {
		Outer_v1.Inner inner_class_object = new Outer_v1().new Inner() ;
		inner_class_object.show() ;
		Outer_v1.Inner ob = new Outer_v1().new Inner() ;		
	}

}
