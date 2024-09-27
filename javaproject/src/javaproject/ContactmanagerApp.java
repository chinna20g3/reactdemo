
package javaproject;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactmanagerApp {
    private static ArrayList<Contact> contactList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quit = false;
        int choice;

        while (!quit) {
            System.out.println("\nWelcome to the Contact Manager App");
            System.out.println("1. Add a new contact");
            System.out.println("2. Remove a contact");
            System.out.println("3. View all contacts");
            System.out.println("4. Search for a contact");
            System.out.println("5. Quit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer

            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    removeContact();
                    break;
                case 3:
                    viewContacts();
                    break;
                case 4:
                    searchContact();
                    break;
                case 5:
                    quit = true;
                    System.out.println("Exiting Contact Manager App.");
                    break;
                default:
                    System.out.println("Invalid choice! Please choose a valid option.");
            }
        }
    }

    private static void addContact() {
        System.out.print("Enter contact name: ");
        String name = scanner.nextLine();
        System.out.print("Enter contact phone number: ");
        String phone = scanner.nextLine();
        contactList.add(new Contact(name, phone));
        System.out.println("Contact added: " + name + " (" + phone + ")");
    }

    private static void removeContact() {
        if (contactList.isEmpty()) {
            System.out.println("Contact list is empty.");
        } else {
            viewContacts();
            System.out.print("Enter the contact number to remove: ");
            int contactNumber = scanner.nextInt();
            if (contactNumber > 0 && contactNumber <= contactList.size()) {
                Contact removedContact = contactList.remove(contactNumber - 1);
                System.out.println("Contact removed: " + removedContact.getName());
            } else {
                System.out.println("Invalid contact number.");
            }
        }
    }

    private static void viewContacts() {
        if (contactList.isEmpty()) {
            System.out.println("Contact list is empty.");
        } else {
            System.out.println("\nYour Contacts:");
            for (int i = 0; i < contactList.size(); i++) {
                Contact contact = contactList.get(i);
                System.out.println((i + 1) + ". " + contact.getName() + " - " + contact.getPhone());
            }
        }
    }

    private static void searchContact() {
        System.out.print("Enter name to search: ");
        String name = scanner.nextLine();
        boolean found = false;
        for (Contact contact : contactList) {
            if (contact.getName().equalsIgnoreCase(name)) {
                System.out.println("Found: " + contact.getName() + " - " + contact.getPhone());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No contact found with name: " + name);
        }
    }
}

// Helper class to store contact information
class Contact {
    private String name;
    private String phone;

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}
