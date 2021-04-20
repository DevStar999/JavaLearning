package com.company.phase2;

public enum Bio {
	Vinay("Good" , "20") ,
	Meet("Nice" , "21") ,
	Manu("Artist" , "21") ,
	Maan("Fine" , "19") ,
	Poojan("Gamer" , "20") ;
	
	private final String desc ;
	private final String age ;
	
	Bio(String given_desc , String given_age){
		desc = given_desc ;
		age = given_age ;
	}
	
	public String get_desc() { return desc ; }	
	public String get_age() { return age ; }
}
