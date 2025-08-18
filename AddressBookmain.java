package adress_book;

import java.util.Scanner;

public class AddressBookmain {
	public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program!");
        Scanner sc = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();

        boolean exit = false;
        while (!exit) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Display Contacts");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
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
                    System.out.println("Contact added successfully!");
                    break;
                case 2:
                    System.out.print("Enter First Name of contact to edit: ");
                    String editFirstName = sc.nextLine();
                    System.out.print("Enter Last Name of contact to edit: ");
                    String editLastName = sc.nextLine();
                    addressBook.editContact(editFirstName, editLastName, sc);
                    break;
                case 3:
                    System.out.print("Enter First Name of contact to delete: ");
                    String deleteFirstName = sc.nextLine();
                    System.out.print("Enter Last Name of contact to delete: ");
                    String deleteLastName = sc.nextLine();
                    addressBook.deleteContact(deleteFirstName, deleteLastName);
                    break;
                case 4:
                    System.out.println("\nContacts in Address Book:");
                    addressBook.displayContacts();
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exiting Address Book Program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}