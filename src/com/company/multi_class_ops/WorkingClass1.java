package com.company.multi_class_ops;

import java.util.Scanner;

import com.company.start.SwitchCase;

//This can be done as follows too :
/*
import com.company.phase1.* ; // Importing all classes from package - phase1.
*/
public class WorkingClass1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        UtilityClass1 ob = new UtilityClass1();
        // Always initialize the class object with new and the class name followed by brackets.
        ob.print1();

        SwitchCase switchCaseObject = new SwitchCase();
        // SwitchCase class is from another package. However, is it has been imported for use (using line 5).
        switchCaseObject.simpleMessage();

        /*
        System.out.print("Enter your name here : ");
        String temp = input.nextLine();
        ob.setName(temp);
        ob.greet();
        */

        UtilityClass1 ob1 = new UtilityClass1("Meet Mehta");
        ob1.greet();
    }
}
