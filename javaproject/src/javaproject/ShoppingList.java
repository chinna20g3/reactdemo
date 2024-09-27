

package javaproject;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {
    private static ArrayList<String> shoppingList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quit = false;
        int choice;

        while (!quit) {
            System.out.println("\nWelcome to the Shopping List App");
            System.out.println("1. Add an item");
            System.out.println("2. Remove an item");
            System.out.println("3. View all items");
            System.out.println("4. Clear the list");
            System.out.println("5. Quit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer

            switch (choice) {
                case 1:
                    addItem();
                    break;
                case 2:
                    removeItem();
                    break;
                case 3:
                    viewItems();
                    break;
                case 4:
                    clearList();
                    break;
                case 5:
                    quit = true;
                    System.out.println("Exiting Shopping List App.");
                    break;
                default:
                    System.out.println("Invalid choice! Please choose a valid option.");
            }
        }
    }

    private static void addItem() {
        System.out.print("Enter an item to add: ");
        String item = scanner.nextLine();
        shoppingList.add(item);
        System.out.println("Item added: " + item);
    }

    private static void removeItem() {
        if (shoppingList.isEmpty()) {
            System.out.println("Shopping list is empty.");
        } else {
            viewItems();
            System.out.print("Enter the item number to remove: ");
            int itemNumber = scanner.nextInt();
            if (itemNumber > 0 && itemNumber <= shoppingList.size()) {
                String removedItem = shoppingList.remove(itemNumber - 1);
                System.out.println("Item removed: " + removedItem);
            } else {
                System.out.println("Invalid item number.");
            }
        }
    }

    private static void viewItems() {
        if (shoppingList.isEmpty()) {
            System.out.println("Shopping list is empty.");
        } else {
            System.out.println("\nYour Shopping List:");
            for (int i = 0; i < shoppingList.size(); i++) {
                System.out.println((i + 1) + ". " + shoppingList.get(i));
            }
        }
    }

    private static void clearList() {
        shoppingList.clear();
        System.out.println("All items have been removed from the shopping list.");
    }
}
