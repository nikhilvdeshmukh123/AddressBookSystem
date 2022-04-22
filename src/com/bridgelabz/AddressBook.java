package com.bridgelabz;

import java.util.Scanner;

public class AddressBook {
	// object of Contact class
	Contact contact = new Contact();
	// object of Scanner class for User Input
	Scanner scan = new Scanner(System.in);

	// Method for Adding Contact
	public void addContact() {
		System.out.println("Enter the First Name: ");
		String firstName = scan.nextLine();
		System.out.println("Enter the Last Name: ");
		String lastName = scan.nextLine();
		System.out.println("Enter the Mobile No: ");
		String mobileNo = scan.nextLine();
		System.out.println("Enter the Address: ");
		String address = scan.nextLine();
		System.out.println("Enter the City: ");
		String city = scan.nextLine();
		System.out.println("Enter the State: ");
		String state = scan.nextLine();
		System.out.println("Enter the Zip: ");
		String zip = scan.nextLine();
		System.out.println("Enter the Email: ");
		String email = scan.nextLine();
		// calling set function with reference name contact
		contact.setFirstName(firstName);
		contact.setLastName(lastName);
		contact.setMobileNo(mobileNo);
		contact.setAddress(address);
		contact.setCity(city);
		contact.setState(state);
		contact.setZip(zip);
		contact.setEmail(email);
		System.out.println(contact);
	}

	// Method for Contact Display
	public void displayContact() {
		String str = contact.getFirstName();
		System.out.println("Contact: " + str);
	}

	// Method for edit contact
	public void editContact() {
		System.out.println("Please Enter original first name to edit: ");
		String editName = scan.nextLine();
		// If firstName equals to Entered name
		if (editName.equalsIgnoreCase(contact.getFirstName())) {
			addContact();
			System.out.println("Contact Successfully Edited");
			// If firstName not equals to Entered name
		} else {
			System.out.println("Invalid first name");
			System.out.println("Please Enter valid first name");
			editContact();
		}
	}

	//Method to delete contact
	public void deleteContact() {
		System.out.println("Enter original first name for verification:");
		String deleteName = scan.next();
		// If firstName equals to Entered name
		if (deleteName.equals(contact.getFirstName())) {
			contact.setFirstName(null);
			contact.setLastName(null);
			contact.setMobileNo(null);
			contact.setAddress(null);
			contact.setCity(null);
			contact.setState(null);
			contact.setZip(null);
			contact.setEmail(null);
			System.out.println("Contact deleted successfully");
		// If firstName not equals to Entered name
		} else {
			System.out.println("Invalid first name");
			System.out.println("Please Enter valid first name");
			deleteContact();
		}
	}
}