package com.bridgelabz;

public class Contacts {
	// declare variables
	private String firstName;
	private String lastName;
	private String mobileNo;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String email;

	// Constructor
	public Contacts(String firstName2, String lastName2, String mobileNo2, String address2, String city2, String state2, String zip2, String email2) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNo = mobileNo;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.email = email;
	}

	// getters and setters methods
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	// toString
	@Override
	public String toString() {
		return "----------------------------------\n" +
                "FirstName  =  " + firstName +
                "\nLastName   =  " + lastName +
                "\nMobileNo    =  " + mobileNo +
                "\nAddress       =  " + address +
                "\nCity      =  " + city +
                "\nState    =  " + state +
                "\nZIP     =  " + zip +
                "\nEmail      =  " + email +
                "\n-----------------------------------\n";
	}
}