package com.company.phase3;

public class Final_Keyword_Working {

	public static void main(String[] args) {
        int arr[] = {1, 2, 3} ; 
          
        // Final with for-each(enhanced for loop) statement is a legal statement. 
        for (final int i : arr) {
            System.out.print(i + " ") ;        	
        } 
	}

}
