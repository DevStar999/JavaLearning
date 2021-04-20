package com.company.java_streams;

import java.util.* ;

class person{
	private String fname ;
	private String lname ;
	private Integer age ;
	
	public person(String given_fn, String given_ln, Integer given_age) {
		fname = given_fn ; lname = given_ln ; age = given_age ; 
	}
	
	public String getFname() { return fname ; }
	public void setFname(String fname) { this.fname = fname ; }
	
	public String getLname() { return lname ; }
	public void setLname(String lname) { this.lname = lname ; }
	
	public Integer getAge() { return age ; }
	public void setAge(Integer age) { this.age = age ; }
}


public class Streams_Simple_Example {

	public static void main(String[] args) {
		List<person> people = 	Arrays.asList( 
				new person("Vinay", "Nagalgaonkar", 20) ,
				new person("Meet", "Mehta", 21) ,
				new person("Manvendra", "Kushwah", 19) ,
				new person("Manu", "Sheoran", 21)  
			) ;

		System.out.println("Printed below is the list of people whose first name starts with 'M' :") ;
		people.stream() // Using stream in this line.
		.filter( p-> p.getFname().startsWith("M") ) 
		.forEach( p -> System.out.println( p.getFname() + " " + p.getLname() ) ) ;		
	}

}
