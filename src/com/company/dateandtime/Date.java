package com.company.dateandtime;

public class Date {
    private int day, month, year;

    public Date() {
    }

    public Date(int d, int m, int y) {
        day = d;
        month = m;
        year = y;

        System.out.printf("The date has been initialized to - %s\n", this);
    }

    /* 	Since, 'this' in the constructor will look for a reference to the object in String format we are
        Overriding the following built-in method to have a Date object in String format as follows.
    */
    public String toString() {
        return String.format("%d/%d/%d", day, month, year);
    }
}
