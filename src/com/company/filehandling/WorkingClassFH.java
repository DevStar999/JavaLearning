package com.company.filehandling;

public class WorkingClassFH {
    public static void main(String[] args) {
		/*
		OverwritingFiles of = new OverwritingFiles() ;
		of.openFile() ;
		of.add_record("20", "Vinay", "Nagalgaonkar") ;
		of.close_file() ; 
		
		System.out.println("Reached end of program") ;
		*/

        ReadingFile rf = new ReadingFile();
        rf.openFile();
        rf.readFile();
        rf.closeFile();

        System.out.println("\nThe file has been successfully read\n");
    }
}
 