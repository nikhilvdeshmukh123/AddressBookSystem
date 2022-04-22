package com.bridgelabz;
/*
 * @author: Nikhil Deshnukh
 * Ability to edit a Contact in Address Book with First Name
 */
public class AddressBookSystem {
	// main method
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		//object of Addressbook class
		AddressBook addressBook = new AddressBook();
		addressBook.addContact();
		addressBook.displayContact();
		addressBook.editContact();
	}
}