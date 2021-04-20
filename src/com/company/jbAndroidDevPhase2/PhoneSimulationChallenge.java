package com.company.jbAndroidDevPhase2;

import java.util.*;
import java.util.stream.Collectors;

public class PhoneSimulationChallenge {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Hello user, to your Phone Simulation application.");
		
		// Resources for program.		
		boolean exit = false;
		Map<String, Contact> contactList = new TreeMap<>();
		
		do {
			System.out.println("\nChoose among the following options as it suits you with their "
							    + "corresponding option number:");
			System.out.print("\t1 : Manage contact(s)\n" + 
							 "\t2 : Send message(s)\n" +
							 "\t3 : Quit the program\n");
			
			// Taking input for option number as follows.
			System.out.print("Please enter your option number : ");
			Integer optionNumber = input.nextInt();
			input.nextLine();
			while( optionNumber < 1 || optionNumber > 3 ) {
				System.out.print("Please enter an appropriate input for option number again :");
				optionNumber = input.nextInt();
				input.nextLine();
			}
			
			// Managing contacts.
			if( optionNumber == 1 ) {
				System.out.println("In Manage contact(s), "
									+ "choose among the following options as it suits you with their "
								    + "corresponding option number:");
				System.out.print("\t1 : Search a contact\n" + 
								 "\t2 : Add a contact\n" +
								 "\t3 : Delete a contact\n" +
								 "\t4 : Show all contacts\n" +
								 "\t5 : Back to the previous options\n");
				
				// Taking input for option number as follows.
				System.out.print("Please enter your option number : ");
				Integer manOptionNumber = input.nextInt();
				input.nextLine();
				while( manOptionNumber < 1 || manOptionNumber > 5 ) {
					System.out.println("Please enter an appropriate input for option number again :");
					manOptionNumber = input.nextInt();
					input.nextLine();
				}				
				
				// Search a contact.
				if( manOptionNumber == 1 ) {
					System.out.print("Enter the name of the user that you want to search : ");
					String queryUser = input.nextLine();
					if( contactList.containsKey(queryUser) ) {
						System.out.println("The entered user exists in the contact list, "
								         + "details of the query user are as follows :");
						contactList.get(queryUser).showDescription();
					}
					else {
						System.out.println("The entered user doesn't exist in the contact list");
						continue;
					}
				}
				// Add a contact.
				else if( manOptionNumber == 2 ) {
					System.out.println("Please enter (1)Name (2)Number and (3)Email for the user as follows :");
					String name, email;
					Long number;
					
					System.out.print("Enter the name of the user : ");
					name = input.nextLine();
					
					System.out.print("Enter the number of the user : ");
					number = input.nextLong();
					input.nextLine();
					
					System.out.print("Enter the email of the user : ");
					email = input.nextLine();
					
					contactList.put(name, new Contact(name, number, email));
					System.out.println("The contact has been added successfully to the contact list!!");					
				}
				// Delete a contact.
				else if( manOptionNumber == 3 ) {
					System.out.print("Please enter the name of the user you want to delete "
							         + "from amomg following users :\n" 
									 + "( ");
					
					List<String> userList = new ArrayList<String>(contactList
													.keySet()
													.stream()
													.collect(Collectors.toList())
													);
					
					for(Integer i=0 ; i<userList.size() ; i++) {
						if( i == userList.size()-1 ) { System.out.print(userList.get(i) + " )\n"); }
						else { System.out.print(userList.get(i) + ", ") ; }
					}
					
					System.out.print("Please enter the name of the user : ");						
					String queryUser = input.nextLine();
					if( contactList.containsKey(queryUser) ) {
						contactList.remove(queryUser);
					}
					else {
						System.out.println("The entered user doesn't exist in the contact list");
						continue;
					}
					System.out.println("The given contact " + queryUser + 
							" has been removed from contact list successfully");
				}
				// Show all contacts.
				else if ( manOptionNumber == 4 ){
					if( contactList.size() == 0 ) {
						System.out.println("You have 0 contacts in your contact list.");
					}
					else {
						System.out.println("Your contacts are as follows : ");
						Integer userIndex = 1 ;
						for(Map.Entry<String, Contact> element : contactList.entrySet()) {
							System.out.println( userIndex + ") Contact Label : " + element.getKey() );
							element.getValue().showDescription();
						}
					}
				}
				// Back to the previous options.
				else if ( manOptionNumber == 5 ){
					continue ;
				}
			}
			
			// Sending messages.
			else if( optionNumber == 2 ) {
				System.out.print("Please enter the name of the user you want to send message to "
				         + "from amomg following users :\n" 
						 + "( ");
				
				List<String> userList = new ArrayList<String>(contactList
												.keySet()
												.stream()
												.collect(Collectors.toList())
												);
				
				if( userList.size() == 0 ) {
					System.out.println("You have 0 contacts in your contact list to send messages.");
					continue;
				}
				else {
					for(Integer i=0 ; i<userList.size() ; i++) {
						if( i == userList.size()-1 ) { System.out.print(userList.get(i) + " )\n"); }
						else { System.out.print(userList.get(i) + ", ") ; }
					}					
				}
				
				System.out.print("Please enter the name of the user : ");						
				String queryUser = input.nextLine();
				if( contactList.containsKey(queryUser) ) {
					System.out.println("Please enter the message for the user as follows : ");											
					String msg = input.nextLine();
					System.out.println("Please enter your name as well for the user to know : ");											
					String ownName = input.nextLine();
					contactList.get(queryUser).addMessage(ownName, msg);
					System.out.println("Message has been sent successfully to " + queryUser + "!!\n");
				}
				else {
					System.out.println("The entered user doesn't exist in the contact list");
					continue;
				}				
			}
			
			// Exiting the program
			else if( optionNumber == 3 ) {
				exit = true ;
			}
		}
		while( exit == false );

		System.out.println("So long user, until next time.");
	}

}
