package com.company.phase4;

import java.util.* ;

public class Wrapper_Classes {

	public static void main(String[] args) {
		char ch = 'a' ;
		/** Auto-boxing and Un-boxing **/
		// Auto-boxing : primitive 'char' to 'Character' object conversion.
		Character ch_obj = ch ;
		// Un-boxing : 'Character' object to primitive 'char' conversion. 
        char a = ch_obj ;
		
        /** Utility methods for the Wrapper classes **/
        /* Here, Wrapper can take values like Integer, Double, Float, Long etc. */
        /* 	(1) 'Wrapper.valueOf()' method - We can use valueOf() method to create Wrapper 
        		object for given primitive or String. 
        */ 
        Integer i1 = Integer.valueOf("10") ;  // (1.a) wrapper.valueOf(String s)
        Integer i2 = Integer.valueOf("1111", 2) ; // (1.b) wrapper.valueOf(String s, int radix) { radix : [2,36] }
        Integer i3 = Integer.valueOf(10) ; // (1.c) wrapper.valueOf(primitive p)
	
        /* 	(2) 'wrapperValue()' method - We can use wrapperValue() method to get the primitive for the 
        		given Wrapper Object. Every number type Wrapper class(Byte, Short, Integer, Long, Float, Double) 
        		contains the corresponding 6 methods to get primitive for the given Wrapper object. 
        */ 
        Integer test = 30 ;
        byte btest = test.byteValue() ;
        long ltest = test.longValue() ;
        
        /*	(3) 'parseWrapper()' method - We can use parseWrapper() methods to convert String to primitive. */
        int i4 = Integer.parseInt("10") ; // (3.a) Wrapper.parseWrapper(String s)
        long l = Long.parseLong("1111", 4) ; // (3.b) Wrapper.parseWrapper(String s, int radix)
        
        /*	(4) 'Wrapper.toString()' method - We can use toString() method to convert Wrapper object 
        		or primitive to String. 
        */
        Integer i5 = 10 ;
        String str1 = i5.toString() ; // (4.a) variable.toString()
        String str2 = Integer.toString(10) ; // (4.b) Wrapper.toString(corresponding_primitive p)
        String str3 = Integer.toString(15,2) ; // (4.c) Wrapper.toString(corresponding_primitive p, int radix) 		
	}

}
