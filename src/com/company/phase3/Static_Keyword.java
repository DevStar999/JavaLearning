package com.company.phase3;

public class Static_Keyword {
	/* Static variables - 	(i) When a variable is declared as static, then a single copy 
	 						of variable is created and shared among all objects at class level.
							(ii) We can create static variables at class-level only.
							(iii) Static blocks and static variables are executed in the 
							order in which they are present in the program. 
	*/
	static int var1 ,  var2 ;
	static int members = 0 ;
	
	/* 	Static block - 	(i) These are used when the static variables need to be computed or just initialized.
						(ii) They are executed exactly once when the class is first loaded.
	*/
	static {
		var1 = 10 ; var2 = 20 ;
		System.out.println("The value of var1 is initialized to - " + var1 +  " and that of var2 to - " + var2) ;
	}
	
	/* Stack method -  	(i)Any static member (including a static method) can be accessed before
	 					any objects of its class are created, and without reference to any object.
	 					(ii) Static methods have several restrictions which are as follows :
	 						(a) They can only directly call other static methods.
	 						(b) They can only directly access static data.
	 						(c) They cannot refer to this or super in any way.
	
	*/
	static void m1() {
		System.out.println("This is method m1") ;
	}
	
	/* 	Example of static member being used in a non-static method, 
	  	but the vice-versa will give compilation error.
	*/
	public Static_Keyword() {
		members++ ;
	}
	
	public static void main(String[] args) {
		/* 	Example of a static method being accessed before any of the objects of this class are created
			and without reference to any object, is as follows.
		*/
		m1() ;
	}

	/* 	Use of static variables and methods - 	We should use a static variable for the property that is 
	  											common to all objects. For example, in class Student, 
	  											all students shares the same college name. 
	  											We should use static methods for changing static variables. 
	*/
	
	/* 	Note on static nested classes -  We can not declare top-level class with a static modifier, 
	  									 but can declare nested classes as static. Such type of classes 
	  									 are called Nested static classes.  
	*/
}
