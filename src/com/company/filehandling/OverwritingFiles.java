package com.company.filehandling;

import java.util.Formatter;

public class OverwritingFiles {
    private Formatter fm;

    public void openFile() {
        try {
            fm = new Formatter("src/com/company/filehandling/InfoFileV2.txt");
        } catch (Exception e) {
            System.out.println("We have got an error");
        }
    }

    public void add_record(String field1, String field2, String field3) {
        fm.format("%s %s %s", field1, field2, field3);
    }

    public void close_file() {
        fm.close();
    }
}
