package com.company.jbAndroidDevPhase1;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {

	public static void main(String[] args) {
		// Step 1.
		System.out.print("User, please enter your name : ");
		Scanner input = new Scanner(System.in);
		String usersName = input.nextLine();
		
		// Step 2.
		System.out.println("Hello " + usersName + ", welcome to 'Guess The Number'");
		
		// Step 3.
		boolean startOrNot = true ;
		System.out.print("Shall we start (Yes/No): ");
		String startOrNotString = input.next();
		if( startOrNotString.equals("Yes") ) { System.out.println("So, let's begin!!"); }
		else { startOrNot = false; System.out.println("Someother time then " + usersName); }
		
		if(startOrNot) {
			// Step 4.
			Random randGen = new Random();
			Integer answer = randGen.nextInt(100), guesses = 0;
			
			while(guesses<5) {
				System.out.print(usersName + ", guess the mystery number : ");
				Integer guessNumber = input.nextInt();
				if( guessNumber == answer ) {
					// Step 7.
					System.out.println("Congrats!! You correctly guessed the mystery number.");
					break ;
				}
				else {
					System.out.print("Oops, wrong guess mate. ");
					// Step 5.
					if(guessNumber > answer) { System.out.println("Guess smaller!!"); }
					// Step 6.
					else { System.out.println("Guess higher!!"); }
				}
					
				guesses++ ;
			}
		}
		
		// Step 8 & 9.
		System.out.println("Game Over, until next time " + usersName);
	}

}
