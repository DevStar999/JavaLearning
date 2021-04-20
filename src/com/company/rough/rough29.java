package com.company.rough;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class rough29 {
	public static boolean compare_arraylists(ArrayList<Integer> a, ArrayList<Integer> b, Integer n) {
		for(Integer i=0 ; i<n ; i++) {
			if( a.get(i) != b.get(i) ) { return false ; }
		}
		return true ;
	}

	public static void main(String[] args) {
		Integer thisIsAVeryLongVariableNameNotEasyToType = 10;
		Scanner input = new Scanner(System.in);
		Integer t = input.nextInt() ;
		
		while( (t--) > 0 ) {
			Integer n = input.nextInt() , m = input.nextInt() , ans = 0 ;
			
			// Input is taken as follows.
			ArrayList<Integer> arr = new ArrayList<>() , sorted = new ArrayList<>() , pos = new ArrayList<>() ;
			for(Integer i=0 ; i<n ; i++) {
				Integer temp = input.nextInt() ;
				arr.add(temp) ; sorted.add(temp) ; pos.add(0) ;
			}
			Collections.sort(sorted);
			for(Integer i=0 ; i<m ; i++) {
				Integer temp = input.nextInt() ;
				temp-- ; pos.set(temp, 1) ;
			}
			
			// Streaks are sorted as follows.
			ArrayList<Integer> strk = new ArrayList<>() , null_strk = new ArrayList<>() ;
			strk.add(-1) ; strk.add(-1) ; null_strk.add(-1) ; null_strk.add(-1) ;   
			for(Integer i=0 ; i<n ; i++) {
				if( pos.get(i) == 0 ) {
					if( compare_arraylists( strk , null_strk , 2 ) == false ) {
						strk.set(1, i) ;
						Collections.sort( arr.subList(strk.get(0), strk.get(1)+1) ) ;
						strk.set(0, -1) ; strk.set(1, -1) ; 
					}
				}
				else {
					if( compare_arraylists( strk , null_strk , 2 ) ) { strk.set(0, i) ; }
					else { strk.set(1, i) ; }
				}
			}
			if( compare_arraylists( strk , null_strk , 2 ) == false ) {
				strk.set(1, n-1) ;
				Collections.sort( arr.subList(strk.get(0), strk.get(1)+1) ) ;
				strk.set(0, -1) ; strk.set(1, -1) ; 
			}

			// Verdict is as follows.
			if( compare_arraylists( arr , sorted , n ) ) { System.out.print("YES\n"); }
			else { System.out.print("NO\n"); }

			thisIsAVeryLongVariableNameNotEasyToType = 1;

		}
	}

}
