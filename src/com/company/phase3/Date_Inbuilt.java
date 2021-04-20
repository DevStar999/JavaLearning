package com.company.phase3;

import java.util.*;
//import java.util.Date; Importing everything using above line but this is the specific path for 'Date' class.

public class Date_Inbuilt {

	public static void main(String[] args) {
		/** Most commonly used constructors for 'Date' class **/
		// (1) Creates date object representing current date and time.
		Date d1 = new Date() ;

		// (2) Creates a date object for the given milliseconds since January 1, 1970, 00:00:00 GMT.
		Date d2 = new Date(2323223232L) ;
	
		// (3) Setting year, month and date for the object. Remember, the offsets for year and month.
		int date = 4 , month = 2 , year = 2019 ;
		Date d3 = new Date(year-1900,month-1,date) ;
		/* Note : 	Here, the offsets may cause to values of the attributes to be off-mark but with the given offset
 					they now represent the correct date when they are required to be used by functions.
		*/
		
		// (4) Setting year, month, date, hours, minutes and seconds for the object.
		int hrs = 17 , min = 47 , sec = 34 ;
		Date d4 = new Date(year-1900,month-1,date,hrs,min,sec) ;
		System.out.println(d4) ;

		/** Most commonly used methods for 'Date' class **/
		// (1).after()-Tests if object date is after the given date(i.e.for this ex.,is d4 after arg. date or not).
		System.out.println("The given date is after date d4 : " + d4.after( new Date(year-1900,month-1,date-56) )) ;
		
		// (2).before()-Tests if object date is before the given date(i.e.for this ex.,is d4 before arg. date or not).
		System.out.println("The given date is before date d4 : " + d4.before( new Date(year-1900,month-1,date-56) )) ;
		
		/* (3).compareTo()-Compares the object date to given date. <0, =0 and >0 if the object date is before than,
							equal to or after the given(argument) date.
		*/
		int verdict = d4.compareTo( new Date(year-1900,month-1,date-56) ) ;
		if( verdict < 0 ) { System.out.println("The given date is before the date d4") ; }
		else if( verdict == 0 ) { System.out.println("The given date is same as date d4") ; }
		else { System.out.println("The given date is after the date d4") ; }
		
		// (4).getTime()-Returns the number of milliseconds since January 1, 1970, 00:00:00 GMT of the date object.
		long milli = d4.getTime() ;
		System.out.println("The millisecond representation of date d4 = " + milli) ;
	}

}
