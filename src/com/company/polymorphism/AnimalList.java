package com.company.polymorphism;

public class AnimalList {
	private Animal wildlife[] = new Animal[5] ;
	private int counter = 0 ;
	
	public void add(Animal a) {
		if( counter < wildlife.length ) {
			wildlife[ counter ] = a ;
			System.out.println("Animal is added at index " + counter) ;
			counter++ ;
		}
	}
}
