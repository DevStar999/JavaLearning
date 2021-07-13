package com.company.start;

public class SwitchCase {
	public void simpleMessage() {
		System.out.println("This function is from SwitchCase Class");
	}
	public static void main(String[] args) {
		int age = 1;
		
		switch(age){
			case 1:{
				System.out.println("Your age is 1");
				break;
			} 
			case 2:{
				System.out.println("Your age is 2");
				break;
			}
			case 3:{
				System.out.println("Your age is 3");			
				break;
			}
			default:{
				System.out.println("You are older than 3 years");				
				break;
			}
		}
	}
}
