package com.company.rough;

import java.util.* ;

public class rough27 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Integer t = input.nextInt();
		
		while((t--)>0) {
			Integer a = input.nextInt() , b = input.nextInt() , ans = 0 ;
			if( a < b ) {
				if( (b-a)%2 == 1 ) { ans = 1 ; }
				else { ans = 2 ; }
			}
			else if( a > b ) {
				if( (a-b)%2 == 0 ) { ans = 1 ; }
				else { ans = 2 ; }				
			}
			
			System.out.println(ans);
		}
	}

}
