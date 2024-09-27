

package javaproject;

import java.util.ArrayList;
import java.util.Scanner;

public class ChatApplication {
    private static ArrayList<String> messages = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quit = false;

        while (!quit) {
            System.out.println("\nWelcome to the Chat Application");
            System.out.println("1. Send Message");
            System.out.println("2. View Messages");
            System.out.println("3. Quit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer

            switch (choice) {
                case 1:
                    sendMessage();
                    break;
                case 2:
                    viewMessages();
                    break;
                case 3:
                    quit = true;
                    System.out.println("Exiting Chat Application.");
                    break;
                default:
                    System.out.println("Invalid choice! Please choose a valid option.");
            }
        }
    }

    private static void sendMessage() {
        System.out.print("Enter your message: ");
        String message = scanner.nextLine();
        messages.add(message);
        System.out.println("Message sent: " + message);
    }

    private static void viewMessages() {
        if (messages.isEmpty()) {
            System.out.println("No messages available.");
        } else {
            System.out.println("\nChat History:");
            for (String message : messages) {
                System.out.println(message);
            }
        }
    }
}
