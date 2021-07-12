package com.company.strings;

public class Strings1 {
    public static void main(String[] args) {
        // Declaring few sample String variables to work with as follows
        String str1 = "Some value.";

        /* Remove last character from a string (WITHOUT null check and length check) */
        String str1LastCharRemoved = str1.substring(0, str1.length()-1);
        System.out.println("str1LastCharRemoved = " + str1LastCharRemoved);

        /* Remove last character from a string (WITH null check and length check) */
        String str1LastCharRemovedWithChecks =
                (str1 != null && str1.length() > 0) ? str1.substring(0, str1.length()-1) : str1;
        System.out.println("str1LastCharRemovedWithChecks = " + str1LastCharRemovedWithChecks);
    }
}
