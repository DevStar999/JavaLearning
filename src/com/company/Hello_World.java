package com.company;

import java.util.* ;

public class Hello_World {
//	public static void main(String[] args) {
//		System.out.println("Hello World!!") ;
//		System.out.println("Hi Bro!!") ;
	    public static void main(String[] args) {
	        System.out.println("Enter your name : "); 
	        Scanner scan = new Scanner(System.in);
	        String name = "";

	        name += scan.nextLine();
	        scan.close();

	        System.out.println("Your name is : " + name); 
	    }
//	}
}
