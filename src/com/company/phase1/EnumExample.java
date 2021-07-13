package com.company.phase1;

//	A simple enum example where enum is declared outside any class. 
// 	Note : Here, enum keyword is used instead of class keyword.
enum Color {
    RED, GREEN, BLUE;
}

public class EnumExample {
    public static void main(String[] args) {
        Color c1 = Color.RED;
        System.out.println(c1); // Prints 'RED' on console.

        System.out.println("\nThe different colors in the enum are as follows :");
        for (Color cc : Color.values()) {
            System.out.println(cc);
        }
    }
}
