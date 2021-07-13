package com.company.exceptionhandling;

public class ThrowThrows {
    /*
    Here, 'throws' keyword is used to signify that the following method may throw one of the listed exceptions.
    Remember, the list of exceptions is comma separated.
    */
    static void testMethod() throws IllegalAccessException, ArithmeticException, NullPointerException {
        System.out.println("Inside testMethod() .");
        // In the line below, the 'throw' keyword is used to throw an exception manually.
        throw new IllegalAccessException("demo");
    }

    public static void main(String args[]) {
        try {
            testMethod();
        } catch (IllegalAccessException e) {
            System.out.println("caught in main.");
        }
    }
}
