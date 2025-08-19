package adress_book;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AddressBook {
	 private String name;
    private ArrayList<Contact> contacts;

    public AddressBook(String name) {
        this.name = name;
        this.contacts = new ArrayList<>();
    }

    public String getName() { return name; }

<<<<<<< HEAD
    public void addContact(Contact contact) {
=======
    public void addContact(Scanner sc) {
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

        Contact contact= new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);
>>>>>>> delete-contact
        contacts.add(contact);
    }

    public void editContact( Scanner sc) {
    	System.out.print("Enter First Name of contact to edit: ");
        String firstName = sc.nextLine();
        System.out.print("Enter Last Name of contact to edit: ");
        String lastName = sc.nextLine();
        for (Contact contact : contacts) {
            if (contact.getFirstName().equalsIgnoreCase(firstName) && contact.getLastName().equalsIgnoreCase(lastName)) {
                System.out.print("Enter new Address: ");
                contact.setAddress(sc.nextLine());
                System.out.print("Enter new City: ");
                contact.setCity(sc.nextLine());
                System.out.print("Enter new State: ");
                contact.setState(sc.nextLine());
                System.out.print("Enter new Zip: ");
                contact.setZip(sc.nextLine());
                System.out.print("Enter new Phone Number: ");
                contact.setPhoneNumber(sc.nextLine());
                System.out.print("Enter new Email: ");
                contact.setEmail(sc.nextLine());
                System.out.println("Contact updated successfully!");
                return;
            }
        }
        System.out.println("Contact not found!");
    }
    
    public void deleteContact(Scanner sc) {
    	System.out.print("Enter First Name of contact to delete: ");
        String firstName = sc.nextLine();
        System.out.print("Enter Last Name of contact to delete: ");
        String lastName = sc.nextLine();
        Iterator<Contact> iterator = contacts.iterator();
        while (iterator.hasNext()) {
            Contact contact = iterator.next();
            if (contact.getFirstName().equalsIgnoreCase(firstName) && contact.getLastName().equalsIgnoreCase(lastName)) {
                iterator.remove();
                System.out.println("Contact deleted successfully!");
                return;
            }
        }
        System.out.println("Contact not found!");
    }
    
    
    public void displayContacts() {
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }
}