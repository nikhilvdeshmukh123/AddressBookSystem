package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	// Creating ArrayList
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Contacts> contact = new ArrayList<Contacts>();

	// Method for Adding Contact
	public void addContact() {
		System.out.println("Enter the number of contacts you want to save");

		System.out.println("Enter first name");
		String firstName = sc.next();
		System.out.println("Last name");
		String lastName = sc.next();
		System.out.println("Enter Mobile no");
		String mobileNo = sc.next();
		System.out.println("Enter Address ");
		String address = sc.next();
		System.out.println("Enter City ");
		String city = sc.next();
		System.out.println("Enter State ");
		String state = sc.next();
		System.out.println("Enter zip ");
		String zip = sc.next();
		System.out.println("Enter Email ");
		String email = sc.next();
		contact.add(new Contacts(firstName, lastName, mobileNo, address, city, state, zip, email));
		System.out.println(contact);
	}

	// Method for Contact Display
	public static void displayContact() {
		System.out.println("Number of contacts : " + contact.size());
		if (contact.isEmpty()) {
			System.out.println("There is no contact");
		} else {
			for (int i = 0; i < contact.size(); i++) {
				System.out.println(contact.get(i));
			}
		}
	}

	// Method for edit contact
	public static void editContact() {
		System.out.println("Please Enter original first name for verification : ");
		String editName = sc.next();
		if (contact.isEmpty()) {
			System.out.println("Contact list is empty");
		} else {
			for (int i = 0; i < contact.size(); i++) {
				String name = contact.get(i).getFirstName();
				if (editName.equalsIgnoreCase(name)) {
					System.out.println("Enter first name");
					String firstName = sc.next();
					System.out.println("Last name");
					String lastName = sc.next();
					System.out.println("Enter Mobile no");
					String mobileNo = sc.next();
					System.out.println("Enter Address ");
					String address = sc.next();
					System.out.println("Enter City ");
					String city = sc.next();
					System.out.println("Enter State ");
					String state = sc.next();
					System.out.println("Enter zip ");
					int zip = sc.nextInt();
					System.out.println("Enter Email ");
					int email = sc.nextInt();
				} else {
					System.out.println("Invalid first name");
					System.out.println("Please Enter valid first name");
				}
			}
			System.out.println(contact);
		}
	}

	// Method to delete contact
	public void deleteContact() {
		System.out.println("Enter original first name for verification:");
		String deleteName = sc.next();

		if (contact.isEmpty()) {
			System.out.println("Contact list is empty");
		} else {
			for (int i = 0; i < contact.size(); i++) {
				String name = contact.get(i).getFirstName();
				if (deleteName.equalsIgnoreCase(name)) {
					contact.remove(i);
					System.out.println("Contact deleted successfully");
				} else {
					System.out.println("Invalid first name");
					System.out.println("Please Enter valid first name");
				}
			}
			System.out.println(contact);
		}
	}

	// Function for operations of user's choice
	public void getmenu() {
		System.out.println("Menu of Address Book");
		boolean check = false;
		do {
			System.out.println(
					"Enter your choice \n 1. Add contact \n 2. Edit contact \n 3. Delete contact \n 4. Display \n 5. Exit");
			int option = sc.nextInt();
			switch (option) {
			case 1:
				addContact();
				System.out.println("Contact added successfully");
				break;
			case 2:
				editContact();
				System.out.println("Contact edited successfully");
				break;
			case 3:
				deleteContact();
				break;
			case 4:
				displayContact();
				break;
			case 5:
				check = true;
				break;
			default:
				System.out.println("Please choose a valid option");
				break;
			}
		} while (!check);
	}
}