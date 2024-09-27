
package javaproject;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagement {
    private static ArrayList<Book> books = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quit = false;
        int choice;

        while (!quit) {
            System.out.println("\nWelcome to the Library Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. View Books");
            System.out.println("4. Quit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    removeBook();
                    break;
                case 3:
                    viewBooks();
                    break;
                case 4:
                    quit = true;
                    System.out.println("Exiting Library Management System.");
                    break;
                default:
                    System.out.println("Invalid choice! Please choose a valid option.");
            }
        }
    }

    private static void addBook() {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter book author: ");
        String author = scanner.nextLine();
        books.add(new Book(title, author));
        System.out.println("Book added: " + title + " by " + author);
    }

    private static void removeBook() {
        if (books.isEmpty()) {
            System.out.println("No books to remove.");
        } else {
            viewBooks();
            System.out.print("Enter the book number to remove: ");
            int bookNumber = scanner.nextInt();
            if (bookNumber > 0 && bookNumber <= books.size()) {
                Book removedBook = books.remove(bookNumber - 1);
                System.out.println("Removed book: " + removedBook.getTitle());
            } else {
                System.out.println("Invalid book number.");
            }
        }
    }

    private static void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            System.out.println("\nBook List:");
            for (int i = 0; i < books.size(); i++) {
                Book book = books.get(i);
                System.out.println((i + 1) + ". " + book.getTitle() + " by " + book.getAuthor());
            }
        }
    }
}

// Helper class for book information
class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
