package com.company.java_streams;

import java.util.* ;
import java.util.stream.* ;

public class Statistics_Collectors {

	public static void main(String[] args) {
		IntStream isObject = IntStream.range(1,11) ;
		List<Integer> lt = Arrays.asList(1,6,2,7,3,8,5,4) ;

		IntSummaryStatistics iss1 = isObject.summaryStatistics() ; 		
		IntSummaryStatistics iss2 = lt.stream().mapToInt( x -> x ).summaryStatistics() ;
		
		System.out.println("The stats of 'iss1' are as follows :") ;
		System.out.println( iss1 ) ;
		
		System.out.println("\nThe stats of 'iss2' are as follows :") ;
		System.out.println("Max for 'iss2' = " + iss2.getMax()) ;
		System.out.println("Min for 'iss2' = " + iss2.getMin()) ;
		System.out.println("Count for 'iss2' = " + iss2.getCount()) ;
		System.out.println("Average for 'iss2' = " + iss2.getAverage()) ;
		System.out.println("Sum for 'iss2' = " + iss2.getSum()) ;
	}

}
