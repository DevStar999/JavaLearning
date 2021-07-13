package com.company.exceptionhandling;

public class TryCatchFinallyEg1 {
    public static void main(String[] args) {
        int arr[] = new int[4];

        // try-catch-finally clause is as follows.
        try {
            int i = arr[4];
            // This statement will not be printed as the index - 4 is out of bound.
            System.out.println("Inside 'try' block");
        } catch (ArithmeticException ex) {
            System.out.println("Exception caught in the 'catch' block of ArithmeticException");
        } catch (NullPointerException ex) {
            System.out.println("Exception caught in the 'catch' block of NullPointerException");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Exception caught in the 'catch' block of ArrayIndexOutOfBoundsException");
        } finally {
            System.out.println("Now, 'finally' block has executed");
        }

        System.out.println("The program has exited the try-catch-finally clause");
    }
}
