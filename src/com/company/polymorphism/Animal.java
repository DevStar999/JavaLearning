package com.company.polymorphism;

// Creating a Super-Class named 'Animal'.
public class Animal {
	// Declaring this attribute as public for showing the use of 'super' keyword nicely.
	public int legs ;
	
	public Animal() {
		legs = 4 ;
		// System.out.println("The constructor of 'Animal' class is invoked") ;
	}
	
	public void movement() {
		System.out.println("I am an animal that can walk") ;
	}
	
}
