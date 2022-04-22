package com.bridgelabz;
/*
 * @author: Nikhil Deshnukh
 * Ability to add a New Contact in Address Book
 */
public class AddressBookSystem {
	// main method
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		//object of Addressbook class
		AddressBook addressBook = new AddressBook();
		addressBook.addContact();
		addressBook.displayContact();
	}
}