package com.company.jbAndroidDevPhase1;

public class Working_Class {

	public static void main(String[] args) {
		Animal bird = new Bird("Green", 2);
		Animal retriever = new Retriever("Golden", 4);
		Animal rotweiler = new Rotweiler("Black", 4);
		Animal turtle = new Turtle("Dark Green", 4);
		
		// Bird.
		bird.describe_itself();
		bird.movement();
		System.out.println();
		
		// Retriever.
		retriever.describe_itself();
		retriever.movement();
		System.out.println();
		
		// Rotweiler.
		rotweiler.describe_itself();
		rotweiler.movement();
		System.out.println();
		
		// Turtle.
		turtle.describe_itself();
		turtle.movement();
	}

}
