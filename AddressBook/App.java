
package com.AddressBook;

import java.util.Scanner;

public class App {
	public void handleUserSelection(int choice) {
		UserInterface userInterface = new UserInterface();
		AddressBook addressBook = new AddressBook();
		switch (choice) {
		case 1:
			addContact();
			break;
		case 2:
			break;
		case 3:
			long userSelection = userInterface.selectContact();
			addressBook.remove(addressBook.getContact(userSelection));
			break;
		default:

		}

	}

	public void addContact() {
		AddressBook addressBook = new AddressBook();
		Contact1 contact1 = new Contact1();
		Contact2 contact2 = new Contact2();
		Contact3 contact3 = new Contact3();

		addressBook.add(contact1);
		addressBook.add(contact2);
		addressBook.add(contact3);
		
	}

	public static void main(String[] args) {
		System.out.println("WELCOME TO ADDRESS BOOK");
		UserInterface userInterface = new UserInterface();
		int choice = userInterface.showMenu();
		App app = new App();
		app.handleUserSelection(choice);
		
	}
}
