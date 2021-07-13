package com.company.polymorphism;

// Creating a Sub-Class for the Super-Class of 'Animal'.
public class Eagle extends Animal {
    public Eagle() {
        // 	Note : Call to constructor of Super-Class must be the first statement in the Sub-Class constructor.
        //super() ; // Invoking the constructor of the Super-Class 'Animal' of this Sub-Class.
        //System.out.println("The constructor of 'Eagle' class is invoked") ;
        legs = 2;
    }

    // Over-riding the method 'movement'.[Note : Over-riding is an example of run-time polymorphism.]
    public void movement() {
        System.out.println("I am an Eagle that can fly");
    }
}
