package dateandtime;

import java.util.*;
import java.util.Date;
//import java.util.Calendar; Importing everything using above line but this is the specific path for 'Calendar' class.

public class Calendar_Inbuilt {

	public static void main(String[] args) {
		/** Most commonly used ways to initialize the 'Calendar' class are as follows **/
		// (1) Gets a calendar using the default time zone and locale.
		Calendar c1 = Calendar.getInstance() ;

		// (2) Using a 'Date' object with the function .setTime().
		int year = 2019 , month = 2 , date = 4 ;
		Calendar c2 = Calendar.getInstance() ;
		c2.setTime( new Date(year-1900,month-1,date) ) ;
		
		/** Most commonly used methods for the 'Calendar' class are as follows **/
		/* Some 'Calendar' fields are : YEAR, DATE(1-31), MONTH(0-11), DAY_OF_WEEK(0-6), 
		  								DAY_OF_YEAR(1-366), WEEK_OF_YEAR, MINUTE, SECOND, HOUR, AM_PM, 
		  								WEEK_OF_MONTH, DAY_OF_WEEK_IN_MONTH, HOUR_OF_DAY.
		*/
		System.out.println("The day of month for the current date = " + c2.get(Calendar.DATE)) ;
		System.out.println("The month for the current date = " + c2.get(Calendar.MONTH)) ;
		System.out.println("The year for the current date = " + c2.get(Calendar.YEAR)) ;
		System.out.println("The day of week for the current date = " + c2.get(Calendar.DAY_OF_WEEK)) ;
	}

}
