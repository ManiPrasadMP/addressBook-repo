package adress_book;

public class AddressBook {
    public static void main(String[] args) {
    	System.out.println("Welcome to Address Book Program!");

        
        Contact contact = new Contact(
                "John",
                "Doe",
                "123 Street",
                "New York",
                "NY",
                "10001",
                "1234567890",
                "john.doe@example.com"
        );

        System.out.println(contact);
    }
}
