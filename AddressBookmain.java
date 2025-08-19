package adress_book;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookmain {
	public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program!");
        Scanner sc = new Scanner(System.in);
        Map<String, AddressBook> addressBooks = new HashMap<>();

        boolean exit = false;
        while (!exit) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Create New Address Book");
            System.out.println("2. Add Contact");
            System.out.println("3. Edit Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Display Contacts");
            System.out.println("6. List All Address Books");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
<<<<<<< HEAD
                    System.out.print("Enter Address Book Name: ");
                    String bookName = sc.nextLine();
                    if (addressBooks.containsKey(bookName)) {
                        System.out.println("Address Book already exists!");
                    } else {
                        addressBooks.put(bookName, new AddressBook(bookName));
                        System.out.println("Address Book '" + bookName + "' created successfully!");
                    }
=======
                    addAddress(addressBooks, sc);
>>>>>>> delete-contact
                    break;
                case 2:
                    AddressBook activeBook = getActiveBook(addressBooks, sc);
                    if (activeBook != null) {
<<<<<<< HEAD
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
                        activeBook.addContact(newContact);
                        System.out.println("Contact added successfully!");
                    }
                    break;
                case 3:
                    activeBook = getActiveBook(addressBooks, sc);
                    if (activeBook != null) {
                        System.out.print("Enter First Name of contact to edit: ");
                        String editFirstName = sc.nextLine();
                        System.out.print("Enter Last Name of contact to edit: ");
                        String editLastName = sc.nextLine();
                        activeBook.editContact(editFirstName, editLastName, sc);
                    }
                    break;
                case 4:
                    activeBook = getActiveBook(addressBooks, sc);
                    if (activeBook != null) {
                        System.out.print("Enter First Name of contact to delete: ");
                        String deleteFirstName = sc.nextLine();
                        System.out.print("Enter Last Name of contact to delete: ");
                        String deleteLastName = sc.nextLine();
                        activeBook.deleteContact(deleteFirstName, deleteLastName);
                    }
                    break;
                case 5:
                    activeBook = getActiveBook(addressBooks, sc);
                    if (activeBook != null) {
                        System.out.println("\nContacts in Address Book: " + activeBook.getName());
                        activeBook.displayContacts();
                    }
                    break;
                case 6:
                    if (addressBooks.isEmpty()) {
                        System.out.println("No Address Books available.");
                    } else {
                        System.out.println("Available Address Books: " + addressBooks.keySet());
                    }
                    break;
                case 7:
                    exit = true;
                    System.out.println("Exiting Address Book Program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
=======
                        activeBook.addContact(sc);
                        System.out.println("Contact added successfully!");
                    }
                    break;
                case 3:
                    activeBook = getActiveBook(addressBooks, sc);
                    if (activeBook != null) {
                        activeBook.editContact(sc);
                    }
                    break;
                case 4:
                    activeBook = getActiveBook(addressBooks, sc);
                    if (activeBook != null) {
                        
                        activeBook.deleteContact(sc);
                    }
                    break;
                case 5:
                    activeBook = getActiveBook(addressBooks, sc);
                    if (activeBook != null) {
                        System.out.println("\nContacts in Address Book: "+ activeBook.getName());
                        activeBook.displayContacts();
                    }
                    break;
                case 6:
                    if (addressBooks.isEmpty()) {
                        System.out.println("No Address Books available.");
                    } else {
                        System.out.println("Available Address Books: " + addressBooks.keySet());
                    }
                    break;
                case 7:
                    exit = true;
                    System.out.println("Exiting Address Book Program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static AddressBook getActiveBook(Map<String, AddressBook> addressBooks, Scanner sc) {
        if (addressBooks.isEmpty()) {
            System.out.println("No Address Books available. Create one first.");
            return null;
        }
        System.out.print("Enter Address Book Name: ");
        String name = sc.nextLine();
        if (addressBooks.containsKey(name)) {
            return addressBooks.get(name);
        } else {
            System.out.println("Address Book not found!");
            return null;
        }
    }
    
    private static void addAddress(Map<String, AddressBook> addressBooks,Scanner sc) {
    	System.out.print("Enter Address Book Name: ");
        String bookName = sc.nextLine();
        if (addressBooks.containsKey(bookName)) {
            System.out.println("Address Book already exists!");
        } else {
            addressBooks.put(bookName, new AddressBook(bookName));
            System.out.println("Address Book '" + bookName + "' created successfully!");
>>>>>>> delete-contact
        }
    }

    private static AddressBook getActiveBook(Map<String, AddressBook> addressBooks, Scanner sc) {
        if (addressBooks.isEmpty()) {
            System.out.println("No Address Books available. Create one first.");
            return null;
        }
        System.out.print("Enter Address Book Name: ");
        String name = sc.nextLine();
        if (addressBooks.containsKey(name)) {
            return addressBooks.get(name);
        } else {
            System.out.println("Address Book not found!");
            return null;
        }
    }
}
