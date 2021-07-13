package com.company.phase2;

import java.util.EnumSet; // Importing this package to get the range() method for our use.

public class WorkingClassP2 {
    public static void main(String[] args) {
        /*
        Time ob = new Time(17, 45, 51);
        System.out.println(ob.to_military());
        System.out.println(ob.to_normal_time());

        Date today = new Date(26, 1, 2019);
        Date myBirthday = new Date(29, 4, 1998);
        Person me = new Person("Vinay", myBirthday);
        System.out.println(me);
        */

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
