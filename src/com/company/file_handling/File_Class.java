package com.company.file_handling;

import java.io.*;

public class File_Class {

	public static void main(String[] args) {
		/* 	The object of 'File' class is used in the following program to check if the file 'Info_File.txt' 
 			exists or not as follows.
		*/
		File f = new File("C:\\B.Tech Archives\\Skill Set\\Java Programming 2019"
				+ "\\Learning\\src\\file_handling\\Info_File.txt") ;

		if( f.exists() ) {
			System.out.println( f.getName() +  " does exist!" ) ;
		}
		else {
			System.out.println( "This thing doesn't exist." ) ;
		}
	}

}
