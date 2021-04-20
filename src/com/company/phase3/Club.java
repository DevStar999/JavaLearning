package com.company.phase3;

// This class is used as a utility class for the class 'Static_Keyword'.
public class Club {
	private String name ;
	// The main intention of this class is to use the static keyword.
	private static int members = 0 ;
	
	public Club() { members++ ; }
	public Club(String given_name){
		name = given_name ;
		members++ ;
	}
	
	public void set_name(String given_name) { name = given_name ; }
	public String get_name() { return name ; }
	
	public static int members_count() {
		return members ;
	}
}
