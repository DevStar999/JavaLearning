package com.company.phase1;

public class FooWorkingClass {
    public static void changeReference(Foo a) {
        Foo b = new Foo("b");
        a = b;
    }

    public static void modifyReference(Foo c) {
        c.setAttribute("c");
    }

    public static void main(String[] args) {
        Foo f = new Foo("f");
        changeReference(f); // It won't change the reference!
        modifyReference(f); // It will modify the object that the reference variable "f" refers to!

        System.out.println("State of obj = " + f.getStr());
    }
}
