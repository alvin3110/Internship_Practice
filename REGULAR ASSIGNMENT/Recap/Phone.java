import java.util.HashMap;

class PhoneDirectory {
    private HashMap<String, String> contacts;

    public PhoneDirectory() {
        contacts = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        contacts.put(name, phoneNumber);
    }

    public void removeContact(String name) {
        contacts.remove(name);
    }

    public void searchContact(String name) {
        String phoneNumber = contacts.get(name);
        if (phoneNumber != null) {
            System.out.println("Name: " + name);
            System.out.println("Phone number: " + phoneNumber);
        } else {
            System.out.println("Contact not found: " + name);
        }
    }

    public void displayAllContacts() {
        System.out.println("Phone Directory:");
        for (String name : contacts.keySet()) {
            String phoneNumber = contacts.get(name);
            System.out.println("Name: " + name);
            System.out.println("Phone number: " + phoneNumber);
            System.out.println();
        }
    }
}

public class Phone {
  public static void main(String[] args) {
    PhoneDirectory phoneDirectory = new PhoneDirectory();
    phoneDirectory.addContact("Alvin", "1234567890");
    phoneDirectory.addContact("Messi", "1010101010");
    phoneDirectory.addContact("Cr7", "7777777777");
    phoneDirectory.addContact("Emily", "7890123456");
    phoneDirectory.addContact("Michael", "3210987654");
    
    phoneDirectory.searchContact("John Doe");
    
    phoneDirectory.removeContact("Jane Smith");
    
    phoneDirectory.displayAllContacts();
    }
}
