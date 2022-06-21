package com.company.phase1;

public class FooWorkingClass {
    public static void changeReference(Foo a) {
        Foo b = new Foo("b");
        System.out.println("Inside method call changeReference() a [Before] = " + a);
        System.out.println("Inside method call changeReference() b [Before] = " + b);
        a = b;

        System.out.println("Inside method call changeReference() a [After] = " + a);
        System.out.println("Inside method call changeReference() b [After] = " + b);
    }

    public static void modifyValueOfAttribute(Foo c) {
        c.setAttribute("c");
    }

    public static void main(String[] args) {
        Foo f = new Foo("f");

        System.out.println("Before method call f = " + f);
        changeReference(f); // It won't change the reference and also not the value of the attributes in the object
        System.out.println("After method call f = " + f);

        modifyValueOfAttribute(f);
        /* As in this method we are making a call to a setter method of the object, now the value of the attribute
           of the object is changed, but note that the reference i.e. it's address is still the same
        */
        System.out.println("After method call f (last) = " + f);

        System.out.println("State of obj = " + f.getStr());
    }
}
