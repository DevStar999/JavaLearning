package com.company.phase2;

import com.company.dateandtime.Date;

public class Person {
    private String name;
    private Date birthday;

    public Person(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    /*	Here, the class 'Person' is using reference to object(birthday) of another class(Date), this concept
        is called Composition. In the following function, the reference to object - birthday as a String,
        will lead the compiler to look for reference of the object as a String in Date class and hence
        using the toString() method in Date class.
    */
    public String toString() {
        return String.format("My name is %s and my birth date is %s", name, birthday);
    }
}
