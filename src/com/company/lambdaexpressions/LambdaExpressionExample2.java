package com.company.lambdaexpressions;

interface FunctionalInterfaceV2 {
    int operation(int a, int b);
}

interface FunctionalInterfaceShow {
    void abstractFunction(int val);
}

public class LambdaExpressionExample2 {
    public static void main(String[] args) {
		/* 	Implementing the single abstract method i.e operation() of the functional interface 
		 	i.e. FunctionalInterfaceV2 to do addition as follows.
		*/
        FunctionalInterfaceV2 add = (int a, int b) -> a + b;
        // FunctionalInterfaceV2 add = (int a, int b) -> { a += b ; return a ; } ; // Same as above.
		
		/* 	Implementing the single abstract method i.e operation() of the functional interface 
	 		i.e. FunctionalInterfaceV2 to do multiplication as follows.
		*/
        FunctionalInterfaceV2 multiply = (int a, int b) -> (a * b);
		
		/* 	Implementing the single abstract method i.e abstractFunction() of the functional interface 
 			i.e. FunctionalInterfaceShow to display the value of the variable as follows.
		*/
        FunctionalInterfaceShow display = ob -> System.out.println(ob);

        int val1 = add.operation(4, 5), val2 = multiply.operation(6, 7);
        System.out.print("Addition(4, 5) = ");
        display.abstractFunction(val1);

        System.out.print("Multiplication(6, 7) = ");
        display.abstractFunction(val2);
    }
}
