package com.company.phase2;

public class Variable_Length_Argument {
	
	public static int average(int ...numbers) {
		int ans = 0 ;
		for(int i=0 ; i<numbers.length ; i++) {
			ans += numbers[i] ;
		}
		return ans/numbers.length ;
	}
	
	public static void main(String[] args) {
		int arr[] = {10,11,12,13,14} ; 
		System.out.println("The avg. = " + average(3,4,5,6,7)) ;
		System.out.println("The avg. of arr = " + average(arr)) ;
	}

}
