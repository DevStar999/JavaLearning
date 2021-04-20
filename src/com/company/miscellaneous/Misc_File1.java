package com.company.miscellaneous;

import java.util.*;
import java.math.*;

public class Misc_File1 {

	public static void main(String[] args) {
		/** Some Miscellaneous programming tricks are as follows **/
		// Conversion of 'int' to String.
		String str = Integer.toString(10) ;

		// Rounding-off a 'double' variable to certain decimal places. 
		double db = 3.5789055 ;
		double ro_val = BigDecimal.valueOf(db).setScale(3 /* Number of decimal places */, RoundingMode.HALF_UP)
							.doubleValue() ; // Rounded-off value.
		
		// Printing the 'double' value till only 2 decimal places which is specified by '%.2f', as follows.
		System.out.printf("%.2f", db) ;
		
		// Trick to capitalize the first letter of the string and keep other characters of lower-case.
		String cap = "vInaY" ;
		cap = (cap.toUpperCase()).substring(0, 1) + (cap.toLowerCase()).substring(1) ;
		System.out.println("\ncap = " + cap ) ;
				
		// String reverse.
		String forward = "123456789" ;
		String rev = ( ( new StringBuilder(forward) ).reverse() ).toString() ;
		System.out.println("rev = " + rev ) ;
	}

}
