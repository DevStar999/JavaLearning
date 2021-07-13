package com.company.lambdaexpressions;

interface inf {
    void show(int i);
    // Note : By default all the methods in an interface are public.
}

/*
// A Lambda Expression is written instead of implementing this class.
class cls implements inf {
    public void show(int i) {
        System.out.println("Hi Bro! " + i);
    }
}
*/

public class LambdaExpression {
    public static void main(String[] args) {
        inf obj;
        obj = (i) -> System.out.println("Hello " + i); // Lambda Expression.

        obj.show(6);
    }
}
/* 	Note :	Lambda expressions only work with an interface implementing only 1 method 
  			which is called a functional interface.
*/