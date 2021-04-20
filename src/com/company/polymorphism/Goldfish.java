package com.company.polymorphism;

// Creating a Sub-Class for the Super-Class of 'Animal'.
public class Goldfish extends Animal{

	public Goldfish() {
		// 	Note : Call to constructor of Super-Class must be the first statement in the Sub-Class constructor.   
		/* 	Invoking the constructor of the Super-Class 'Animal' of this Sub-Class. An example of 
			'super' with constructors.
		*/
		// super() ; 
		// System.out.println("The constructor of 'Goldfish' class is invoked") ;
		legs = 0 ;
		/* 	Making a reference to the 'legs' attribute of the Super-Class 'Animal' of this Sub-Class. 
			An example of 'super' with variables.
		*/
		// super.legs = 4 ;
	}

	// Over-riding the method 'movement'.[Note : Over-riding is an example of run-time polymorphism.]
	public void movement() {
		/* 	Making a call to the 'movement' method of the Super-Class 'Animal' of this Sub-Class. 
			An example of 'super' with methods.
		*/
		// super.movement() ;
		System.out.println("I am a Goldfish that can swim") ;
	}	
	
}
