

package javaproject;

import java.util.ArrayList;
import java.util.Scanner;

public class EcommerceWebsite {
    private static ArrayList<String> products = new ArrayList<>();
    private static ArrayList<String> cart = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Sample products
        products.add("Laptop");
        products.add("Smartphone");
        products.add("Headphones");
        products.add("Smartwatch");

        boolean quit = false;
        int choice;

        while (!quit) {
            System.out.println("\nWelcome to the E-Commerce App");
            System.out.println("1. View products");
            System.out.println("2. Add product to cart");
            System.out.println("3. View cart");
            System.out.println("4. Checkout");
            System.out.println("5. Quit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer

            switch (choice) {
                case 1:
                    viewProducts();
                    break;
                case 2:
                    addToCart();
                    break;
                case 3:
                    viewCart();
                    break;
                case 4:
                    checkout();
                    break;
                case 5:
                    quit = true;
                    System.out.println("Exiting E-Commerce App.");
                    break;
                default:
                    System.out.println("Invalid choice! Please choose a valid option.");
            }
        }
    }

    private static void viewProducts() {
        System.out.println("\nAvailable Products:");
        for (int i = 0; i < products.size(); i++) {
            System.out.println((i + 1) + ". " + products.get(i));
        }
    }

    private static void addToCart() {
        viewProducts();
        System.out.print("Enter the product number to add to cart: ");
        int productNumber = scanner.nextInt();
        if (productNumber > 0 && productNumber <= products.size()) {
            cart.add(products.get(productNumber - 1));
            System.out.println("Product added to cart: " + products.get(productNumber - 1));
        } else {
            System.out.println("Invalid product number.");
        }
    }

    private static void viewCart() {
        System.out.println("\nYour Cart:");
        if (cart.isEmpty()) {
            System.out.println("Cart is empty.");
        } else {
            for (int i = 0; i < cart.size(); i++) {
                System.out.println((i + 1) + ". " + cart.get(i));
            }
        }
    }

    private static void checkout() {
        System.out.println("\nCheckout:");
        if (cart.isEmpty()) {
            System.out.println("Your cart is empty. Add products to cart before checking out.");
        } else {
            System.out.println("Thank you for your purchase!");
            cart.clear();
        }
    }
}
