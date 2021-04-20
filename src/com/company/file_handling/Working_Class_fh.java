package com.company.file_handling;

public class Working_Class_fh {

	public static void main(String[] args) {
/*
		Overwriting_Files of = new Overwriting_Files() ;
		of.open_file() ;
		of.add_record("20", "Vinay", "Nagalgaonkar") ;
		of.close_file() ; 
		
		System.out.println("Reached end of program") ;
*/
		Reading_File rf = new Reading_File() ;
		rf.openFile() ; rf.readFile() ; rf.closeFile() ;
		
		System.out.println("\nThe file has been successfully read\n") ;
	}

}
 