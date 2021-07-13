package com.company.innerclass;

// Outer class 
class OuterClass {
    // Static member
    static int outerX = 10;

    // Instance (non-static) member
    int outerY = 20;

    // Private member
    private static int outer_private = 30;

    // Static Nested Class
    static class StaticNestedClass {
        void display() {
            // Can access static member of outer class
            System.out.println("outerX = " + outerX);

            // Can access private static member of outer class
            System.out.println("outer_private = " + outer_private);

            // The following statement will give compilation error,
            // as static nested class cannot directly access non-static members
            // System.out.println("outerY = " + outerY);
        }
    }
}


public class StaticNestedClass {
    public static void main(String[] args) {
        // Accessing a Static Nested Class 
        OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();
        nestedObject.display();
    }
}
