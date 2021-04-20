package com.company.jbAndroidDevPhase1;

public class Animal {
	private String color;
	private Integer legs;

	public Animal(String color, Integer legs) {
		this.color = color;
		this.legs = legs;
	}	
	
	public void describe_itself() {
		System.out.println("My color is " + getColor() + " and I have " + getLegs() + " legs.");
	}
	
	public void movement() {}
	
	public String getColor() { return color; }
	public void setColor(String color) { this.color = color; }
	
	public Integer getLegs() { return legs; }
	public void setLegs(Integer legs) { this.legs = legs; }
}
