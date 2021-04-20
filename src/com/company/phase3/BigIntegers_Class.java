package com.company.phase3;

import java.math.*; // This package needs to be imported to use the 'BigInteger' class.
import java.util.*;

public class BigIntegers_Class {

	public static void main(String[] args) {
		/** Most commonly used constructors for 'BigIntegers' class **/ 
		// (1) Initializing the 'BigInteger' variable with an 'int' by converting it into a String first.
		int val1 = 12 ;
		BigInteger num1 = new BigInteger( Integer.toString(val1) ) ; 
	
		// (2) Initializing the 'BigInteger' variable with a String.
		BigInteger num2 = new BigInteger("4") ;

		// (3) Initializing the 'BigInteger' variable with in-built static constant fields(namely 0,1 & 10).
		BigInteger num3 = BigInteger.ZERO ; // BigInteger.ONE or BigInteger.TEN is also valid.  		

		// (4) Initializing the 'BigInteger' variable using in-built method.
		BigInteger num4 = BigInteger.valueOf(56) ; 

		/* (5) Initializing the 'BigInteger' variable with value(in String format) in a number system 
		 	with a specific radix(base) and then specifying the radix as the second parameter. This constructor
		 	will convert this value to the equivalent value in the decimal number system. 
		*/
		BigInteger num5 = new BigInteger("1000" /* Binary equivalent for 8 */ , /* radix = 2 (i.e. Binary) */ 2) ; 
		
		/** Most commonly used methods for 'BigIntegers' class **/ 
		/* Set 1 */
		BigInteger sum = num1.add(num2) ;
		BigInteger diff = num1.subtract(num2) ;
		BigInteger product = num1.multiply(num2) ;
		BigInteger quotient = num1.divide(num2) ;
		
		/* Set 2 */
		// -1, 0 or 1 for num1 being less, equal or greater than num2 respectively.
		int verdict = num1.compareTo(num2) ; 
		// Conversion methods.
		int it = num1.intValue() ; double db = num1.doubleValue() ; float ft = num1.floatValue() ;
		String str = num1.toString() ;
		// The following method return true if 'num1' is probably a prime or false when it is definitely composite. 
		boolean prime_or_not = num1.isProbablePrime(1) ;

		/* Set 3 */
		BigInteger max_val = num1.max(num2) ; BigInteger min_val = num1.min(num2) ;
		BigInteger mod_val = num1.mod(num2) ; // mod_val = num1 % num2 .
		BigInteger mod_inverse = num1.modInverse(num2) ; // mod_inverse = ( num1^(-1) ) % num2 .
		BigInteger mod_expo = num1.modPow(num2,num3) ; // mod_expo = (num1 ^ num2) % num3 .
		BigInteger neg_val = num1.negate() ; // neg_val = (-1) * num1 .
		BigInteger expo_val = num1.pow(10/* exponent in the form of an int */) ; // expo_val = num1 ^ 10 .
	}

}
