package com.company.jbAndroidDevPhase1;

// Class for Parrot.
public class Bird extends Animal {
	public Bird(String color, Integer legs) {
		super(color, legs);
	}

	public void movement() {
		System.out.println("Flying like a bird flies");
	}
}
