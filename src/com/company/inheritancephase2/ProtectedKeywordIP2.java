package com.company.inheritancephase2;

import com.company.inheritancephase1.*;

// Sub-Class of class 'ProtectedKeywordIP1' which is from a different package namely 'inheritancephase1'.
public class ProtectedKeywordIP2 extends ProtectedKeywordIP1 {

    protected void displayPkip2() {
        System.out.println("displayPkip2() method of class ProtectedKeywordIP2");
    }

    public static void main(String[] args) {
        ProtectedKeywordIP2 obj = new ProtectedKeywordIP2();
		/* 	Since, access modifier for this method is 'protected' it is accessible 
			within a sub-class even in a different package.
		*/
        obj.displayPkip1();
    }
}
