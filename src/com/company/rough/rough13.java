package com.company.rough;

public class rough13 {

	public static void main(String[] args) {

		int v1 = 12 , v2 = 35 , chk = 1 ;
		long num = v1 ;
		
		if( v1 == 12 && v2 == 35 ) {
			System.out.println("Just tested multiple conditions together") ;
		}
		
		if( v1 == 12 || v2 == 35 ) {
			System.out.println("Just tested multiple conditions together again") ;
		}
		
		// Conditional operator .
		chk = (chk == 1) ?  100 : 200 ;
		System.out.println("chk = " + chk) ;
	}

}
