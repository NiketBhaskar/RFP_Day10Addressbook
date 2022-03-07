package com.AddressBook;

public abstract class Contact {
	String firstName, lastName, address, city, state, email;
	int zip;
	long phoneNumber;
	@Override
	public String toString() {
		return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", City=" + city
				+ ", state=" + state + ", email=" + email + ", zip=" + zip + ", phoneNumber=" + phoneNumber + "]";
	}
}
