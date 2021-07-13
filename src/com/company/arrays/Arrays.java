package com.company.arrays;

public class Arrays {

	public static void main(String[] args) {
		int arr[] = new int[10] ;
		int arr1[] = { 41 , 42 , 43 , 44 ,45 } ;
		System.out.println("The array elements are as follows :") ;
		for(int i=0 ; i<10 ; i++) {
			arr[i] = i ;
			System.out.print(arr[i] + " ") ;
		}
		update(arr) ;

		System.out.println("\nThe array elements after update are as follows :") ;
		for(int i=0 ; i<10 ; i++) {
			System.out.print(arr[i] + " ") ;
		}
	}


	public static void update(int a[]) {
		for(int i=0 ; i<a.length ; i++) {
			a[i] += 10 ;
		}
	}
}
