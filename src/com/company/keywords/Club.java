package com.company.keywords;

// This class is used as a utility class for the class 'StaticKeyword'.
public class Club {
    private String name;
    // The main intention of this class is to use the static keyword.
    private static int members = 0;

    public Club() {
        members++;
    }

    public Club(String name) {
        this.name = name;
        members++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static int members_count() {
        return members;
    }
}
