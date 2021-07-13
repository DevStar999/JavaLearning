package com.company.strings;

public class Strings1 {
    public static void main(String[] args) {
        // Declaring few sample String variables to work with as follows
        String str1 = "Some value.";

        /* Remove last character from a string (WITHOUT null check and length check) */
        String str1LastCharRemoved = str1.substring(0, str1.length() - 1);
        System.out.println("str1LastCharRemoved = " + str1LastCharRemoved);

        /* Remove last character from a string (WITH null check and length check) */
        String str1LastCharRemovedWithChecks =
                (str1 != null && str1.length() > 0) ? str1.substring(0, str1.length() - 1) : str1;
        System.out.println("str1LastCharRemovedWithChecks = " + str1LastCharRemovedWithChecks);

        // Trick to capitalize the first letter of the string and keep other characters of lower-case.
        String cap = "vInaY";
        cap = (cap.toUpperCase()).substring(0, 1) + (cap.toLowerCase()).substring(1);
        System.out.println("\ncap = " + cap);

        // String reverse.
        String forward = "123456789";
        String rev = ((new StringBuilder(forward)).reverse()).toString();
        System.out.println("rev = " + rev);
    }
}
