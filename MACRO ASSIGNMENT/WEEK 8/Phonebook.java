import java.util.HashMap;
import java.util.Scanner;

class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Phone Number: " + phoneNumber;
    }
}

class AddressBook {
    private HashMap<String, Contact> contacts;

    public AddressBook() {
        contacts = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        Contact contact = new Contact(name, phoneNumber);
        contacts.put(name, contact);
        System.out.println("Contact added successfully.");
    }

    public void editContact(String name, String newPhoneNumber) {
        if (contacts.containsKey(name)) {
            Contact contact = contacts.get(name);
            contact.setPhoneNumber(newPhoneNumber);
            System.out.println("Contact updated successfully.");
        } else {
            System.out.println("Contact not found.");
        }
    }

    public void deleteContact(String name) {
        if (contacts.containsKey(name)) {
            contacts.remove(name);
            System.out.println("Contact deleted successfully.");
        } else {
            System.out.println("Contact not found.");
        }
    }

    public void searchContact(String name) {
        if (contacts.containsKey(name)) {
            System.out.println(contacts.get(name));
        } else {
            System.out.println("Contact not found.");
        }
    }
}
class Phonebook {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add contact");
            System.out.println("2. Edit contact");
            System.out.println("3. Delete contact");
            System.out.println("4. Search contact");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    scanner.nextLine();
                    String name = scanner.nextLine();

                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();

                    addressBook.addContact(name, phoneNumber);
                    break;
                case 2:
                    System.out.print("Enter name: ");
                    scanner.nextLine();
                    String editName = scanner.nextLine();

                    System.out.print("Enter new phone number: ");
                    String newPhoneNumber = scanner.nextLine();

                    addressBook.editContact(editName, newPhoneNumber);
                    break;
                case 3:
                    System.out.print("Enter name: ");
                    scanner.nextLine();
                    String deleteName = scanner.nextLine();

                    addressBook.deleteContact(deleteName);
                    break;
                case 4:
                    System.out.print("Enter name: ");
                    scanner.nextLine();
                    String searchName = scanner.nextLine();

                    addressBook.searchContact(searchName);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
