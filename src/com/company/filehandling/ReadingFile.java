package com.company.filehandling;

import java.io.File;
import java.util.Scanner;

public class ReadingFile {
    private Scanner scan;

    public void openFile() {
        try {
            scan = new Scanner(new File("src/com/company/filehandling/InfoFile.txt"));
        } catch (Exception e) {
            System.out.println("We have an error.");
        }
    }

    public void readFile() {
        while (scan.hasNext()) {
            String age = scan.next();
            String firstName = scan.next();
            String lastName = scan.next();

            System.out.printf("%s %s %s\n", age, firstName, lastName);
        }
    }

    public void closeFile() {
        scan.close();
    }
}
