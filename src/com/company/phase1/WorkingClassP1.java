package com.company.phase1;

import java.util.EnumSet; // Importing this package to get the range() method for our use.

public class WorkingClassP1 {
    public static void main(String[] args) {
        System.out.println("The enum constants are as follows :");
        for (BioEnum people : BioEnum.values()) {
            System.out.printf("%s\t\t%s\t\t%s\n", people, people.getDesc(), people.getAge());
        }
        System.out.println();

        System.out.println("The enum constants in a specific range from 'Meet' to 'Maan' are as follows :");
        for (BioEnum people : EnumSet.range(BioEnum.Meet, BioEnum.Maan)) {
            System.out.printf("%s\t\t%s\t\t%s\n", people, people.getDesc(), people.getAge());
        }
        System.out.println();
    }
}
