package com.company.inheritancephase2;

import com.company.inheritancephase1.* ;

// Sub-Class of class 'Protected_Keyword_ip1' which is from a different package namely 'inheritancephase1'.
public class Protected_Keyword_ip2 extends Protected_Keyword_ip1{

	protected void display_pkip2() {
		System.out.println("display_pkip2() method of class Protected_Keyword_ip2") ;
	}
	
	public static void main(String[] args) {
		Protected_Keyword_ip2 obj = new Protected_Keyword_ip2() ;
		/* 	Since, access modifier for this method is 'protected' it is accessible 
			within a sub-class even in a different package.
		*/
		obj.display_pkip1() ;
	}
}
