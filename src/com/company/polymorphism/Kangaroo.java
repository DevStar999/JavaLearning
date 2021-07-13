package com.company.polymorphism;

// Creating a Sub-Class for the Super-Class of 'Animal'.
public class Kangaroo extends Animal {
    public Kangaroo() {
        // 	Note : Call to constructor of Super-Class must be the first statement in the Sub-Class constructor.
        //super() ; // Invoking the constructor of the Super-Class 'Animal' of this Sub-Class.
        //System.out.println("The constructor of 'Kangaroo' class is invoked") ;
        legs = 5; // Including the tail
    }

    // Over-riding the method 'movement'.[Note : Over-riding is an example of run-time polymorphism.]
    public void movement() {
        System.out.println("I am a Kangaroo that can hop");
    }
}
