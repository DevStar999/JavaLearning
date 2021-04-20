package com.company.file_handling;

import java.io.*;
import java.util.*;
import java.lang.*;

public class Overwriting_Files {
	private Formatter fm ;
	
	public void open_file() {
		try {
			fm = new Formatter("C:\\B.Tech Archives\\Skill Set\\Java Programming 2019"
					+ "\\Learning\\src\\file_handling\\Info_File_v2.txt") ;			
		}
		catch(Exception e) {
			System.out.println("We have got an error") ;
		}
	}
	
	public void add_record(String field1 , String field2 , String field3) {
		fm.format("%s %s %s" , field1 , field2 , field3) ;
	}
	
	public void close_file() {
		fm.close() ; 
	}
}
