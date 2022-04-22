package com.bridgelabz;

import java.util.Scanner;
/*
 * @author: Nikhil Deshnukh
 * Ability to Delete a Contact in Address Book with First Name
 */
public class AddressBookSystem {
	// main method
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		//object of Addressbook class
		AddressBook addressBook = new AddressBook();
		addressBook.addContact();
		addressBook.displayContact();
		
		//Chose option to edit or delete contact
		System.out.println("Enter E to edit contact");
		System.out.println("Enter D to delete contact");
		//user input
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		// If user Choose E to edit contact
		if (input.equals("e") || input.equals("E")) {
            addressBook.editContact();
         // If user Choose D to edit contact
		}else if(input.equals("d") || input.equals("D")) {
			addressBook.deleteContact();
		}else {
			System.out.println("Thank You");
		}		
	}
}