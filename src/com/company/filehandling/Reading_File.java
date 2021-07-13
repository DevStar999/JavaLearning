package com.company.file_handling;

import java.io.*;
import java.util.*;
import java.lang.*;

public class Reading_File {
	private Scanner scan ;  

	public void openFile(){
		try {
			scan = new Scanner(new File("C:\\B.Tech Archives\\Skill Set\\Java Programming 2019"
				+ "\\Learning\\src\\file_handling\\Info_File.txt")) ;
		}
		catch(Exception e) {
			System.out.println("We have an error.") ;
		}
	}
	
	public void readFile() {
		while(scan.hasNext()) {
			String age = scan.next() ;
			String fname = scan.next() ;
			String lname = scan.next() ;
		
			System.out.printf("%s %s %s\n", age, fname, lname) ;
		}
	}
	
	public void closeFile() {
		scan.close() ;
	}
}
