package adress_book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    private List<Contact> contacts;

    public AddressBook() {
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void editContact(String firstName, String lastName, Scanner sc) {
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
    
    public void displayContacts() {
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }
}
