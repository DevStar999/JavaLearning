package com.company.phase2;

public class Enhanced_for {

	public static void main(String[] args) {
		int sum = 0 ;
		int arr[] = {4, 5, 6, 7, 8} ;
		for(int val: arr) {
			sum += val ;
		}
		System.out.println("sum = " + sum) ; 
		
		System.out.println("The elements of the array in the addition step are as follows :") ;
		for(int val: arr) {
			val = val + 5 ;
			System.out.print(val + " ") ;
		}
		System.out.println() ;
		System.out.println("The elements of the array are as follows :") ;
		for(int i=0 ; i<arr.length ; i++) {
			System.out.print(arr[i] + " ") ;
		}
	}

}
