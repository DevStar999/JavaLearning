package com.company.rough;

import java.util.* ;
import javafx.util.* ;
import java.math.* ;

public class rough11 {	
	public static int getItself(int val , int dummy) { return val ; }
	
	public static int gcd(int a , int b) {
		if( a > b ) { a = getItself(b,b=a) ; }
		
		if( b%a == 0) { return a ; }
		else { return gcd(a,b%a) ; }
	}
	
	public static String give_day(int val) {
		String ans = "" ;
        switch( val ){
        	case 1 : { ans = "SUNDAY" ; break ; }   	
        	case 2 : { ans = "MONDAY" ; break ; }
	        case 3 : { ans = "TUESDAY" ; break ; }
	        case 4 : { ans = "WEDNESDAY" ; break ; }
	        case 5 : { ans = "THURSDAY" ; break ; }
	        case 6 : { ans = "FRIDAY" ; break ; }          
	        case 7 : { ans = "SATURDAY" ; break ; }
        }
        return ans ;
	} 
	
	public static void main(String[] args) {
/*
		int a = 14 , b = 18 , gd = gcd(a,b) ;
		a = getItself(b , b = a) ;
		System.out.println("a = " + a + " , b = " + b) ;
		System.out.println("GCD( " + a + " , " + b + " ) = " + gd) ;

        Date d = new Date(2019-1900,1-1,26) ;
        Calendar c = Calendar.getInstance() ;
        c.setTime(d) ;
        System.out.println( "Date = " + d ) ;
*/
		
		try {
			int num = 14/0 ;
		}
		catch(Exception e) {
			System.out.print("Message = " + e.getMessage() + "\ntoString() = " + e.toString()) ;
			System.out.print("\nCause = " + e.getCause() + "\n") ;
			System.out.print("e = " + e + "\n") ;
		}
	}

}
