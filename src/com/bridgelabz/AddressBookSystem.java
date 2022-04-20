package com.bridgelabz;
/*
 * @author: Nikhil Deshnukh
 * Ability to create a Contacts in Address Book
 */
public class AddressBookSystem {
	// main method
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");

		AddressBook addressBook = new AddressBook();
		addressBook.addContact();
	}
}