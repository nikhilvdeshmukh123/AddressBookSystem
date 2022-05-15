package com.bridgelabz;

import java.util.Scanner;

/*
 * @author: Nikhil Deshnukh
 * Ability to add multiple person to Address Book
 */
public class AddressBookSystem {
	// main method
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		//object of Addressbook class
		AddressBook addressBook = new AddressBook();
        addressBook.getmenu();
	}
}