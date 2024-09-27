
package javaproject;

import java.util.ArrayList;
import java.util.Scanner;

public class TravelBooking {
    private static ArrayList<Booking> bookings = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quit = false;

        while (!quit) {
            System.out.println("\nWelcome to the Travel Booking System");
            System.out.println("1. Book Flight");
            System.out.println("2. View Bookings");
            System.out.println("3. Cancel Booking");
            System.out.println("4. Quit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer

            switch (choice) {
                case 1:
                    bookFlight();
                    break;
                case 2:
                    viewBookings();
                    break;
                case 3:
                    cancelBooking();
                    break;
                case 4:
                    quit = true;
                    System.out.println("Exiting Travel Booking System.");
                    break;
                default:
                    System.out.println("Invalid choice! Please choose a valid option.");
            }
        }
    }

    private static void bookFlight() {
        System.out.print("Enter flight destination: ");
        String destination = scanner.nextLine();
        System.out.print("Enter passenger name: ");
        String passengerName = scanner.nextLine();
        bookings.add(new Booking(destination, passengerName));
        System.out.println("Flight booked to " + destination + " for " + passengerName);
    }

    private static void viewBookings() {
        if (bookings.isEmpty()) {
            System.out.println("No bookings available.");
        } else {
            System.out.println("\nBookings:");
            for (int i = 0; i < bookings.size(); i++) {
                Booking booking = bookings.get(i);
                System.out.println((i + 1) + ". " + booking.getPassengerName() + " - " + booking.getDestination());
            }
        }
    }

    private static void cancelBooking() {
        if (bookings.isEmpty()) {
            System.out.println("No bookings to cancel.");
        } else {
            viewBookings();
            System.out.print("Enter the booking number to cancel: ");
            int bookingNumber = scanner.nextInt();
            if (bookingNumber > 0 && bookingNumber <= bookings.size()) {
                Booking canceledBooking = bookings.remove(bookingNumber - 1);
                System.out.println("Canceled booking for: " + canceledBooking.getPassengerName());
            } else {
                System.out.println("Invalid booking number.");
            }
        }
    }
}

// Helper class for booking information
class Booking {
    private String destination;
    private String passengerName;

    public Booking(String destination, String passengerName) {
        this.destination = destination;
        this.passengerName = passengerName;
    }

    public String getDestination() {
        return destination;
    }

    public String getPassengerName() {
        return passengerName;
    }
}
