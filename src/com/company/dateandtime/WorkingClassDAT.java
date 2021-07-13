package com.company.dateandtime;

import com.company.phase2.Person;

public class WorkingClassDAT {
    public static void main(String[] args) {
        Time timeObject = new Time(17, 45, 51);
        System.out.println(timeObject.toMilitary());
        System.out.println(timeObject.toNormalTime());

        Date today = new Date(26, 1, 2019);
        Date myBirthday = new Date(29, 4, 1998);
        Person me = new Person("Vinay", myBirthday);
        System.out.println(me);
    }
}
