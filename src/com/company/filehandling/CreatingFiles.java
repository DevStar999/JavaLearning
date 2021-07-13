package com.company.filehandling;

import java.io.*;
import java.util.*;

public class CreatingFiles {
    public static void main(String[] args) {
        File f = new File("src/com/company/filehandling/InfoFile.txt");
		/* 	Here, an object of the 'Formatter' class is been used to create a file.  
			When the object of 'Formatter' class is initialized, then it will create the file regardless if it
			exists or not. If it exists, it replace a new file with the same name in the specified location.
		*/
        Formatter fm;

        try {
            if (!(f.exists())) { // Creating a new file only if it doesn't exist
                fm = new Formatter("src/com/company/filehandling/InfoFile.txt");
                System.out.println("We have created a file");
            } else {
                System.out.println("The file already exists");
            }
        } catch (Exception e) {
            System.out.println("We have got an error");
        }
    }
}
