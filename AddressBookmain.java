package adress_book;

import java.util.Scanner;

public class AddressBookmain {
	public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program!");
        Scanner sc = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();

        System.out.print("Enter First Name: ");
        String firstName = sc.nextLine();
        System.out.print("Enter Last Name: ");
        String lastName = sc.nextLine();
        System.out.print("Enter Address: ");
        String address = sc.nextLine();
        System.out.print("Enter City: ");
        String city = sc.nextLine();
        System.out.print("Enter State: ");
        String state = sc.nextLine();
        System.out.print("Enter Zip: ");
        String zip = sc.nextLine();
        System.out.print("Enter Phone Number: ");
        String phoneNumber = sc.nextLine();
        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        Contact newContact = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);
        addressBook.addContact(newContact);

        System.out.println("\nContacts in Address Book:");
        addressBook.displayContacts();
        
        System.out.println("\nContacts in Address Book:");
        addressBook.displayContacts();

        // Edit functionality
        System.out.println("\nEnter the First and Last name of the contact to edit:");
        System.out.print("First Name: ");
        String editFirstName = sc.nextLine();
        System.out.print("Last Name: ");
        String editLastName = sc.nextLine();
        addressBook.editContact(editFirstName, editLastName, sc);

        System.out.println("\nUpdated Contacts:");
        addressBook.displayContacts();

        // Delete functionality
        System.out.println("\nEnter the First and Last name of the contact to delete:");
        System.out.print("First Name: ");
        String deleteFirstName = sc.nextLine();
        System.out.print("Last Name: ");
        String deleteLastName = sc.nextLine();
        addressBook.deleteContact(deleteFirstName, deleteLastName);

        System.out.println("\nFinal Contacts:");
        addressBook.displayContacts();
    }
}