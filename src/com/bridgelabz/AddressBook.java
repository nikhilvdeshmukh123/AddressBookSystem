package com.bridgelabz;

import java.util.Scanner;

public class AddressBook {
	Contact contact;
	Scanner scan = new Scanner(System.in);

	public void addContact() {
		contact = new Contact();
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

		contact.setFirstName(firstName);
		contact.setLastName(lastName);
		contact.setMobileNo(mobileNo);
		contact.setAddress(address);
		contact.setCity(city);
		contact.setState(state);
		contact.setZip(zip);
		contact.setEmail(email);
	}
}