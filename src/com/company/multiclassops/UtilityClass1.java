package com.company.multiclassops;

public class UtilityClass1 {
    private String name;

    // Constructors
    public UtilityClass1() {
    }

    public UtilityClass1(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public void greet() {
        System.out.println("Hello " + getName() + " !!");
    }

    public void print1() {
        System.out.println("This is the function of UtilityClass1");
    }
}
