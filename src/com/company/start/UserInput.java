package com.company.start;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();
        int val = input.nextInt();
        input.nextLine();
        String str2 = input.nextLine();

        System.out.println("message1 = " + str1);
        System.out.println("message2 = " + str2);
        System.out.println("val = " + val);
    }
}

/*  Note  : (1) next() method will read the string from STDIN only till space. 
   				Whereas, nextLine() method will read the complete line along with spaces. 
 			(2) When taking input for string by nextLine() method after taking input for an integer, double etc.,
 				flush the input buffer having the new line character by taking it in the Scanner class variable i.e.
 				the object('input' in this case) and then actually take input for string in the desired string
 				variable. Lines 10-12 illustrate this point.
*/