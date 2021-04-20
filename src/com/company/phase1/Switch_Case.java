package com.company.phase1;

public class Switch_Case {
	public void simple_message() {
		System.out.println("This function is from Switch_Case Class");
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
