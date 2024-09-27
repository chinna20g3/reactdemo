

package javaproject;

import java.util.ArrayList;
import java.util.Scanner;

public class RestaurantManagement {
    private static ArrayList<MenuItem> menu = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quit = false;

        while (!quit) {
            System.out.println("\nWelcome to the Restaurant Management System");
            System.out.println("1. Add Menu Item");
            System.out.println("2. View Menu");
            System.out.println("3. Remove Menu Item");
            System.out.println("4. Quit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer

            switch (choice) {
                case 1:
                    addMenuItem();
                    break;
                case 2:
                    viewMenu();
                    break;
                case 3:
                    removeMenuItem();
                    break;
                case 4:
                    quit = true;
                    System.out.println("Exiting Restaurant Management System.");
                    break;
                default:
                    System.out.println("Invalid choice! Please choose a valid option.");
            }
        }
    }

    private static void addMenuItem() {
        System.out.print("Enter item name: ");
        String name = scanner.nextLine();
        System.out.print("Enter item price: ");
        double price = scanner.nextDouble();
        menu.add(new MenuItem(name, price));
        System.out.println("Menu item added: " + name);
    }

    private static void viewMenu() {
        if (menu.isEmpty()) {
            System.out.println("No menu items available.");
        } else {
            System.out.println("\nMenu:");
            for (int i = 0; i < menu.size(); i++) {
                MenuItem item = menu.get(i);
                System.out.println((i + 1) + ". " + item.getName() + " - $" + item.getPrice());
            }
        }
    }

    private static void removeMenuItem() {
        if (menu.isEmpty()) {
            System.out.println("No menu items to remove.");
        } else {
            viewMenu();
            System.out.print("Enter the menu item number to remove: ");
            int itemNumber = scanner.nextInt();
            if (itemNumber > 0 && itemNumber <= menu.size()) {
                MenuItem removedItem = menu.remove(itemNumber - 1);
                System.out.println("Removed menu item: " + removedItem.getName());
            } else {
                System.out.println("Invalid item number.");
            }
        }
    }
}

// Helper class for menu item information
class MenuItem {
    private String name;
    private double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
