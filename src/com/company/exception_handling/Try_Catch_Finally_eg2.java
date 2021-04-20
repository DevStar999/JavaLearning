package com.company.exception_handling;

public class Try_Catch_Finally_eg2 {

	public static void main(String[] args) {
		// try-catch-finally clause is as follows.
		try{ 
			int num = 16/0 ; 
			// This statement will not be printed as division by zero is done above.
	        System.out.println("Inside 'try' block") ; 
		}     
		catch(ArithmeticException ex) {
            System.out.println("Exception caught in the 'catch' block of ArithmeticException") ;   			
		}
        catch(NullPointerException ex) {
            System.out.println("Exception caught in the 'catch' block of NullPointerException") ;         	
        }
		catch(ArrayIndexOutOfBoundsException ex) { 
            System.out.println("Exception caught in the 'catch' block of ArrayIndexOutOfBoundsException") ; 
        } 	          
		finally{ 
            System.out.println("Now, 'finally' block has executed") ; 
        }

		System.out.println("The program has exited the try-catch-finally clause") ;
	}

}
