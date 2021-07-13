package com.company.streams;

import java.util.Arrays;
import java.util.List;

class person {
    private String firstName;
    private String lastName;
    private Integer age;

    public person(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}


public class StreamsSimpleExample {
    public static void main(String[] args) {
        List<person> people = Arrays.asList(
                new person("Vinay", "Nagalgaonkar", 20),
                new person("Meet", "Mehta", 21),
                new person("Manvendra", "Kushwah", 19),
                new person("Manu", "Sheoran", 21)
        );

        System.out.println("Printed below is the list of people whose first name starts with 'M' :");
        people.stream() // Using stream in this line.
                .filter(p -> p.getFirstName().startsWith("M"))
                .forEach(p -> System.out.println(p.getFirstName() + " " + p.getLastName()));
    }
}
