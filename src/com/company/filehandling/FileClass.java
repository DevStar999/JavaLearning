package com.company.filehandling;

import java.io.File;

public class FileClass {
    public static void main(String[] args) {
		/* 	The object of 'File' class is used in the following program to check if the file 'InfoFile.txt'
 			exists or not as follows.
		*/
        File f = new File("src/com/company/filehandling/InfoFile.txt");

        if (f.exists()) {
            System.out.println(f.getName() + " does exist!");
        } else {
            System.out.println("This thing doesn't exist.");
        }
    }
}
