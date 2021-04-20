package com.company.jbAndroidDevPhase2;

import java.util.*;

public class Contact {
	private String name;
	private Long number;
	private String email;
	private Map<String, List<String>> messages; 
	// Key : User's Name , Value : ArrayList of String messages from this user.
	
	// Constructors 
	public Contact() {
		messages = new TreeMap<>();
	}
	
	public Contact(String name, Long number, String email) {
		this.name = name ;
		this.setNumber(number) ;
		this.setEmail(email) ;
		messages = new TreeMap<>();
	}
	
	// Getters and Setters
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }

	public Long getNumber() { return number; }
	public void setNumber(Long number) { this.number = number; }

	public String getEmail() { return email; }
	public void setEmail(String email) { this.email = email; }

	public void showMessagesFromUser(String user) {
		if( messages.get(user).size() == 0 ) {
			System.out.println("You have 0 messages from " + user);
		}
		else {
			System.out.println("The list of messages from " + user + " are as follows :\n");
			for(String msg: messages.get(user)) {
				System.out.println(msg);
			}
		}
	}
	public void addMessage(String user, String message) {
		if( messages.containsKey(user) == false ) { 
			messages.put(user, new ArrayList<String>(Arrays.asList(message))); 
		} 
		else { 
			messages.get(user).add(message); 
		}
	}
	
	public void showAllMessages() {
		System.out.println("The list of messages is as follows :");
		if( messages.size() == 0 ) {
			System.out.println("0 messages found for " + this.name + ".");
		}
		else {
			for(Map.Entry<String, List<String>> element : this.messages.entrySet()) {
				System.out.println("Sender : " + element.getKey());
				System.out.println("Messages : ");
				for(Integer i=0 ; i<element.getValue().size() ; i++) {
					System.out.println((i+1)+") " + element.getValue().get(i));
				}
			}
		}
	}
	
	// Method to show the complete description of the user.
	public void showDescription() {
		System.out.println("** The details about the user as follows : **");
		System.out.println("Name : " + this.getName());
		System.out.println("Number : " + this.getNumber().toString());
		System.out.println("Email : " + this.getEmail());
		this.showAllMessages();
	}
}
