package com.company.phase4;

public class Simple_Recursion {
	private String prod = "" ;
	
	public long fact(long n) {
		if( n <= 1 ) {
			prod = prod.concat( Integer.toString((int)n) + " " ) ;
//			System.out.println( "eval(now) = " + prod );
			return 1 ;
		}
		else {
			prod = prod.concat( Integer.toString((int)n) + " * " ) ;
//			System.out.println( "eval(now) = " + prod );
			return n * fact(n-1) ; 
		}
	}
	
	public long get_fact(long n) {
		prod = "" ;
		return fact(n) ;
	}
	
	public static void main(String[] args) {
		Simple_Recursion obj = new Simple_Recursion() ;
		long ans1 = obj.get_fact(7) ;
		System.out.println("7! = " + obj.prod + " = " + ans1) ;
		long ans2 = obj.get_fact(5) ;
		System.out.println("5! = " + obj.prod + " = " + ans2) ;

	}

}
